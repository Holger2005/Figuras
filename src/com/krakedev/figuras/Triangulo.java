package com.krakedev.figuras;

public class Triangulo extends Figura {
	
	private int base;
    private int altura;

	public Triangulo(String nombre, String color, int base, int altura) {
		super(nombre, color);
		this.base = base;
        this.altura = altura;
		
	}
	
	@Override
	 public double calcularArea() {
	        return (double)(base * altura) / 2;
	        
	}
	 

}
