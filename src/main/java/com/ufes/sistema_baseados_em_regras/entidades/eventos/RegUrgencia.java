package com.ufes.sistema_baseados_em_regras.entidades.eventos;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;
import org.kie.api.definition.type.Timestamp;

import com.ufes.sistema_baseados_em_regras.entidades.Gestor;
import com.ufes.sistema_baseados_em_regras.entidades.RegistroIrregularidadeTemp;

import jakarta.json.bind.annotation.JsonbTransient;

@Role(Role.Type.EVENT)
public class RegUrgencia extends Evento {
	
	private RegistroIrregularidadeTemp reg;
	private Gestor gestor;
	private boolean finalizado;
	private boolean descartado;
	
	public boolean isDescartado() {
		return descartado;
	}

	public void setDescartado() {
		this.descartado = true;
		this.finalizado = true;
	}

	public boolean isFinalizado() {
		return finalizado;
	}

	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}

	public RegUrgencia(RegistroIrregularidadeTemp reg, Gestor gestor) {
		super();
		this.reg = reg;
		this.gestor = gestor;
		this.finalizado = false;
	}
	
	public RegistroIrregularidadeTemp getReg() {
		return reg;
	}
	public void setReg(RegistroIrregularidadeTemp reg) {
		this.reg = reg;
	}
	public Gestor getGestor() {
		return gestor;
	}
	public void setGestor(Gestor gestor) {
		this.gestor = gestor;
	}
	
}
