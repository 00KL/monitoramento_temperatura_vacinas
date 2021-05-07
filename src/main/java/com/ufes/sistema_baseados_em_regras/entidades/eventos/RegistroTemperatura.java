package com.ufes.sistema_baseados_em_regras.entidades.eventos;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;
import org.kie.api.definition.type.Timestamp;


@Role(Role.Type.EVENT)
public class RegistroTemperatura extends Evento {
    
    private double temp;
    private String numCamara;
    
    public String getNumCamara() {
		return numCamara;
	}

	public void setCamara(String numCamara) {
		this.numCamara = numCamara;
	}

	public RegistroTemperatura(String numCamara, double temp) {
        super();
        this.temp = temp;
        this.numCamara = numCamara;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
