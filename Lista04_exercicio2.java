package exercicios;

import java.util.Scanner;

public class Lista04_exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double numero1 = 0.0;
		double numero2 = 0.0;
		double resultado = 0.0;
		char opcao = 'X';

		do {
			System.out.println("Informe \"A\" para multiplicar dois número");
			System.out.println("Informe \"B\" para dividir dois números");
			System.out.println("Informe \"C\" para somar dois número");
			System.out.println("Informe \"D\" para sair\n");
			opcao = scanner.next().charAt(0);

			if (opcao == 'D')
				break;
			else if (opcao != 'A' && opcao != 'B' && opcao != 'C')
				System.out.println("Digite uma opção válida para uma operação.\n\n");
			else {
				System.out.println("Informe o primeiro número: ");
				numero1 = scanner.nextDouble();

				System.out.println("Informe o segundo número: ");
				numero2 = scanner.nextDouble();

				if (opcao == 'B' && numero2 == 0)
					System.out.println("A divisão por 0 não é metematicamente válida.\n\n");
				else {
					if (opcao == 'A')
						resultado = numero1 * numero2;
					else if (opcao == 'B')
						resultado = numero1 / numero2;
					else
						resultado = numero1 + numero2;

					System.out.println("Resultado: " + resultado + "\n\n");
				}
			}
		} while (true);

		System.out.println("\n\nPrograma finalizado.");

		scanner.close();
	}
}