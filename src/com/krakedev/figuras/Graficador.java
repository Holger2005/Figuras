package com.krakedev.figuras;

public class Graficador {
	
	public void graficar(Figura figura) {
		
		Figura grafica = figura;
		
		System.out.println("Graficando " + grafica.getNombre() + " de color " + grafica.getColor() + " Perímetro: " + grafica.calcularPerimetro() + " Área: " + grafica.calcularArea());
	}

}
