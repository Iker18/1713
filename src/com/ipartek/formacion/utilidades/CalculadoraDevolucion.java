package com.ipartek.formacion.utilidades;

public class CalculadoraDevolucion {

	public static final float[] BILLETES_MONEDAS = {
			
			// BILLETES
			500, 200, 100, 50, 20, 10, 5,

			// MONEDAS
			2, 1, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f,

	};
	
	
	/**
	 * CALCULA LAS VUELTAS OPTIMAS PARA RETORNAR EL MENOR NUMERO DE BILLETES Y MONEDAS
	 * @param importe float, costo del articulo a comprar
	 * @param entregado, dinero entregado para comprar
	 * @return, int[] cantidad de billetes y monedas retornadas
	 * @see public static final float[] BILLETES_MONEDAS
	 * @throws Exception, si el importe > entregado o si importe < 0 o entregado < 0
	 */

	public static int[] vueltas(float importe, float entregado) throws Exception{
		
		float entregado = 
		float devolucion = importe - entregado;
		
		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			
		}
		
		return null;

	}

}
