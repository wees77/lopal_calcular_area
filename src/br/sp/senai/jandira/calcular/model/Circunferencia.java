package br.sp.senai.jandira.calcular.model;


public class Circunferencia {
	private double raio;

	public void setRaio (double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	
	public double calcularArea() {
		double area = Math.PI * (raio * raio);
		return area;
	}
	
	
	public void mostrarDados() {
		String unidadeMedida = "cm.";
		String unidadeArea = "cm².";
		System.out.println("=================");
		System.out.println("CIRCUNFERÊNCIA");
		System.out.println("-----------------");
		System.out.printf("RAIO: %s %s\n", raio, unidadeMedida);
		System.out.printf("ÁREA: %s %s\n",calcularArea(), unidadeArea);
		
	}

}
