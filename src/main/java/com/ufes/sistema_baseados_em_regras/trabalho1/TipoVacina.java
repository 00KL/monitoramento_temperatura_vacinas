package com.ufes.sistema_baseados_em_regras.trabalho1;

public class TipoVacina {
	private String codigoIdentificacao;
	private String nome;
	private float tempMin;
	private float tempMax;
	private int tempoMaxAcimaTempIdeal;
	private int tempoMaximoAbaixoTempIdeal;
	
	
	public TipoVacina(String codigoIdentificacao, String nome, float tempMin, float tempMax, int tempoMaxAcimaTempIdeal,
			int tempoMaximoAbaixoTempIdeal) {
		this.codigoIdentificacao = codigoIdentificacao;
		this.nome = nome;
		this.tempMin = tempMin;
		this.tempMax = tempMax;
		this.tempoMaxAcimaTempIdeal = tempoMaxAcimaTempIdeal;
		this.tempoMaximoAbaixoTempIdeal = tempoMaximoAbaixoTempIdeal;
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
	public float getTempMin() {
		return tempMin;
	}
	public void setTempMin(float tempMin) {
		this.tempMin = tempMin;
	}
	public float getTempMax() {
		return tempMax;
	}
	public void setTempMax(float tempMax) {
		this.tempMax = tempMax;
	}
	public int getTempoMaxAcimaTempIdeal() {
		return tempoMaxAcimaTempIdeal;
	}
	public void setTempoMaxAcimaTempIdeal(int tempoMaxAcimaTempIdeal) {
		this.tempoMaxAcimaTempIdeal = tempoMaxAcimaTempIdeal;
	}
	public int getTempoMaximoAbaixoTempIdeal() {
		return tempoMaximoAbaixoTempIdeal;
	}
	public void setTempoMaximoAbaixoTempIdeal(int tempoMaximoAbaixoTempIdeal) {
		this.tempoMaximoAbaixoTempIdeal = tempoMaximoAbaixoTempIdeal;
	}
	
	
}
