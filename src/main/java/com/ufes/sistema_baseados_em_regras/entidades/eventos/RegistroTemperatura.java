package com.ufes.sistema_baseados_em_regras.entidades.eventos;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Timestamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ufes.sistema_baseados_em_regras.entidades.Camara;

@Timestamp("time")
@Expires("20s")
public class RegistroTemperatura extends Evento {
    
    @JsonProperty
    private double temp;
    @JsonProperty
    private Camara camara;
    
    public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public RegistroTemperatura(Camara camara, double temp) {
        super();
        this.temp = temp;
        this.camara = camara;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
