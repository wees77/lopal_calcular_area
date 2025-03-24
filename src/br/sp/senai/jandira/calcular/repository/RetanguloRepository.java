package br.sp.senai.jandira.calcular.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular.model.Retangulo;

public class RetanguloRepository {
	
	public void criarRetangulo() {
		Scanner leitor = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println();
		System.out.println("Criando um retângulo...");
		
		System.out.print("Qual a medida da base do retângulo?");
		retangulo.setBase(leitor.nextDouble());
		
		System.out.print("Qual a medida da altura do retângulo?");
		retangulo.setAltura(leitor.nextDouble());
		
		retangulo.mostrarDados();
		
		leitor.close();
	}

}
