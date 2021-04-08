package com.ufes.sistema_baseados_em_regras.entidades;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import com.ufes.sistema_baseados_em_regras.entidades.TipoIrregularidade;

public class RegistroIrregularidadeTemp {
	private String numReg;
	private TipoIrregularidade tipoIrregularidade;
	private LocalDateTime horaInicio;
	private LocalDateTime horaTermino;
	private Camara camara;
	private LoteVacina lote;
	
	public LoteVacina getLote() {
		return lote;
	}

	public void setLote(LoteVacina lote) {
		this.lote = lote;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public RegistroIrregularidadeTemp(Camara camara, LoteVacina lote, TipoIrregularidade tipoIrregularidade) {
		this.camara = camara;
		this.lote = lote;
		this.tipoIrregularidade = tipoIrregularidade;
		this.horaInicio = LocalDateTime.now();
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
		return tipoIrregularidade;
	}
	public void setTipoIrregularidade(TipoIrregularidade tipoIrregularidade) {
		this.tipoIrregularidade = tipoIrregularidade;
	}
	
	public double diferencaEmSegundos(LocalDateTime data1, LocalDateTime data2) {
		long minutes = LocalDateTime.from(data1).until(data2, ChronoUnit.SECONDS);
		return (double)minutes;
	}

}
