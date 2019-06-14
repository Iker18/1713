package formacion.ipartek.ejercicios.basicos;

import java.util.Scanner;

/**
 *  url
 * @author Curso
 *
 */

public class variablesPrimitivasWrappers {
	
	public static void main(String[] args) {
	
		 //declarar todos los posibles tipos variables primitivos
		
		//numeros enteros
		
		byte b = 2;
		short s = 4;
		int i = 0;
		long l = 8;
		
		//numeros reales o decimales
		
		float f = 2.43f;
		double d = 4.56;
		
		char c = 'a'; //comillas simples
		
		boolean b1 = true; // or false
		
		
		
		//Wrappers
		
		int numeroparseado = +Integer.parseInt("3");
		
		System.out.printf("El rango de un int %d %d", Integer.MIN_VALUE, Integer.MAX_VALUE);
		
		
		//Indicar si el caracter introducido por pantalla es mayusculas o minisculas
		//letra o numero
		
		System.out.println("Introduce un caracter");
		
		Scanner sc = new Scanner(System.in);
		
		char caracter = sc.next().charAt(0);
		
		
		System.out.println(Character.isLetter(caracter) ? " Es letra " : " No es Letra ");
		System.out.println(Character.isDigit(caracter) ? " Es Numero " : " No es Numero ");
		System.out.println(Character.isLowerCase(caracter) ? " Es Minuscula " : " No es Minuscula ");
		System.out.println(Character.isUpperCase(caracter) ? " Es Mayuscula " : " No es Mayuscula ");
		System.out.println(Character.isLetterOrDigit(caracter) ? " Es letra o numero " : " Es caracter especial");
		
		
		
		sc.close();
	}

}
