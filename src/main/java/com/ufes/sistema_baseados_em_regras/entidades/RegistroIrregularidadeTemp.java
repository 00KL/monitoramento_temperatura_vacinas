package com.ufes.sistema_baseados_em_regras.entidades;

import java.time.LocalDateTime;

public class RegistroIrregularidadeTemp {
	private String numReg;
	private TipoIrregularidade TipoIrregularidade;
	private LocalDateTime horaInicio;
	private LocalDateTime horaTermino;
	private Camara camara;
	
	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public RegistroIrregularidadeTemp(String numReg,
			com.ufes.sistema_baseados_em_regras.entidades.TipoIrregularidade TipoIrregularidade,
			LocalDateTime horaInicio, LocalDateTime horaTermino) {
		this.numReg = numReg;
		this.TipoIrregularidade = TipoIrregularidade;
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
	}
	
	public String getNumReg() {
		return numReg;
	}
	public void setNumReg(String numReg) {
		this.numReg = numReg;
	}
	public LocalDateTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalDateTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public LocalDateTime getHoraTermino() {
		return horaTermino;
	}
	public void setHoraTermino(LocalDateTime horaTermino) {
		this.horaTermino = horaTermino;
	}
	public TipoIrregularidade getTipoIrregularidade() {
		return TipoIrregularidade;
	}
	public void setTipoIrregularidade(TipoIrregularidade TipoIrregularidade) {
		this.TipoIrregularidade = TipoIrregularidade;
	}

}
