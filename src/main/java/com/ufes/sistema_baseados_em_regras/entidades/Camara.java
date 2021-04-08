package com.ufes.sistema_baseados_em_regras.entidades;

import java.util.ArrayList;
import java.util.List;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Camara {
	private String num;
	private float tempAtual;
	private int capacidadeMax; //Iremos usar isso?
	private Local local;
	private List<RegistroIrregularidadeTemp> regIrregularidade = new ArrayList<RegistroIrregularidadeTemp>();
	private List<LoteVacina> lotesvacina = new ArrayList<LoteVacina>();

	public LocalDateTime getAgora() {
		LocalDateTime dt = LocalDateTime.now();
		//SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
		//formato.format(dt);
		return dt;
	}
	
	public List<LoteVacina> getLotesvacina() {
		return lotesvacina;
	}

	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
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
	 * @param primeiroLote 
	 */
	public void armazenarLote(LoteVacina lote) {
		//TODO
		this.lotesvacina.add(lote);
		
	}
	
	/**
	 * Extrair lote de vacina
	 */
	public void extrairLote(LoteVacina lote) {
		this.lotesvacina.remove(lote);
	}

	/*
	public RegistroIrregularidadeTemp getRegIrregularidade(String numReg) {
		RegistroIrregularidadeTemp regSaida = null;
		for (RegistroIrregularidadeTemp reg : regIrregularidade){
			if(reg.getNumReg() == numReg) {
				regSaida = reg;
				break;
			}
		}
		return regSaida;
	}
	*/
	
	public List<RegistroIrregularidadeTemp> getRegIrregularidade(){
		return this.regIrregularidade;
	}

	public void registrarIrregularidade(RegistroIrregularidadeTemp regIrregularidade) {
		this.regIrregularidade.add(regIrregularidade);
	}
	
	public void removerIrregularidade(RegistroIrregularidadeTemp regIrregularidade) {
		this.regIrregularidade.remove(regIrregularidade);
	}

}
