package aulas;
import java.util.*;

public class Aula03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String texto = null;
		char caracter = '0';
		double real = 0.0;

		System.out.println("Entrada (String): ");
		texto = scanner.nextLine();
		System.out.println("Saída (String): ".concat(texto));

		System.out.println();

		System.out.println("Entrada (char): ");
		caracter = scanner.next().charAt(0);
		System.out.println("Saída (char): " + caracter);

		System.out.println();

		System.out.println("Entrada (real): ");
		real = scanner.nextDouble();
		System.out.println("Saída (real): " + real);
	}


	/*
	-- Conferir se é double --
	
	public static boolean isDouble(String parametro) {
		try {
			Double.parseDouble(parametro);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}
	*/
}