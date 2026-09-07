package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura figura = new Figura("Padre","Blanco");
		Cuadrado cuadrado = new Cuadrado("Hijo","Azul");
		Triangulo triangulo = new Triangulo("Hija","Verde");
		Rectangulo rectangulo = new Rectangulo("Hijo", "Amarillo");
		Graficador graficador = new Graficador();
		
		graficador.graficar(figura);
		graficador.graficar(cuadrado);
		graficador.graficar(triangulo);
		graficador.graficar(rectangulo);
	}

}
