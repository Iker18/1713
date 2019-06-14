package estructura.secuencial;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		
		
		System.out.println("------------------------------------------");
		System.out.println("------------ EJERCICIO 6 -----------------");
		System.out.println("------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		double velocidad;
		double km;
		
		
		System.out.println("Introduce los km/h: ");
		velocidad=sc.nextDouble();
		
		km = velocidad *1000/3600;
		
		System.out.println("La velocidad en m/s es: " + km);
		
	}
	
	
}
