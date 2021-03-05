package com.ufes.sistema_baseados_em_regras.entidades;

import java.util.Date;

public class RegistroVacinaCamara {
	private String numReg;
	private Date dataReg;
		
	public RegistroVacinaCamara(String numReg, Date dataReg, Date dataRetirada) {
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
