package br.sp.senai.jandira.calcular.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular.model.Triangulo;

public class TrianguloRepository {
	
	public void criarTriangulo() {
		Scanner leitor = new Scanner(System.in);
		
		Triangulo triangulo = new Triangulo();
		
		System.out.println();
		System.out.println("Criando um triângulo...");
		
		System.out.print("Qual a medida do lado A do triângulo?");
		triangulo.setladoA(leitor.nextDouble());
		
		System.out.print("Qual a medida do lado B do triângulo?");
		triangulo.setladoB(leitor.nextDouble());
		
		System.out.println("Qual a medida do lado C do triângulo?");
		triangulo.setladoC(leitor.nextDouble());
		
		triangulo.mostrarDados();
		
		leitor.close();
	}

}
