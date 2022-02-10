package com.generation;

public class Tacos {

	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	private float precio = (float) 0.0;
	
	
	Tacos(){
		
	}
    Tacos(String tipoDeTortilla){//argumentos, parametros
    	
    	this.tipoDeTortilla = tipoDeTortilla;
	}
	
	//El contructor nos ayuda a inicializar objetos
	public Tacos(String tipoDeTortilla, 
			     String tipoDeGuisado, 
			     int numeroDeTortilla, 
			     String tamanioDeTortilla, 
			     float precio) {
		this.tipoDeTortilla = tipoDeTortilla;//con this. nos referimos a la clase tacos y la separtamos del constructos de tacos
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
		
	void preparar() {
		System.out.println("preparando taco riico");
	}

	void vender() {
		System.out.println("Taco vendido");

	}

	void ponerSalsa() {
		System.out.println("Agregando salsa");
	}
	void subirPrecio(float aumento) {
		precio = precio + aumento;
		
	}
	

	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}
	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}
	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
		
	}
	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if (numeroDeTortilla > 0 && numeroDeTortilla < 3) {//rango 0 - 4
			this.numeroDeTortilla = numeroDeTortilla;
    	}else {
    		throw new IllegalArgumentException("Error de tortillas");
    	}
		
	}
	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}
	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}

}
