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
        	
        	//Inicializar localizações
        	Local local1 = new Local("local1",1.2, 1.2);
        	Local local2 = new Local("local2",1.3, 1.3);
        	Local local3 = new Local("local3",1.4, 1.4);
        	Local local4 = new Local("local4",16.76, 345.6345);
        	
        	//Inicializar camaras
        	Camara camara1 = new Camara("0001", 30); //Criamos um camara sem temperatura.
        	camara1.setLocal(local1);
        	
        	//Inserir lotes de vacinas na camara 1
        	//PARA O TIPO DE VACINA, TEMPOS LIMITES S�O DADOS EM SEGUNDOS!
        	TipoVacina butantan = new TipoVacina("pfizer","Butantan", 2, 8, 60*60, 0.1*60);
        	LoteVacina primeiroLote = new LoteVacina("123", LocalDateTime.of(2020,  Month.APRIL, 29, 0,0,0), LocalDateTime.of(2021,  Month.MAY, 29, 0,0,0));
        	primeiroLote.setTipoVacina(butantan);
        	camara1.armazenarLote(primeiroLote);
        	TipoVacina oxford = new TipoVacina("5151","Oxford", -1, 10, 60*60, 120*60);
        	LoteVacina segundoLote = new LoteVacina("312", LocalDateTime.of(2020,  Month.APRIL, 29, 0,0,0), LocalDateTime.of(2021,  Month.JANUARY, 29, 0,0,0));
        	segundoLote.setTipoVacina(oxford);
        	camara1.armazenarLote(segundoLote);
        	
        	//Inserir camara1 na KieSession.
        	FactHandle fato = kSession.insert(camara1); 
        	
        	//Threads das Camaras
        	Thread threadCamara1 = new Thread( new TempSensorWrapper(kSession, fato)); //Criamos uma thread que cuidar� da temperatura dessa camara.
        	threadCamara1.start(); //Iniciamos a thread.
        	
        	//Inserir gestor na KieSession
        	Gestor lucas = new Gestor("Lucas", "435", 23);
        	lucas.setLocal(local2);
        	kSession.insert(lucas);
        	
        	Gestor pedro = new Gestor("Pedro", "436", 24);
        	pedro.setLocal(local3);
        	kSession.insert(pedro);
        	
        	Gestor fulano = new Gestor("Fulano", "437", 25);
        	fulano.setLocal(local4);
        	kSession.insert(fulano);
        	
        	camara1.addGestor(fulano);
        	camara1.addGestor(lucas);
        	camara1.addGestor(pedro);
        	
        	
        	kSession.fireUntilHalt();//Iniciamos os checks das regras indefinidamente (at� for�ar a parada do sistema).
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
