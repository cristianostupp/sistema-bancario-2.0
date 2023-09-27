package com.wyden.banco.services;

import java.util.HashMap;
import java.util.Scanner;

import com.wyden.banco.models.Cliente;
import com.wyden.banco.models.ContaCorrente;

public class ContaCorrenteServices {

	static Scanner scanner = new Scanner(System.in);

	public static ContaCorrente criar() {

		ContaCorrente objContaCorrente = new ContaCorrente();

		System.out.print("Número da conta: ");
		objContaCorrente.setNumero(scanner.nextLine());

		System.out.print("Saldo inicial da conta: ");
		objContaCorrente.setSaldo(scanner.nextDouble());

		System.out.print("Tarifa bancária da conta: ");
		objContaCorrente.setTarifa(scanner.nextFloat());

		return objContaCorrente;

	}

	public static void criar(HashMap<String, Cliente> clientes) {

		Cliente objCliente = ClienteServices.ler(clientes);

		if (objCliente != null) {

			scanner = new Scanner(System.in);
			ContaCorrente objContaCorrente = criar();

			if (objContaCorrente != null)
				objCliente.getContas().add(objContaCorrente);

		}

	}

	public static void ler() {

	}

	public static void listarContasDeUmCliente(Cliente cliente) {

		if (cliente != null) 
			if (cliente.getContas().size() > 0) {
				System.out.println("Conta(s):");
				for (ContaCorrente cadaConta : cliente.getContas())
					System.out.println("Número: " + cadaConta.getNumero());
			}

	}

	public static void depositar(ContaCorrente conta, double valor) {
		conta.setSaldo(conta.getSaldo() + valor);
	}

	public static void sacar(ContaCorrente conta, double valor) {
		conta.setSaldo(conta.getSaldo() - valor);
	}

}
