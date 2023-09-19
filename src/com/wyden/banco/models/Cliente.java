package com.wyden.banco.models;

import java.util.List;

public class Cliente {

	private String nome;
	private String fone;
	private List<ContaCorrente> contas_correntes;

	public Cliente() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public List<ContaCorrente> getContas_correntes() {
		return contas_correntes;
	}

	public void setContas_correntes(List<ContaCorrente> contas_correntes) {
		this.contas_correntes = contas_correntes;
	}

}
