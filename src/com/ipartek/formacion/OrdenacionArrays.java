package com.ipartek.formacion;

public class OrdenacionArrays {

/**
 * Ordena de menor a mayor el array
 * aDesordenados int[] con numeros desordenados
 * Excepcion si aDesordenados == null
 * @param aDesordenados
 * @return
 */
	
	
	public static int[] bubbleShort(int [] aDesordenados) throws Exception {
	
		if(aDesordenados == null) {
			
			throw new Exception("No puede ser null");
		}
		
		int aux = 0;
		
		for (int i = 0; i < aDesordenados.length; i++) {
			
			for (int j = 0; j < aDesordenados.length; j++) {
				
				if(aDesordenados[j-1] > aDesordenados[j]) {
					aux = aDesordenados[j-1];
					aDesordenados[j-1] = aDesordenados[j];
					aDesordenados[j] = aux;
					
				}
			}
		}
		
		return aDesordenados;
			
	}
	}


			//METODO DE LA BURBUJA
			/*int[] array = {6,2,3,1,4,5,9,8,7};
			int i, j, aux,k;
			for (i = 0; i < array.length; i++) {
			    for (j = 0; j < array.length; j++) {
			        if (array[j] < array[i]) {
			            aux = array[i];
			            array[i] = array[j];
			            array[j] = aux;
			        }
			    }
			}
			for ( k = 0; k < array.length; k++) {
				System.out.println(array[k]);
			}*/