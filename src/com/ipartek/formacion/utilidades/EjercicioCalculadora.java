package com.ipartek.formacion.utilidades;

import com.ipartek.formacion.Perro;

public class EjercicioCalculadora {

	public static void main(String[] args) {
		
		//METODOS DE INSTANCIA U OBJETOS
		Perro p = new Perro();
		p.toString();
		
		//METODOS ESTATICOS O DE CLASE,OBLIGATORIO QUE SEAN 'STATIC'
		Math.random();
		int resultado = Calculadora.sumar(2,3);
		System.out.println("2 + 3 = " + resultado);
		
		
	}
}
