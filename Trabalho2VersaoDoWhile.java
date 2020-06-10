package trabalhos;

import java.util.Scanner;

public class Trabalho2VersaoDoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int opcao = 0;
		int somatorioFibonacci = 1;
		int primeiroTermoFibonacci = 0;
		int segundoTermoFibonacci = 1;
		int contadorFibonacci = 0;
		int resultadoFatorial = 1;
		double quantiadeTermosExibidosFibonacci = 0; // posteriormente validado para inteiro
		double numeroFatorial = -1; // posteriormente validado para inteiro

		do {
			do {
				System.out.println("Informe: \n1- Sequência Fibonacci\n2- Cálculo fatorial\n3- Sair");
				opcao = scanner.nextInt();

				if (opcao != 1 && opcao != 2 && opcao != 3)
					System.out.println("Informe uma opção válida.\n\n");
			} while (opcao != 1 && opcao != 2 && opcao != 3);

			if (opcao == 1) {
				do {
					System.out.println("\n\nSEQUÊNCIA FIBONACCI");
					System.out.println("\nInforme a quantidade de termos a ser exibidos na tela: ");
					quantiadeTermosExibidosFibonacci = scanner.nextDouble();

					if (quantiadeTermosExibidosFibonacci % 1 != 0 && quantiadeTermosExibidosFibonacci <= 0)
						System.out.println("O número informado deve ser inteiro e positivo.\n");
					else if (quantiadeTermosExibidosFibonacci % 1 != 0)
						System.out.println("O número informado deve ser inteiro.\n");
					else if (quantiadeTermosExibidosFibonacci <= 0)
						System.out.println("O número informado deve ser positivo.\n");
				} while (quantiadeTermosExibidosFibonacci % 1 != 0 || quantiadeTermosExibidosFibonacci <= 0);

				System.out.println("\n");

				// Reinicializar variáveis caso o usuário execute o programa mais de uma vez
				somatorioFibonacci = 1;
				primeiroTermoFibonacci = 0;
				segundoTermoFibonacci = 1;
				contadorFibonacci = 0;

				do {
					// 0 (fixo)
					// 1 (fixo)
					// 1 = 0 + 1
					// 2 = 1 + 1
					// 3 = 1 + 2
					// 5 = 2 + 3
					// 8 = 3 + 5
					// 13 = 5 + 8
					// 21 = 8 + 13
					// ...

					if (contadorFibonacci == 0) {
						System.out.print(0 + "  ");
					} else if (contadorFibonacci == 1) {
						System.out.print(1 + "  ");
					} else {
						System.out.print(somatorioFibonacci + "  ");
						primeiroTermoFibonacci = segundoTermoFibonacci;
						segundoTermoFibonacci = somatorioFibonacci;
						somatorioFibonacci = primeiroTermoFibonacci + segundoTermoFibonacci;
					}

					quantiadeTermosExibidosFibonacci--;
					contadorFibonacci++;
				} while (quantiadeTermosExibidosFibonacci > 0);
			} else if (opcao == 2) {
				do {
					System.out.println("\n\nFATORIAL");
					System.out.println("\nInforme um número para o cálculo do seu fatorial: ");
					numeroFatorial = scanner.nextDouble();

					if (numeroFatorial % 1 != 0 && numeroFatorial < 0)
						System.out.println("O número informado deve ser inteiro e não negativo.");
					else if (numeroFatorial % 1 != 0)
						System.out.println("O número informado deve ser inteiro.\n");
					else if (numeroFatorial < 0)
						System.out.println("O número informado não pode ser negativo.\n");
				} while (numeroFatorial % 1 != 0 || numeroFatorial < 0);

				System.out.println("\n");

				// Reinicializar variável caso o usuário execute o programa mais de uma vez e definir o resultado para fatorial de 0
				resultadoFatorial = 1;

				if (numeroFatorial != 0) {
					do {
						// Exemplo de fatorial de 5: 5! = 5 x 4 x 3 x 2 x 1 = 120
						resultadoFatorial *= numeroFatorial;
						numeroFatorial--;
					} while (numeroFatorial > 0);
				}

				System.out.println("\nO resultado do fatorial do número informado é: " + resultadoFatorial);
			} else
				break;

			System.out.println("\n\n");
		} while (true);

		System.out.println("\n\nFim do programa.");

		scanner.close();
	}
}