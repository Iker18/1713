package estructura.secuencial;

import java.util.Scanner;

public class ejercicio8 {

	
	public static void main(String[] args) {
		
		//v = (4/3)*PI*r^3
		Scanner sc=new Scanner(System.in);
		
		double radio;
		double volumen;
		
		System.out.println("Introduce el radio: ");
		radio=sc.nextDouble();
		
		
		volumen = (4.0/3)* Math.PI * Math.pow(radio, 3);
		
		System.out.println("El volumen es:" + volumen);
		
	}
}
