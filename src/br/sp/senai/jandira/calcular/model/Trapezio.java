package br.sp.senai.jandira.calcular.model;

public class Trapezio {
	private double baseMaior;
	private double baseMenor;
	private double altura;

	public void setBaseMenor (double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public double getBaseMenor() {
		return baseMaior;
	}
	
	public void setBaseMaior (double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior() {
		return baseMaior;
	}

	public void setAltura (double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return altura;
	}
	
	public double calcularArea() {
		double area = (baseMenor + baseMaior)* altura/2;
		return area;
	}
	
	
	public void mostrarDados() {
		String unidadeMedida = "cm.";
		String unidadeArea = "cm².";
		System.out.println("=================");
		System.out.println("TRAPÉZIO");
		System.out.println("-----------------");
		System.out.printf("BASE MENOR: %s %s\n", baseMenor, unidadeMedida);
		System.out.printf("BASE MAIOR: %s %s\n", baseMaior, unidadeMedida);
		System.out.printf("ALTURA: %s %s\n", altura, unidadeMedida);
		System.out.printf("ÁREA: %s %s\n",calcularArea(), unidadeArea);
		
	}

}
