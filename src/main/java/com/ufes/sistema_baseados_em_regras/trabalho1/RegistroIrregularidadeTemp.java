package com.ufes.sistema_baseados_em_regras.trabalho1;

import java.time.LocalDateTime;

public class RegistroIrregularidadeTemp {
	private String numReg;
	private tipoIrregularidade tipoIrregularidade;
	private LocalDateTime horaInicio;
	private LocalDateTime horaTermino;
	
	public RegistroIrregularidadeTemp(String numReg,
			com.ufes.sistema_baseados_em_regras.trabalho1.tipoIrregularidade tipoIrregularidade,
			LocalDateTime horaInicio, LocalDateTime horaTermino) {
		this.numReg = numReg;
		this.tipoIrregularidade = tipoIrregularidade;
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
	public tipoIrregularidade getTipoIrregularidade() {
		return tipoIrregularidade;
	}
	public void setTipoIrregularidade(tipoIrregularidade tipoIrregularidade) {
		this.tipoIrregularidade = tipoIrregularidade;
	}

}
