package com.ufes.sistema_baseados_em_regras.trabalho1;
import java.util.Date;

public class LoteVacina {
	private String numeroSerial;
	private Date dataFabricacao;
	private Date dataValidade;
	
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
