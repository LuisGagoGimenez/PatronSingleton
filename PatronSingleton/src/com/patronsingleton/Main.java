package com.patronsingleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p = Persona.getInstances("Luis");
		System.out.println(p.getNombre());
		Persona p1 = Persona.getInstances("Juan");
		
		System.out.println(p1.getNombre());
	}

}
