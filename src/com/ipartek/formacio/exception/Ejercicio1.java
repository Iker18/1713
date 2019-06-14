package com.ipartek.formacio.exception;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Comienza programa");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Porfavor introduce un numero del 0 al 9: ");
		
		try {
		
		String sNumero=sc.nextLine(); //USAR SIEMPRE PARA QUE LEA BIEN TODA LA LINEA
		int numero = Integer.parseInt(sNumero);
		System.out.println("El numero es: " + sNumero);
		
		}catch (Exception e) {
			e.printStackTrace(); //PARA QUE TE DIGA LA LINEA DONDE FALLA
			System.out.println("Mensaje exception" + e.getMessage());
			System.out.println("Inserta bien un numero, sino falla!!");
		}
		
		finally {
			sc.close();
		}
		
		
		
		
		
		
		
		
		System.out.println("Finaliza programa");
		
	}
}
