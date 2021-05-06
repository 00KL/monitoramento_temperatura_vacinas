package com.ufes.sistema_baseados_em_regras.entidades.eventos;

import org.codehaus.jackson.annotate.JsonProperty;

public class RegistroTemperatura extends Evento {
	
	@JsonProperty
	private double temp;
	
	public RegistroTemperatura(double temp) {
		super();
		this.temp = temp;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
}
