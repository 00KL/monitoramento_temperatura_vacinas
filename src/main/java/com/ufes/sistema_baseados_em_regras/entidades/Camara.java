package com.ufes.sistema_baseados_em_regras.entidades;

public class Camara {
	private String num;
	private float tempAtual;
	private int capacidadeMax;
	
	
	public Camara(String num, float tempAtual, int capacidadeMax) {
		this.num = num;
		this.tempAtual = tempAtual;
		this.capacidadeMax = capacidadeMax;
	}
	public Camara(String num, int capacidadeMax) {
		this.num = num;
		this.capacidadeMax = capacidadeMax;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public float getTempAtual() {
		return tempAtual;
	}
	public void setTempAtual(float tempAtual) {
		this.tempAtual = tempAtual;
	}
	public int getCapacidadeMax() {
		return capacidadeMax;
	}
	public void setCapacidadeMax(int capacidadeMax) {
		this.capacidadeMax = capacidadeMax;
	}
	
	public void regTemp(float temp) {
		//TODO
	}
	/**
	 * Notificar gestores proximos irregularidades grave na temperatura
	 */
	public void notificarIrregulariadeGrave() {
		//TODO 	
	}
	/**
	 * Notificar todos gestores de possiveis irregularidades na temperatura
	 */
	public void notificarIrregulariadeGeral() {
		//TODO 
		
	}
	/**
	 * Notifica descarte recomendado de vacina
	 */
	public void notificarDescarteVacina() {
		//TODO
	}
	/**
	 * Manipular temperatura de uma câmara
	 */
	public void manipularTemperatura() {
		//TODO
	}
	/**
	 * Armazenar lote de vacina
	 */
	public void armazenarLote() {
		//TODO
	}
	/**
	 * Extrair lote de vacina
	 */
	public void extrairLote() {
		//TODO
	}
	

}
