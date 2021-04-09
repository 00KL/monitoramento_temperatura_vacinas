package com.ufes.sistema_baseados_em_regras;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.ufes.sistema_baseados_em_regras.entidades.Camara;

public class TempDiminuiWrapper implements Runnable{
	KieSession kSession;
	FactHandle fact;
	float temp = 5;
	
	public TempDiminuiWrapper(KieSession kSession, FactHandle fact) {
		this.kSession = kSession;
		this.fact = fact;
	}
	
	public void run()
	{
		while (true) {
			try {				
	        	Camara camara = (Camara) kSession.getObject(fact); //Pegamos a referencia para o objeto a partir do FactHandle.
	       
				camara.setTempAtual(temp); //Atualizamos sua temperatura.
				kSession.update(fact, camara); //Atualizamos o Fact na sessao. (isso ira desencadear um check nas regras novamente)
				
				temp = (float) (temp - 0.5);
				Thread.sleep(1000); //Aguardamos 1s.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
