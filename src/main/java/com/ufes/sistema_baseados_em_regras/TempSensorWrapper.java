package com.ufes.sistema_baseados_em_regras;

import org.kie.api.runtime.rule.FactHandle;

import com.ufes.sistema_baseados_em_regras.entidades.Camara;

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
		        TempApi.CamaraInfo info = TempApi.buscarInfo(); //Consultamos as informa��es partindo de uma api.
				
		        if(info != null) { //Se a API retornar corretamente, fazemos o update.
		        	Camara camara = (Camara) kSession.getObject(fact); //Pegamos a referencia para o objeto a partir do FactHandle.
		       
					camara.setTempAtual(info.getTemp()); //Atualizamos sua temperatura.
					kSession.update(fact, camara); //Atualizamos o Fact na sess�o. (isso ir� desencadear um check nas regras novamente)
					kSession.fireAllRules();
		        }
				
				Thread.sleep(3000); //Aguardamos 3s.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
