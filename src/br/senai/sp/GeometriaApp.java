package br.senai.sp;

import br.senai.sp.model.Triangulo;

public class GeometriaApp {

	public static void main(String[] args) {
		
		// Criando um triângulo
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		Triangulo t3 = new Triangulo();
		
		
		// Definindo as dimensões dos triângulos
		
		t1.nome = "Triangulo 01";
		t1.base = 20;
		t1.ladoB = 15;
		t1.ladoC = 15;
		t1.altura = 12;
		
		t2.nome = "Triangulo 02";
		t2.base = 10;
		t2.ladoB = 6;
		t2.ladoC = 8;
		t2.altura = 8;
		
		
		t3.nome = "Triangulo 03";
		t3.altura = 14;
		t3.base = 18;
		t3.ladoB = 20;
		t3.ladoC = 21;
		
		
		//Mostrar dimensões dos triângulos
		t1.mostrarDimensoes();
		t2.mostrarDimensoes();
		t3.mostrarDimensoes();
		t1.calcularArea();oooi
		
		
		
		

	}

}
