package com.ufes.sistema_baseados_em_regras.examplo;

public class Paciente {
	private String CPF;
	private String nome;
	private float temp;
	
	public Paciente(String CPF, String nome, float temp) {
		this.CPF = CPF;
		this.nome = nome;
		this.temp = temp;
	}
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	
	public void sendMsg(String msg) {
		System.out.println(msg);
	}
	
	
}
