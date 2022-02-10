package com.generation;

public class Main {

	public static void main(String[] args) {
		Tacos taco1 = new Tacos();/*"maza azul", "suadero", 2, "Mediana", 30*///aqui creamos un nuevo objeto 
		
		//aqui definimos sus valores
 		
        taco1.setTipoDeTortilla("masa azul");
 		taco1.setTipoDeGuisado("suadero");
 		taco1.setNumeroDeTortilla(2);
 		taco1.setTamanioDeTortilla("Mediana");
 		taco1.setPrecio(30);
 		
 		
 		
 		
 		
 		System.out.println(taco1.toString());
 		
 		
 		Tacos taco2 = new Tacos();
 		taco2.setTipoDeTortilla("harina");
 		taco2.setTamanioDeTortilla("Grande");
 		taco2.setTipoDeGuisado("Bisteck");
 		taco2.setNumeroDeTortilla(1);
 		taco2.setPrecio(42.5f);
 		
 		//cada ojjeto es independiente y responsable de su propia informacion
 		
 		
 		
 		Tacos taco3 = new Tacos ("maiz");
 		System.out.println(taco1);//se llama el metodo toString por default
 		System.out.println(taco2);
 		System.out.println(taco3);
        
	}

}
 