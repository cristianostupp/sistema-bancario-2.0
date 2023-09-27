package com.wyden.banco.main;

import java.util.HashMap;
import java.util.Scanner;

import com.wyden.banco.models.Cliente;
import com.wyden.banco.services.ClienteServices;
import com.wyden.banco.services.ContaCorrenteServices;

public class MainApp {

	public static void main(String[] args) {

		int opcao;
		HashMap<String, Cliente> clientes = new HashMap<String, Cliente>();

		do {

			opcao = menuPrincipal();
			switch (opcao) {

			case 1:
				ClienteServices.criar(clientes);
				break;
			case 2:
				ClienteServices.ler(clientes);
				break;
			case 3:
				ContaCorrenteServices.criar(clientes);
				break;
			case 4:
				System.out.println("Colocar aqui rotina para consultar uma conta corrente.");
				break;
			case 5:
				System.out.println("Colocar aqui rotina para depositar.");
				break;
			case 6:
				System.out.println("Colocar aqui rotina para sacar.");
				break;
			case 9:
				System.out.println("\nFim de programa\n");
				break;

			default:
				System.out.println("\nOpção inválida\n");
			}

		} while (opcao != 9);

	}

	public static int menuPrincipal() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n\nEscolha a opcao:");
		System.out.println("1. Criar um cliente");
		System.out.println("2. Consultar um cliente");
		System.out.println("3. Criar uma conta corrente");
		System.out.println("4. Consultar uma conta corrente");
		System.out.println("5. Depositar");
		System.out.println("6. Sacar");
		System.out.println("9. Sair");
		
		System.out.print("Opcao: ");
		
		int opt = scanner.nextInt();

		return opt;

	}

}
