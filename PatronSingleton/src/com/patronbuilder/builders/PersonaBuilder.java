package com.patronbuilder.builders;

import com.patronbuilder.Persona;

public class PersonaBuilder  {//implements Build{
	private Persona p = new Persona();

	public PersonaBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonaBuilder nombre(String nombre) {
		this.p.setNombre(nombre);
		return this;
	}
	
	public PersonaBuilder apellidos(String apellidos) {
		this.p.setApellidos(apellidos);
		return this;
	}
	
	
	public Persona build() {
		return p;
	}


}
