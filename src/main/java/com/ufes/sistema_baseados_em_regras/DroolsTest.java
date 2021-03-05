package com.ufes.sistema_baseados_em_regras;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.ufes.sistema_baseados_em_regras.entidades.Camara;

public class DroolsTest {
	public static final void main(String[] args) {
        try {
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	Camara pedro = new Camara("0001", 30); //Criamos um camara sem temperatura.
        	FactHandle fato = kSession.insert(pedro); //Inserimos ela na KieSession.
        	
        	Thread t1 = new Thread( new TempSensorWrapper(kSession, fato)); //Criamos uma thread que cuidará da temperatura dessa camara.
        	t1.start(); //Iniciamos a thread.
        	
        	kSession.fireUntilHalt();//Iniciamos os checks das regras indefinidamente (até forçar a parada do sistema).
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
