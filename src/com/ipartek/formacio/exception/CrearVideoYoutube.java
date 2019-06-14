package com.ipartek.formacio.exception;

import java.util.Scanner;

import com.ipartek.formacion.Youtube;

public class CrearVideoYoutube {

	public static void main(String[] args) {
		System.out.println("----------------------------");
		System.out.println(" ----CREAR VIDEO YOUTUBE----");
		System.out.println("----------------------------");
		
		boolean repetir = true;
		Youtube video = null;
		Scanner sc = new Scanner(System.in);
		
		do {
			
		System.out.println("Introduce el titulo del video [2,150]: ");
		String titulo=sc.nextLine();
		
		System.out.println("Introduce el codigo [11]: ");
		String codigo=sc.nextLine();
		
		try {
			video = new Youtube(titulo, codigo);
			repetir = false;
			
		} catch (Exception e) {
			
			System.out.println("Error" + e.getMessage());
			System.out.println("Intentalo de nuevo, por favor");
		}
		
	
		
		}while(repetir);
			
			
		System.out.println("Video creado correctamente");
		System.out.println(video);
		
		sc.close();
		}

	
	}


