package com.wyden.banco.models;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String cpf;
	private String nome;
	private List<ContaCorrente> contas;

	public Cliente() {
		contas = new ArrayList<>();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<ContaCorrente> getContas() {
		return contas;
	}

	public void setContas(List<ContaCorrente> contas) {
		this.contas = contas;
	}

}
