package com.ipartek.formacion;

public class Perro {
	
	private String nombre;
	
	private String raza;
	 
	private int edad;
	
	private boolean vacunado;
	
	
	
	// constructor
	
	public Perro() {
		
		super();
		this.nombre = "Sin Nombre";
		this.raza = "Cruce";
		this.edad = 0;
		this.vacunado = false;		
		
	}
	
	

	public Perro(String nombre) {
		this();
		//super();
		this.nombre = nombre;
	}





	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	/**
	 * Setteamos la edad del perro, en caso de ser < 0 ponemos un 0
	 * @param edad int valor en a�os
	 */
	public void setEdad(int edad) throws Exception {
		if ( edad < 0 ) {
			//this.edad = 0;
			throw new PerroException (PerroException.ERROR_EDAD);
			
		}else {
			this.edad = edad;
		}	
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", vacunado=" + vacunado + "]";
	}
	
	
	
	

}
