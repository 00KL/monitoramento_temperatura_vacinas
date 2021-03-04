package com.ufes.sistema_baseados_em_regras.trabalho1;

public class Gestor {
	private String nome;
	private String CPF;
	private int idade;
	
	public Gestor(String nome, String cPF, int idade) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
