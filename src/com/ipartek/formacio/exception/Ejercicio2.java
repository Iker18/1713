package com.ipartek.formacio.exception;

import java.util.Scanner;

public class Ejercicio2 { //PEDIR AL USUARIO QUE INSERTE DOS NUMEROS, CONTROLAR LOS ERRONES
						  //HACER LA SUMA DE LOS DOS

	public static void main(String[] args) {
		System.out.println("Comienza programa");
		
		
		int num1 = 0;
		int num2 = 0;
		boolean repetir = false;
		
		Scanner sc = new Scanner(System.in);
		
		do {
	
		System.out.println("Porfavor introduce el primer numero: ");
		
		try {
			num1 = Integer.parseInt( sc.nextLine() );
			repetir = false;
			
			
		} catch (Exception e) {
			System.out.println("ATENTO!!! Introduce un numero valido");
			repetir = true;
		}
		
		
		}while(repetir);
		
		
		do {
			System.out.println("Porfavor introduce el segundo numero: ");
			
			try {
				num2 = Integer.parseInt( sc.nextLine() );
				repetir = false;
				
			} catch (Exception e) {
				System.out.println("ATENTO!!! Introduce un numero valido");
				repetir = true;
			}
		
		}while(repetir);
		
		
		
		System.out.println("El primer numero es: " + num1);
		System.out.println("El segundo numero es: " + num2);
		System.out.println("La suma total es: " + num1 + " + " + num2 + " = " + (num1+num2));
		System.out.println("Finaliza programa");
		
		
		
		}
	}


