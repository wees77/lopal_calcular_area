package br.sp.senai.jandira.calcular;

import br.sp.senai.jandira.calcular.model.Retangulo;
import br.sp.senai.jandira.calcular.model.Quadrado;
import br.sp.senai.jandira.calcular.model.Triangulo;
import br.sp.senai.jandira.calcular.model.Trapezio;
import br.sp.senai.jandira.calcular.model.Circunferencia;

public class CalcularApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Retangulo r1 = new Retangulo();
		System.out.println(r1);
		Quadrado q1 = new Quadrado();
		System.out.println(q1);
		Triangulo t1 = new Triangulo();
		System.out.println(t1);
		Trapezio t2 = new Trapezio();
		System.out.println(t2);
		Circunferencia c1 = new Circunferencia();
		System.out.println(c1);
		
		r1.setAltura(5);
		r1.setBase(10);
		r1.calcularArea();
		r1.calcularPerimetro();
		
		r1.mostrarDados();
		
		q1.setLado1(8);
		q1.setLado2(8);
		q1.calcularArea();
		q1.calcularPerimetro();
		
		q1.mostrarDados();
		
		t1.setAltura(10);
		t1.setBase(12);
		t1.calcularArea();
		
		t1.mostrarDados();
		
		t2.setAltura(12);
		t2.setBaseMenor(15);
		t2.setBaseMaior(22);
		t2.calcularArea();
		
		t2.mostrarDados();
		
		c1.setRaio(8);
		c1.calcularArea();
		
		c1.mostrarDados();
		

	}

}
