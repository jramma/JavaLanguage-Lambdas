package n1ejercicio1;

import java.util.ArrayList;

public class MainLetraO {

	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<String>();
		addPalabras(palabras);
		 palabras.stream().filter(n -> n.contains("o"))
											.forEach(n->System.out.println(n));
		
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
