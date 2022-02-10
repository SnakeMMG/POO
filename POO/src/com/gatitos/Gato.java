package com.gatitos;

public class Gato {
	//atributos
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//consructor
	
	public Gato(String nombre, int patas, boolean adoptado) {
		super();
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}
	
	
	//getters y setters
	//deven de ser public
	
	public String getNombre() {
		return this.nombre;//como buenas practicas se utiliza la palabra this.
	}

    

	public void setNombre(String nombre) { //no regresan datos, pero si los modifican 
    	
    	this.nombre = nombre;
	}

    public int getPatas() {
		return patas;
	}

    public void setPatas(int patas) {
         
    	if (patas >= 0 && patas < 5) {//rango 0 - 4
    		this.patas = patas;
    	}else {
    		throw new IllegalArgumentException("El numero de patas no es valido");
    	}
		
	}
    
    public boolean isAdoptado() {//is porque hace una pregunta
		return adoptado;
	}

	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}

    //metodo toString
	
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + "]";
	}
	

	
	
	
	

}
