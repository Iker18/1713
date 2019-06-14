package estructura.secuencial;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println("------------------------------------------");
		System.out.println("------------ EJERCICIO 5 -----------------");
		System.out.println("------------------------------------------");
		
		
		Scanner sc = new Scanner(System.in);
		
		
		double radio;
		double longitud;
		double area;
		
		System.out.println("Introduce el radio: ");
		radio = sc.nextDouble();
		
		
		longitud =  2 * Math.PI * radio;
		area = Math.PI* Math.pow(radio, 2);
		
		System.out.println("La longitud es: " + longitud);
		System.out.println("El area es: " + area);

		
		
	}
}
