package com.ufes.sistema_baseados_em_regras.entidades;

import java.util.Date;

public class RegistroLoteVacinaCamara {
	private String numReg;
	private Date dataReg;
	private Camara camara;
	private LoteVacina loteVacina;
		
	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public LoteVacina getLoteVacina() {
		return loteVacina;
	}

	public void setLoteVacina(LoteVacina loteVacina) {
		this.loteVacina = loteVacina;
	}

	public RegistroLoteVacinaCamara(String numReg, Date dataReg, Date dataRetirada) {
		this.numReg = numReg;
		this.dataReg = dataReg;
		this.dataRetirada = dataRetirada;
	}
	
	public String getNumReg() {
		return numReg;
	}
	public void setNumReg(String numReg) {
		this.numReg = numReg;
	}
	public Date getDataReg() {
		return dataReg;
	}
	public void setDataReg(Date dataReg) {
		this.dataReg = dataReg;
	}
	public Date getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	private Date dataRetirada;
}
