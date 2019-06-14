package estructura.secuencial;

import java.util.Scanner;

public class ejercicio4 {
	
	public static void main(String[] args) {
		
		
		System.out.println("------------------------------------------");
		System.out.println("------------ EJERCICIO 4 -----------------");
		System.out.println("------------------------------------------");
		
		double gradosC;
		double gradosF;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		  System.out.println("Introduce grados Centígrados:");
	      gradosC = sc.nextDouble();
		
	      
	      System.out.println("Introduce grados Farenheit:");
	      gradosF = sc.nextDouble();
	      
	      gradosF = 32 + (9 * gradosC / 5);
	      
	      System.out.println(gradosC +" ºC = " + gradosF + " ºF");
		
		
		
		
	}

}
