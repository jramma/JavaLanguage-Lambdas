package n1ejercicio5;

public class InterfaceMain {

	public static void main(String[] args) {

		GetPi getpi = () -> 3.1415;
		System.out.println(getpi.getPiValue());

	}

}
