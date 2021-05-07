package com.ufes.sistema_baseados_em_regras.entidades.eventos;

import org.kie.api.definition.type.Role;

import com.ufes.sistema_baseados_em_regras.entidades.Camara;
import com.ufes.sistema_baseados_em_regras.entidades.LoteVacina;

@Role(Role.Type.EVENT)
public class RegTempPerigo extends Evento{
	private float temp;
	private Camara camara;
	private LoteVacina lote;
	
	public RegTempPerigo(float temp, Camara camara, LoteVacina lote) {
		super();
		this.temp = temp;
		this.camara = camara;
		this.setLote(lote);
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public LoteVacina getLote() {
		return lote;
	}

	public void setLote(LoteVacina lote) {
		this.lote = lote;
	}
}
