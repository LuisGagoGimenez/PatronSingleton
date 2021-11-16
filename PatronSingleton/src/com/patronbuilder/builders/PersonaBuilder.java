package com.patronbuilder.builders;

import com.patronbuilder.Persona;
import com.patronbuilder.interfacesbuilder.BuilderNiño;

public class PersonaBuilder implements BuilderNiño {
	private static Persona p;

	public static Persona build(String nombre) {
		p = new Persona(nombre);

		p.setNombre(nombre);
		return p;

	}

	@Override
	public void Jugar() {
		// TODO Auto-generated method stub
		System.out.println("Soy un niño que juega");
	}

}
