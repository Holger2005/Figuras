package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura figura = new Cuadrado("Cuadrado", "Azul", 5);
		Cuadrado cuadrado = new Cuadrado("Hijo","Azul",5);
		Triangulo triangulo = new Triangulo("Hija","Verde",6,8);

		System.out.println(triangulo);
	}

}
