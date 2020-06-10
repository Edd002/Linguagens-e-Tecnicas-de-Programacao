package aulas;
import java.util.*;

public class Aula03_2 {

	public static void main(String[] args) {
		double lado;
		double resultado;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o lado do quadrado: ");
		lado = scanner.nextDouble();

		resultado = lado * lado; //Math.pow(lado, 2);
		
		System.out.println();
		
		System.out.println("O resulrado é: " + resultado);
	}
}
