package estructura.secuencial;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------");
		System.out.println("------------ EJERCICIO 7 -----------------");
		System.out.println("------------------------------------------");
		
		Scanner sc= new Scanner(System.in);
		
		int cateto1;
		int cateto2;
		int hipotenusa;
		
		
		System.out.println("Introduce el primer cateto: ");
		cateto1=sc.nextInt();
		
		System.out.println("Introduce el segundo cateto: ");
		cateto2=sc.nextInt();
		
		hipotenusa =  (int) Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2));
		
		
	System.out.println("La hipotenusa es: " + hipotenusa);
		
	}
	
	
}
