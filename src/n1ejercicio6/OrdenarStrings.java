package n1ejercicio6;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenarStrings {

	public static void main(String[] args) {
		ArrayList<Persona> nombres = new ArrayList<Persona>();
		addNombres(nombres);
		nombres.forEach(n -> System.out.println(n));

		System.out.println("---------------------------------------------------------------");
		System.out.println("ordenado de menor a mayor cadena de strings:");

		Collections.sort(nombres);

		nombres.forEach(n -> System.out.println(n));

	}

	private static void addNombres(ArrayList<Persona> nombres) {
		String[] texto = { "oca", "hola", "avion", "casa" };
		Persona persona = new Persona("Juan", texto);
		String[] texto1 = { "oca", "hola", "casa" };
		Persona persona1 = new Persona("Maria", texto1);
		String[] texto2 = { "hola", "casa" };
		Persona persona2 = new Persona("Laura", texto2);
		nombres.add(persona1);
		nombres.add(persona2);
		nombres.add(persona);

	}

}