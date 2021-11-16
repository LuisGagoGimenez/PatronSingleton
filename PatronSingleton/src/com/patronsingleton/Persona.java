package com.patronsingleton;

public class Persona {
	private static Persona persona;
	private String nombre;

	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static Persona getInstances(String nombre) {
		if (persona != null) {
			System.out.println("Obteniendo a " + nombre);

		} else {

			System.out.println("Creando nueva persona");
			persona = new Persona(nombre);
		}
		return persona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
