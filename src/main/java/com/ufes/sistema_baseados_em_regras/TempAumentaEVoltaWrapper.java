package com.ufes.sistema_baseados_em_regras;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.ufes.sistema_baseados_em_regras.entidades.Camara;

public class TempAumentaEVoltaWrapper implements Runnable{
	KieSession kSession;
	FactHandle fact;
	double temp = 3;
	double steps = 0.5;
	int sleepTime = 600;
	
	public TempAumentaEVoltaWrapper(KieSession kSession, FactHandle fact) {
		this.kSession = kSession;
		this.fact = fact;
	}
	
	public void run()
	{
		while (true) {
			try {				
	        	Camara camara = (Camara) kSession.getObject(fact); //Pegamos a referencia para o objeto a partir do FactHandle.
	       
				camara.setTempAtual((float) temp); //Atualizamos sua temperatura.
				kSession.update(fact, camara); //Atualizamos o Fact na sessao. (isso ira desencadear um check nas regras novamente)
				
				temp = temp + steps;
				if(temp > 15 || temp < -1) {
					steps = (-1) * steps; //Temperatura aumenta at� 15 e depois come�a a diminuir.
					sleepTime = 100;
				}
				
				kSession.fireAllRules();
				Thread.sleep(sleepTime); //Aguardamos 1s.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}