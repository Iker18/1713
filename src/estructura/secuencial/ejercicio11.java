package estructura.secuencial;

import java.util.Scanner;

public class ejercicio11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numeros;
		
		System.out.println("Introduce 5 numeros: ");
		numeros = sc.nextInt();
		
		
		System.out.println(numeros/10000);
		System.out.println(numeros/1000);
		System.out.println(numeros/100);
		System.out.println(numeros/10);
		System.out.println(numeros);
		
	}

}
