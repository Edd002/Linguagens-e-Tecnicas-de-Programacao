package exercicios;

import java.util.Scanner;

public class Lista03_exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double lado1 = 0.0;
		double lado2 = 0.0;
		double lado3 = 0.0;

		System.out.println("Informe o valor do primeiro lado: ");
		lado1 = scanner.nextDouble();

		System.out.println("Informe o valor do segundo lado: ");
		lado2 = scanner.nextDouble();

		System.out.println("Informe o valor do terceiro lado: ");
		lado3 = scanner.nextDouble();

		if ((lado1 + lado2) < lado3 || (lado1 + lado3) < lado2 || (lado2 + lado3) < lado1) {
			System.out.println("As medidas informadas n�o correspondem a um tri�ngulo.");
		} else {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("O tri�ngulo informado � equil�tero.");
			} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("O tri�ngulo informado � is�sceles.");
			} else {
				System.out.println("O tri�ngulo informado � escaleno.");
			}
		}

		scanner.close();
	}

}