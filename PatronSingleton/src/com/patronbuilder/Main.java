package com.patronbuilder;

import com.patronbuilder.builders.PersonaBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p = PersonaBuilder.build("Luis");
		
		System.out.println(p.getNombre());
	}

}
