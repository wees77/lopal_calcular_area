package br.sp.senai.jandira.calcular.model;

public class Quadrado {

	private double lado;

	public void setLado (double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}
	
	public double calcularArea() {
		double area = lado* lado;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 2 * (lado+ lado);
		return perimetro;
	}
	
	public void mostrarDados() {
		String unidadeMedida = "cm.";
		String unidadeArea = "cm².";
		System.out.println("=================");
		System.out.println("QUADRADO");
		System.out.println("-----------------");
		System.out.printf("LADO: %s %s\n", lado, unidadeMedida);
		System.out.printf("ÁREA: %s %s\n",calcularArea(), unidadeArea);
		System.out.printf("PERÍMETRO: %s %s\n", calcularPerimetro(), unidadeMedida);
		
	}
}


