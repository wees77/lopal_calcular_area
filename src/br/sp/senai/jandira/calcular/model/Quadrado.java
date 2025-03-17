package br.sp.senai.jandira.calcular.model;

public class Quadrado {

	private double ladoA;
	private double ladoB;

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
		double area = ladoA* ladoB;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * (ladoA+ ladoB);
		return perimetro;
	}
	
	public void mostrarDados() {
		String unidadeMedida = "cm.";
		String unidadeArea = "cm².";
		System.out.println("=================");
		System.out.println("QUADRADO");
		System.out.println("-----------------");
		System.out.printf("LADOA: %s %s\n", ladoA, unidadeMedida);
		System.out.printf("LADOB: %s %s\n", ladoB, unidadeMedida);
		System.out.printf("ÁREA: %s %s\n",calcularArea(), unidadeArea);
		System.out.printf("PERÍMETRO: %s %s\n", calcularPerimetro(), unidadeMedida);
		
	}
}


