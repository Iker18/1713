package com.ipartek.formacion;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrdenacionArraysTest {

	@Test
	public void testBubbleShort() throws Exception {
		
		int[] aDesordenados = {3,2,1};
		int[] aResultado = {3,2,1};
		
		int[] aOrdenados = OrdenacionArrays.bubbleShort(aDesordenados);
		
		assertArrayEquals( aResultado, aOrdenados);
		
		
		aDesordenados = new int[] {-3,3,-3};
		aOrdenados = new int[] {3,-3,3};
		aOrdenados = OrdenacionArrays.bubbleShort(aDesordenados);
		assertArrayEquals("Valores negativos", aResultado, aOrdenados);
		
		aDesordenados = new int[] {3,3,3};
		aOrdenados = new int[] {3,3,3};
		aOrdenados = OrdenacionArrays.bubbleShort(aDesordenados);
		assertArrayEquals("Todos son iguales", aResultado, aOrdenados);
		
		aDesordenados = new int[] {3,3,1};
		aOrdenados = new int[] {1,3,3};
		aOrdenados = OrdenacionArrays.bubbleShort(aDesordenados);
		assertArrayEquals("Todos iguales y uno diferente", aResultado, aOrdenados);
		
				
	}
	
	
	


	@Test (expected = Exception.class)
	public void testBubbleShortNull() throws Exception {
		
		OrdenacionArrays.bubbleShort(null);
		
		
	}

}
