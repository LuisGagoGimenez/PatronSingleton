package com.patronbuilder;

import java.util.Arrays;

import com.patronbuilder.builders.PersonaBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonaBuilder builder = new PersonaBuilder();
		

		Persona p = builder
				.nombre("pepe")
				.apellidos("ramirez")
				.build();
		
		System.out.println(p.getNombre());
		System.out.println(p.getApellidos());
		
	}

}
