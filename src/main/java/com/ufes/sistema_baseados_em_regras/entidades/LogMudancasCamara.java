package com.ufes.sistema_baseados_em_regras.entidades;

import java.time.LocalDateTime;

public class LogMudancasCamara {
	private String numReg;
	private LocalDateTime horaLog;
	private String CPF;
	private String NumCamara;
	private Gestor gestor;
	private Camara camara;
	
	public Gestor getGestor() {
		return gestor;
	}

	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public LogMudancasCamara(String numReg, LocalDateTime horaLog, String cPF, String numCamara) {
		this.numReg = numReg;
		this.horaLog = horaLog;
		CPF = cPF;
		NumCamara = numCamara;
	}
	
	public String getNumReg() {
		return numReg;
	}
	public void setNumReg(String numReg) {
		this.numReg = numReg;
	}
	public LocalDateTime getHoraLog() {
		return horaLog;
	}
	public void setHoraLog(LocalDateTime horaLog) {
		this.horaLog = horaLog;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNumCamara() {
		return NumCamara;
	}
	public void setNumCamara(String numCamara) {
		NumCamara = numCamara;
	}
}
