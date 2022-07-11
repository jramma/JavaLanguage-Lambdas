package n1ejercicio3;

import java.util.ArrayList;

public class Meses12 {

	public static void main(String[] args) {
		

			ArrayList<String> meses = new ArrayList<String>();

			addMeses(meses);

			meses.forEach(m -> System.out.println(m));

		}

		private static void addMeses(ArrayList<String> meses) {
			meses.add("enero");
			meses.add("febrero");
			meses.add("marzo");
			meses.add("abril");
			meses.add("mayo");
			meses.add("junio");
			meses.add("julio");
			meses.add("agosto");
			meses.add("septiembre");
			meses.add("octubre");
			meses.add("noviembre");
			meses.add("diciembre");

		}

	}
