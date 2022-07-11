package n1ejercicio2;

import java.util.ArrayList;

public class MainO5Letras {
	public static void main(String[] args) {

		ArrayList<String> palabras = new ArrayList<String>();
		addPalabras(palabras);
		System.out.println(palabras);
		System.out.println("----------------------------------------------");

		palabras.stream().filter(n -> n.contains("o"))
						 .filter(n-> n.length()>5)
						 .forEach(n -> System.out.println(n));

	}

	private static void addPalabras(ArrayList<String> palabras) {
		palabras.add("coche");
		palabras.add("avion");
		palabras.add("casa");
		palabras.add("teclado");
		palabras.add("pantalla");
		palabras.add("ventana");

	}
}
