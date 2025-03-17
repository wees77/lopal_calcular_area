package br.sp.senai.jandira.calcular.model;

public class Quadrado {

	private double lado1;
	private double lado2;

	public void setLado1 (double lado1) {
		this.lado1 = lado1;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado2 (double lado2) {
		this.lado2 = lado2;
	}

	public double getLado2() {
		return lado2;
	}
	
	public double calcularArea() {
		double area = lado1 * lado2;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * (lado1 + lado2);
		return perimetro;
	}
	
	public void mostrarDados() {
		String unidadeMedida = "cm.";
		String unidadeArea = "cm².";
		System.out.println("=================");
		System.out.println("QUADRADO");
		System.out.println("-----------------");
		System.out.printf("LADO1: %s %s\n", lado1, unidadeMedida);
		System.out.printf("LADO2: %s %s\n", lado2, unidadeMedida);
		System.out.printf("ÁREA: %s %s\n",calcularArea(), unidadeArea);
		System.out.printf("PERÍMETRO: %s %s\n", calcularPerimetro(), unidadeMedida);
		
	}
}


