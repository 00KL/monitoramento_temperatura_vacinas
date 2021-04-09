package com.ufes.sistema_baseados_em_regras;


import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.ufes.sistema_baseados_em_regras.entidades.Camara;
import com.ufes.sistema_baseados_em_regras.entidades.LoteVacina;
import com.ufes.sistema_baseados_em_regras.entidades.TipoVacina;
import com.ufes.sistema_baseados_em_regras.entidades.Gestor;
import com.ufes.sistema_baseados_em_regras.entidades.Local;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Month;

public class DroolsTest {
	public static final void main(String[] args) {
        try {
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	//Inicializar localizacoes
        	Local localCamara1 = new Local("local1",1.2, 1.2);
        	Local local2 = new Local("local2",1.3, 1.3);
        	Local local3 = new Local("local3",1.4, 1.4);
        	Local local4 = new Local("local4",16.76, 75.6345);
        	Local localCamara2 = new Local("local5",18.96, 85.6);
        	Local localCamara3 = new Local("local6", -38.0, -115.0);
        	
        	//Inicializar camaras
        	Camara camara1 = new Camara("0001", 30); //Criamos um camara sem temperatura.
        	camara1.setLocal(localCamara1);
        	Camara camara2 = new Camara("0002", 30);
        	camara2.setLocal(localCamara2);
        	Camara camara3 = new Camara("0015", 30);
        	camara3.setLocal(localCamara3);
        	
        	//Tipos de vacina
        	//PARA O TIPO DE VACINA, TEMPOS LIMITES SAO DADOS EM SEGUNDOS!
        	TipoVacina butantan = new TipoVacina("pfizer","Butantan", 2, 8, 30, 5);
        	TipoVacina oxford = new TipoVacina("5151","Oxford", -1, 10, 20, 10);
        	
        	//Lotes
        	LoteVacina primeiroLote = new LoteVacina("123", LocalDateTime.of(2020,  Month.APRIL, 29, 0,0,0), LocalDateTime.of(2021,  Month.MAY, 29, 0,0,0));
        	primeiroLote.setTipoVacina(butantan);
        	LoteVacina segundoLote = new LoteVacina("312", LocalDateTime.of(2020,  Month.APRIL, 29, 0,0,0), LocalDateTime.of(2021,  Month.JANUARY, 29, 0,0,0));
        	segundoLote.setTipoVacina(oxford);
        	LoteVacina lote3 = new LoteVacina("ZK2", LocalDateTime.of(2020,  Month.APRIL, 29, 0,0,0), LocalDateTime.of(2021,  Month.JUNE, 1, 0,0,0));
        	lote3.setTipoVacina(oxford);
        	LoteVacina lote4 = new LoteVacina("LC3", LocalDateTime.now(), LocalDateTime.now().plusSeconds(40));
        	lote4.setTipoVacina(butantan);
        	
        	//Gestores
        	Gestor lucas = new Gestor("Lucas", "435", 23);
        	lucas.setLocal(local2);
        	Gestor pedro = new Gestor("Pedro", "436", 24);
        	pedro.setLocal(local3);
        	Gestor fulano = new Gestor("Fulano", "437", 25);
        	fulano.setLocal(local4);
        	
        	//Cadastrando gestores e lotes nas camaras e inserindo-as na KisSession
        	//CAMARA 1
        	camara1.addGestor(lucas);
        	camara1.addGestor(pedro);
        	camara1.addGestor(fulano);
        	camara1.armazenarLote(primeiroLote);
        	camara1.armazenarLote(segundoLote);
        	FactHandle fato = kSession.insert(camara1); //Inserir camara1 na KieSession. 
        	Thread threadCamara1 = new Thread( new TempSensorWrapper(kSession, fato)); //Criamos uma thread que cuida da temperatura dessa camara.
        	threadCamara1.start(); //Iniciamos a thread.
        	//CAMARA 2        	
        	camara2.addGestor(lucas);
        	camara2.addGestor(pedro);
        	camara2.addGestor(fulano);
        	camara2.armazenarLote(lote3);
        	FactHandle fato2 = kSession.insert(camara2); //Inserir camara2 na KieSession. 
        	Thread threadCamara2 = new Thread( new TempDiminuiWrapper(kSession, fato2)); //Criamos uma thread que cuida da temperatura dessa camara.
        	threadCamara2.start(); //Iniciamos a thread.
        	//CAMARA 3
        	camara3.addGestor(lucas);
        	camara3.addGestor(pedro);
        	camara3.addGestor(fulano);
        	camara3.armazenarLote(lote4);
        	FactHandle fato3 = kSession.insert(camara3); //Inserir camara2 na KieSession. 
        	Thread threadCamara3 = new Thread( new TempAumentaEVoltaWrapper(kSession, fato3)); //Criamos uma thread que cuida da temperatura dessa camara.
        	threadCamara3.start(); //Iniciamos a thread.
        	
        	kSession.fireUntilHalt();//Iniciamos os checks das regras indefinidamente (ate forcar a parada do sistema).
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
