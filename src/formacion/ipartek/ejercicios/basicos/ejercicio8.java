package formacion.ipartek.ejercicios.basicos;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Ejercicio 8");
			
			final String NOMBRE_EJERCICIO = "Ejercicios 8"; //constante
			
			System.out.println(NOMBRE_EJERCICIO);
			
			 int a = 14;
			 int b = 15;
			 
			 System.out.println( a  + (a % 2 == 0 ? " Es par " : " Es Impar " ));
			 
			 String resultado = (b % 2 == 0) ? "Es par" : "Es impar";
			
			 
			 
			 System.out.printf("El numero %s es %s \n",b, resultado);
			 
			 
			 
			 float numero = 4.14259045f;
			 float numero2 = (float)4.14259045;
			 float numero3 = 3;
			 
			 double numeroDouble = 4.14259045;
			 
			 System.out.printf("Numero formateado con 2 decimales %.2f ", numero);
			 
	}
	
	
}
