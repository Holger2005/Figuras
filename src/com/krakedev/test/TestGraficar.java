package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura figura = new Figura("Padre","Blanco");
		Cuadrado cuadrado = new Cuadrado("Hijo","Azul", 2);
		Triangulo triangulo = new Triangulo("Hija","Verde",5,4);
		Rectangulo rectangulo = new Rectangulo("Hijo", "Amarillo",8,7);
		TrianguloRectangulo triRect = new TrianguloRectangulo("Triángulo Rectángulo", "Verde", 3, 4);
		Graficador graficador = new Graficador();
		
		graficador.graficar(figura);
		graficador.graficar(cuadrado);
		graficador.graficar(triangulo);
		graficador.graficar(rectangulo);
		graficador.graficar(triRect);
	}

}
