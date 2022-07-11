package n1ejercicio8;

import java.util.Scanner;

public class MainReverse {

	public static void main(String[] args) {

		InterfaceReverse output = (input) -> {
			input = input.chars().mapToObj(e -> String.valueOf((char) e)).reduce((a, e) -> e.concat(a)).toString();
			return input;

		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un String:");
		String in = sc.nextLine();
		System.out.println(output.reverse(in));
		sc.close();

	}

}
