package com.ufes.sistema_baseados_em_regras.entidades.eventos;

import com.ufes.sistema_baseados_em_regras.entidades.Camara;

public class RegDefeito extends Evento{
	private Camara camara;
	
	public RegDefeito(Camara camara) {
		super();
		this.camara = camara;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	
}
