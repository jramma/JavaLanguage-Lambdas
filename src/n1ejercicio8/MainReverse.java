package n1ejercicio8;

import java.util.Scanner;

public class MainReverse {

	public static void main(String[] args) {

		InterfaceReverse output = (input) -> {
			return new StringBuilder(input).reverse().toString();
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un String:");
		String in = sc.nextLine();
		System.out.println(output.reverse(in));
		sc.close();

	}

}
