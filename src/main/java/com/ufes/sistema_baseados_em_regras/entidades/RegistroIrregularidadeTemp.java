package com.ufes.sistema_baseados_em_regras.entidades;

import java.time.LocalDateTime;
import com.ufes.sistema_baseados_em_regras.entidades.TipoIrregularidade;

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

	public RegistroIrregularidadeTemp(TipoIrregularidade tipoIrregularidade,
			LocalDateTime horaInicio) {
		this.TipoIrregularidade = tipoIrregularidade;
		this.horaInicio = horaInicio;
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
