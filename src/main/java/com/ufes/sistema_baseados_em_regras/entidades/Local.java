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
	
	public double dist(Local outroLocal) {
		double R = 6371e3; //raio da terra em metros
		double phi1 = this.latitude * Math.PI/180; // phi, lambda in radians
		double phi2 = outroLocal.latitude * Math.PI/180;
		double deltaPhi = (outroLocal.latitude-this.latitude) * Math.PI/180;
		double deltaLambda = (outroLocal.longitude-this.longitude) * Math.PI/180;

		double a = Math.sin(deltaPhi/2) * Math.sin(deltaPhi/2) +
		Math.cos(phi1) * Math.cos(phi2) *
		Math.sin(deltaLambda/2) * Math.sin(deltaLambda/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

		double d = R * c; // in metre
		return d;
		
	}

	

	
	

}
