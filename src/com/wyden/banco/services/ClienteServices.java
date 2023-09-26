package com.wyden.banco.services;

import java.util.HashMap;
import java.util.Scanner;

import com.wyden.banco.models.Cliente;
import com.wyden.banco.models.ContaCorrente;

public class ClienteServices {

	static Scanner scanner = new Scanner(System.in);
	
	public static void criar(HashMap<String, Cliente> clientes) {

		Cliente objCliente = new Cliente();
		

		System.out.print("CPF do cliente: ");
		objCliente.setCpf(scanner.nextLine());

		System.out.print("Nome do cliente: ");
		objCliente.setNome(scanner.nextLine());

		System.out.print("Deseja cadastrar um conta para esse cliente (s/n): ");
		String decisao = scanner.nextLine();

		if (decisao.equals("s")) {

			ContaCorrente objContaCorrente = new ContaCorrente();

			System.out.print("Número da conta: ");
			objContaCorrente.setNumero(scanner.nextLine());

			System.out.print("Saldo inicial da conta: ");
			objContaCorrente.setSaldo(scanner.nextDouble());

			System.out.print("Tarifa bancária da conta: ");
			objContaCorrente.setTarifa(scanner.nextFloat());

			objCliente.getContas().add(objContaCorrente);

		}

		/*
		 * coloca o objeto cliente na HashMap (uma tabela) usando CPF como chave para
		 * recuperar o objeto cliente
		 */
		clientes.put(objCliente.getCpf(), objCliente);

	}

	public static void ler(HashMap<String, Cliente> clientes) {
		
		System.out.print("CPF do cliente: ");
		String cpf = scanner.nextLine();
		Cliente objCliente = clientes.get(cpf);
		
		if ( objCliente != null )
			System.out.println("Cliente: " + objCliente.getNome() + "\n");
		else
			System.out.println("Cliente não cadatrado!\n" );
		
	}

	public static void atualizar(HashMap<String, Cliente> clientes) {

	}

	public static void deletar(HashMap<String, Cliente> clientes) {

	}

}
