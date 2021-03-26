package com.ufes.sistema_baseados_em_regras.entidades;

public class Local {
	private String nome;
	private Double longitude;
	private Double latitude;
	
	public void notificarDispositivosProximos() {
		//TODO
		
	}
	
	public Local(String nome, Double longitude, Double latitude) {
		super();
		this.nome = nome;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	

	
	

}
