package exercicios;

import java.util.Scanner;

public class Lista03_exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcao = 0;
		int numero1 = 0;
		int numero2 = 0;
		double resultado = 0;

		System.out.println("Informe 1 para somar\nInforme 2 para multiplicar\nInforme 3 para dividir");
		opcao = scanner.nextInt();

		System.out.println("\nInforme o primeiro número: ");
		numero1 = scanner.nextInt();

		System.out.println("\nInforme o segundo número: ");
		numero2 = scanner.nextInt();

		if (opcao == 3 && numero2 == 0) {
			System.out.println("O segundo número não pode ser 0 no caso da escolha de divisão.");
		} else {
			switch (opcao) {
			case 1:
				// Somar
				resultado = numero1 + numero2;
				break;
			case 2:
				// Multiplicar
				resultado = numero1 * numero2;
				break;
			case 3:
				// Dividir
				resultado = (double) numero1 / numero2;
				break;
			default:
				System.out.println("A opção informada não corresponde com nenhuma operação.");
				break;
			}
			System.out.println("Resultado: " + resultado);
		}
		scanner.close();
	}
}