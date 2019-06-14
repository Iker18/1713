package com.ipartek.formacio.exception;

import com.ipartek.formacion.Perro;

public class propagacionException {

	public static void main(String[] args) throws Exception {
		System.out.println("Empieza Main");
		metodoA();
		System.out.println("Acaba main");
	}
	
	
	private static void metodoA() throws Exception {
		
		System.out.println("Comienza metodo A");
		
		Perro p = new Perro();
		p.setEdad(-1);
		System.out.println(p);
		
		System.out.println("Termina metodo A");
	}
	
	
}
