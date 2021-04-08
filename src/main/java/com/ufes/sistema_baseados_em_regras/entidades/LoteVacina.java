package com.ufes.sistema_baseados_em_regras.entidades;

import java.time.LocalDateTime;

public class LoteVacina {
	private String numeroSerial;
	private LocalDateTime dataFabricacao;
	private LocalDateTime dataValidade;
	private TipoVacina tipoVacina;
	private boolean perigoTemperatura = false;
	
	public boolean isPerigoTemperatura() {
		return perigoTemperatura;
	}

	public void setPerigoTemperatura(boolean perigoTemperatura) {
		this.perigoTemperatura = perigoTemperatura;
	}

	public LocalDateTime getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDateTime dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public LocalDateTime getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDateTime dataValidade) {
		this.dataValidade = dataValidade;
	}

	public TipoVacina getTipoVacina() {
		return tipoVacina;
	}

	public void setTipoVacina(TipoVacina tipoVacina) {
		this.tipoVacina = tipoVacina;
	}

	public LoteVacina(String numeroSerial, LocalDateTime dataFabricacao, LocalDateTime dataValidade) {
		this.numeroSerial = numeroSerial;
		this.dataFabricacao = dataFabricacao;
		this.dataValidade = dataValidade;
	}
	
	public String getNumeroSerial() {
		return numeroSerial;
	}
	public void setNumeroSerial(String numeroSerial) {
		this.numeroSerial = numeroSerial;
	}
	

}
