package br.sp.senai.jandira.calcular.model;

public class Triangulo {
	private double base;
	private double ladoA;
	private double ladoB;

	public void setBase (double base) {
		this.base = base;
	}

	public double getBase() {
		return base;
	}

	public void setLadoA (double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoA() {
		return ladoA;
	}
	
	public void setLadoB (double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoB() {
		return ladoB;
	}
	
	public double calcularArea() {
		double area = (base * ladoA )/2;
		return area;
	}

	
	
	public void mostrarDados() {
		String unidadeMedida = "cm.";
		String unidadeArea = "cm².";
		System.out.println("=================");
		System.out.println("TRIÂNGULO");
		System.out.println("-----------------");
		System.out.printf("BASE: %s %s\n", base, unidadeMedida);
		System.out.printf("LADOA: %s %s\n", ladoA, unidadeMedida);
		System.out.printf("LADOB: %s %s\n", ladoB, unidadeMedida);
		System.out.printf("ÁREA: %s %s\n",calcularArea(), unidadeArea);
		
	}

}
