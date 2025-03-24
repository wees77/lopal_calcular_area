package br.sp.senai.jandira.calcular;

import java.util.Scanner;

import br.sp.senai.jandira.calcular.ui.Menu;

public class CalcularApp {

	public static void main(String[] args) {
		System.out.println("Tabuada do 9");
		int contador = 0;
		while(contador <= 10) {
			int resultado = 9 * contador;
			System.out.println("9x" + contador + "=" + resultado);
			contador = contador + 1;
		}
		
		System.out.println();
		System.out.println("Números ímpares de 0 à 100");
		contador = 0;
		while(contador <= 100) {
			if(contador % 2 == 1) {
			  System.out.println(contador);
			}
			contador ++;
		}
		
		System.out.println();
		System.out.println("------------------------");
		Scanner leitor = new Scanner(System.in);
		String resposta = "s";
		while (resposta.equalsIgnoreCase("s")) {
			System.out.println("Estamos dando voltas!");
			System.out.println("Mais uma volta? (S/N)");
			resposta = leitor.next();
		}
		
		leitor.close();
		//Menu.criarMenu();
		
	}

}
