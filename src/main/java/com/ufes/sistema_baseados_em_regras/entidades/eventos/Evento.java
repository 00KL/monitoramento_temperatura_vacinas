package com.ufes.sistema_baseados_em_regras.entidades.eventos;

import java.time.LocalDateTime;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;
import org.kie.api.definition.type.Role;
import org.kie.api.definition.type.Timestamp;



@Role(Role.Type.EVENT)
@Timestamp("time")
public class Evento {
	
//	private LocalDateTime duracao;
	@JsonProperty
	Date time;
	@JsonProperty("time_milli")
	double timeMilli;	
	
	public Evento() {
		super();
		this.time = new Date();
		this.timeMilli = this.time.getTime();
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public double getTimeMilli() {
		return timeMilli;
	}

	public void setTimeMilli(double timeMilli) {
		this.timeMilli = timeMilli;
	}
	

//	public LocalDateTime getDuracao() {
//		return duracao;
//	}
//
//	public void setDuracao(LocalDateTime duracao) {
//		this.duracao = duracao;
//	}

}
