package com.ipartek.formacion;

public class Youtube {
	
	//PROPIEDADES
	
	private String titulo;
	private String codigo;
	private int reproducciones;

	public static final int LONGITUD_CODIGO = 11;
	public static final int MIN_TITULO = 2;
	public static final int MAX_TITULO = 150;
	public static final String URL = "https://www.youtube.com/watch?v=";
	
	//CONSTRUCTOR
	
	
	public Youtube(String titulo, String codigo) throws Exception {
		super();
		/*this.titulo = titulo; //MINIMO 2 LETRAS Y MAXIMO 150
		this.codigo = codigo; //EXACTAMENTE 11 */
		
		this.setTitulo(titulo);
		this.setCodigo(codigo);		
		this.reproducciones = 0;
	}
	
	
	//GETTER Y SETTERS
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) throws Exception{
		
		if( titulo != null && titulo.length() >= MIN_TITULO && titulo.length() <= MAX_TITULO) {
		this.titulo = titulo;
		
		}else {
			String msg = "Titulo debe tener longitud entre" + MIN_TITULO + MAX_TITULO;
			throw new Exception( msg );
		}
			
		
		
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) throws Exception{
		
		if( codigo != null && codigo.length() == LONGITUD_CODIGO ) { //COMPROBAR SIEMPRE QUE SEA DIFERENTE DE NULL
		
		this.codigo = codigo;
		
		}else {
			
			throw new Exception("Longitud codigo debe ser " + LONGITUD_CODIGO);
		}
	}
	public int getReproducciones() {
		return reproducciones;
	}
	public void setReproducciones(int reproducciones) {
		this.reproducciones = reproducciones;
	}
	
	
	//FUNCIONES

	@Override
	public String toString() {
		return "Youtube [titulo=" + titulo + ", codigo=" + codigo + ", reproducciones=" + reproducciones + "]";
	}
	
	public String getUrl() {
		return URL + codigo;
		
	}
}
