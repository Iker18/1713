package com.ipartek.formacio.exception;

import com.ipartek.formacion.Perro;
import com.ipartek.formacion.PerroException;

/**
 * 
 * Se pueden capturar mas de un tipo de excepciones, siempre la ultima en capturar que sea Exception
 * que es la mas generica
 * @author Curso
 *
 */
public class CapturarTiposdeExcepciones {
		public static void main(String[] args) {
			try {
				Perro p = new Perro();
				p.setEdad(-1);
				p.toString();
				System.out.println("p");
			
				
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Te has salido del array");	
				
			} catch (PerroException e) {
				System.out.println("PerroExcepcion Null");	
				
			} catch (NullPointerException e) {
				System.out.println("Excepcion Null");
				
			} catch (Exception e) {
				System.out.println("Excepcion generica, siempre la última");
				e.printStackTrace();
			}
		}
}
