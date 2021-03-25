package com.ufes.sistema_baseados_em_regras;


import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.ufes.sistema_baseados_em_regras.entidades.Camara;
import com.ufes.sistema_baseados_em_regras.entidades.LoteVacina;
import com.ufes.sistema_baseados_em_regras.entidades.TipoVacina;

import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DroolsTest {
	public static final void main(String[] args) {
        try {
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	Camara pedro = new Camara("0001", 30); //Criamos um camara sem temperatura.
        	
        	//TODO Criar lotes de vacina e colocar eles na camara
        	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        	
        	
        	TipoVacina butantan = new TipoVacina("pfizer","Butantan", 2, 8, 60, 120);
        	LoteVacina primeiroLote = new LoteVacina("123", sdf.parse("02/02/2020"), sdf.parse("02/04/2020"));
        	primeiroLote.setTipoVacina(butantan);
        	pedro.armazenarLote(primeiroLote);
        	FactHandle fato = kSession.insert(pedro); //Inserimos ela na KieSession.
        	
        	Thread t1 = new Thread( new TempSensorWrapper(kSession, fato)); //Criamos uma thread que cuidar� da temperatura dessa camara.
        	t1.start(); //Iniciamos a thread.
        	
        	kSession.fireUntilHalt();//Iniciamos os checks das regras indefinidamente (at� for�ar a parada do sistema).
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
