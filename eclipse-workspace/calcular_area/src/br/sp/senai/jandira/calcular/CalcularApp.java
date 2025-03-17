package br.sp.senai.jandira.calcular;

import br.sp.senai.jandira.calcular.model.Retangulo;

public class CalcularApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo r1 = new Retangulo();
		System.out.println(r1);
		
		r1.setAltura(5);
		r1.setBase(10);
		r1.calcularArea();
		
		r1.mostrarDados();

	}

}
