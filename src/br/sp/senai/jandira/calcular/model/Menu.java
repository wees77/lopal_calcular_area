package br.sp.senai.jandira.calcular.model;

import java.util.Scanner;

public class Menu {
	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("---------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("---------------");
		System.out.println("1 - RETÂNGULO");
		System.out.println("2 - QUADRADO");
		System.out.println("3 - TRAPÉZIO");
		System.out.println("4 - TRIÂNGULO");
		System.out.println("5 - CIRCUNFERÊNCIA");
		System.out.println("---------------");
		System.out.print("Escolha uma opção de (1-5): ");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			CalculoDePoligonos.calcularRetangulo();
		} else {
			System.out.println("A opção selecionada ainda não foi implementada!");
		}
		
		leitor.close();
	}
}
