package com.wyden.banco.main;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		

	}
	
	public static int menu() {

		Scanner scanner = new Scanner(System.in);
		int opt;

		System.out.println("Escolha a opcao:");
		System.out.println("1. Criar um cliente");
		System.out.println("2. Consultar um cliente");
		System.out.println("3. Criar uma conta corrente");
		System.out.println("9. Sair");
		System.out.print("Opcao: ");
		opt = scanner.nextInt();

		return opt;

	}

}
