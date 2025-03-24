package br.sp.senai.jandira.calcular.model;

public class Triangulo {
	
	private double ladoA;
	private double ladoB;
	private double ladoC;

	public void setladoA (double ladoA) {
		this.ladoA = ladoA;
	}

	public double getladoA() {
		return ladoA;
	}

	public void setladoB (double ladoB) {
		this.ladoB = ladoB;
	}

	public double getladoB() {
		return ladoB;
	}
	
	public void setladoC (double ladoC) {
		this.ladoC = ladoC;
	}

	public double getladoC() {
		return ladoC;
	}
	
	public double calcularArea() {
		double area = (ladoA * ladoB )/2;
		return area;
	}
	
	public void tipoTriangulo() {

		if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {

		if (ladoA == ladoB && ladoB == ladoC) {

		System.out.println("É um triângulo EQUILÁTERO!");

		} else if (ladoA != ladoB && ladoB != ladoC) {

		System.out.println("É um triângulo ESCALENO!");

		} else {

		System.out.println("É um triângulo ISÓSCELES!");

		}

		} else {

		System.out.println("As medidas informadas NÃO formam um triângulo.");

		}
	}
	
	
	public void mostrarDados() {
		String unidadeMedida = "cm.";
		String unidadeArea = "cm².";
		System.out.println("=================");
		System.out.println("TRIÂNGULO");
		System.out.println("-----------------");
		System.out.printf("LADOA: %s %s\n", ladoA, unidadeMedida);
		System.out.printf("LADOB: %s %s\n", ladoB, unidadeMedida);
		System.out.printf("LADOC: %s %s\n", ladoC, unidadeMedida);
		System.out.printf("ÁREA: %s %s\n",calcularArea(), unidadeArea);
		
	}

}
