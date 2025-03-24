package br.sp.senai.jandira.calcular.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular.model.Trapezio;

public class TrapezioRepository {
	
	public void criarTrapezio() {
		Scanner leitor = new Scanner(System.in);
		
		Trapezio trapezio = new Trapezio();
		
		System.out.println();
		System.out.println("Criando um trapézio...");
		
		System.out.print("Qual a medida da base maior do trapézio?");
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Qual a medida da base menor do trapézio?");
		trapezio.setBaseMenor(leitor.nextDouble());
		
		System.out.println("Qual a medida da altura do trapézio?");
		trapezio.setAltura(leitor.nextDouble());
		
		trapezio.mostrarDados();
		
		leitor.close();
	}

}
