package com.ufes.sistema_baseados_em_regras.trabalho1;

import java.time.LocalDateTime;

public class LogMudancasCamara {
	private String numReg;
	private LocalDateTime horaLog;
	private String CPF;
	private String NumCamara;
	
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
