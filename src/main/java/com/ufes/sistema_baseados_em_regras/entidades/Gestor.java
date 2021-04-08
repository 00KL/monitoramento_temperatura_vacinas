package com.ufes.sistema_baseados_em_regras.entidades;

public class Gestor {
	private String nome;
	private String CPF;
	private int idade;
	private Local local;
	

	public Gestor(String nome, String cPF, int idade) {
		super();
		this.nome = nome;
		this.CPF = cPF;
		this.idade = idade;
		
	}
	public Local getLocal() {
		return local;
	}
	
	public void setLocal(Local local) {
		this.local = local;
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
	public void sendMessage(String s) {
		System.out.print("Gestor " + this.nome + " recebeu mensagem: ");
		System.out.println(s);
	}
	
	
}
