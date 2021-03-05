package com.ufes.sistema_baseados_em_regras.examplo;

import java.util.Random;

import org.kie.api.runtime.rule.FactHandle;
import org.kie.api.runtime.KieSession;

public class TempSensorWrapper implements Runnable{
	KieSession kSession;
	FactHandle fact;
	
	public TempSensorWrapper(KieSession kSession, FactHandle fact) {
		this.kSession = kSession;
		this.fact = fact;
	}
	
	public void run()
	{
		while (true) {
			try {
				Random rand = new Random();
				
				// Generate randon integers in range 0 to 42
				int valor = rand.nextInt(42);
				System.out.println(valor);
				
				Paciente patricia = (Paciente) kSession.getObject(fact);
				
				patricia.setTemp(valor);
				kSession.update(fact, patricia);
				kSession.fireAllRules();
				
				Thread.sleep(100);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
