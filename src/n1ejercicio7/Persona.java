package n1ejercicio7;

import java.util.Arrays;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private String[] texto;

	public Persona(String nombre, String[] nombres) {
		this.nombre = nombre;
		this.texto = nombres;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String[] getNombres() {
		return texto;
	}

	public void setNombres(String[] nombres) {
		this.texto = nombres;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", nombres=" + Arrays.toString(texto) + "]";
	}

	@Override
	public int compareTo(Persona o) {
		int posicion = 0;
		if (o.getNombres().length > getNombres().length) {
			posicion = -1;
		} else {
			posicion = 1;
		}

		return posicion;
	}

}
