package com.ufes.sistema_baseados_em_regras.entidades.eventos;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Timestamp;

import com.ufes.sistema_baseados_em_regras.entidades.Gestor;
import com.ufes.sistema_baseados_em_regras.entidades.RegistroIrregularidadeTemp;

@Timestamp("time")
@Expires("20s")
public class RegUrgencia extends Evento {
	private RegistroIrregularidadeTemp reg;
	private Gestor gestor;
	
	public RegUrgencia(RegistroIrregularidadeTemp reg, Gestor gestor) {
		super();
		this.reg = reg;
		this.gestor = gestor;
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
