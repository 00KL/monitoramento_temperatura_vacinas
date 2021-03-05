package com.ufes.sistema_baseados_em_regras.entidades;
import java.util.Date;

public class LoteVacina {
	private String numeroSerial;
	private Date dataFabricacao;
	private Date dataValidade;
	private TipoVacina tipoVacina;
	
	
	public TipoVacina getTipoVacina() {
		return tipoVacina;
	}

	public void setTipoVacina(TipoVacina tipoVacina) {
		this.tipoVacina = tipoVacina;
	}

	public LoteVacina(String numeroSerial, Date dataFabricacao, Date dataValidade) {
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
	public Date getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

}
