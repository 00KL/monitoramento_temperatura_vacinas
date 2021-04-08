package com.ufes.sistema_baseados_em_regras.entidades;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;;

public class TipoVacina {
	private String codigoIdentificacao;
	private String nome;
	private double tempMin;
	private double tempMax;
	private double tempoMaxAcimaTempIdeal;
	private double tempoMaxAbaixoTempIdeal;
	
	
	public TipoVacina(String codigoIdentificacao, String nome, double tempMin, double tempMax, double tempoMaxAcimaTempIdeal,
			double tempoMaxAbaixoTempIdeal) {
		this.codigoIdentificacao = codigoIdentificacao;
		this.nome = nome;
		this.tempMin = tempMin;
		this.tempMax = tempMax;
		this.tempoMaxAcimaTempIdeal = tempoMaxAcimaTempIdeal;
		this.tempoMaxAbaixoTempIdeal = tempoMaxAbaixoTempIdeal;
	}
	
	public String getCodigoIdentificacao() {
		return codigoIdentificacao;
	}
	public void setCodigoIdentificacao(String codigoIdentificacao) {
		this.codigoIdentificacao = codigoIdentificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getTempMin() {
		return tempMin;
	}
	public void setTempMin(double tempMin) {
		this.tempMin = tempMin;
	}
	public double getTempMax() {
		return tempMax;
	}
	public void setTempMax(double tempMax) {
		this.tempMax = tempMax;
	}
	public double getTempoMaxAcimaTempIdeal() {
		return tempoMaxAcimaTempIdeal;
	}
	public void setTempoMaxAcimaTempIdeal(double tempoMaxAcimaTempIdeal) {
		this.tempoMaxAcimaTempIdeal = tempoMaxAcimaTempIdeal;
	}
	public double getTempoMaxAbaixoTempIdeal() {
		return tempoMaxAbaixoTempIdeal;
	}
	public void setTempoMaxAbaixoTempIdeal(double tempoMaximoAbaixoTempIdeal) {
		this.tempoMaxAbaixoTempIdeal = tempoMaximoAbaixoTempIdeal;
	}
}
