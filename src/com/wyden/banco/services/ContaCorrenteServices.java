package com.wyden.banco.services;

import com.wyden.banco.models.ContaCorrente;

public class ContaCorrenteServices {

	public static void criar() {

	}

	public static void ler() {

	}

	public static void depositar(ContaCorrente conta, double valor) {
		conta.setSaldo(conta.getSaldo() + valor);
	}

	public static void sacar(ContaCorrente conta, double valor) {
		conta.setSaldo(conta.getSaldo() - valor);
	}

}
