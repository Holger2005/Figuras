package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado cuadrado = new Cuadrado("Hijo", "Azul", 2);
		Rectangulo rectangulo = new Rectangulo("Hija", "Verde", 3, 4);

		System.out.println("Cuadrado: "+ cuadrado.calcularPerimetro() + " Rectangulo: " +rectangulo.calcularPerimetro());
	}

}
