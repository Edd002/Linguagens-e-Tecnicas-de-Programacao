package trabalhos;

import java.util.Scanner;

public class Trabalho2VersaoWhile {

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

		while (true) {
			// Reinicializar a var�vel opcao
			opcao = 0;

			while (opcao != 1 && opcao != 2 && opcao != 3) {
				System.out.println("Informe: \n1- Sequ�ncia Fibonacci\n2- C�lculo fatorial\n3- Sair");
				opcao = scanner.nextInt();

				if (opcao != 1 && opcao != 2 && opcao != 3)
					System.out.println("Informe uma op��o v�lida.\n\n");
			}

			if (opcao == 1) {
				// Reinicializar a var�vel quantiadeTermosExibidosFibonacci
				quantiadeTermosExibidosFibonacci = 0;

				while (quantiadeTermosExibidosFibonacci % 1 != 0 || quantiadeTermosExibidosFibonacci <= 0) {
					System.out.println("\n\nSEQU�NCIA FIBONACCI");
					System.out.println("\nInforme a quantidade de termos a ser exibidos na tela: ");
					quantiadeTermosExibidosFibonacci = scanner.nextDouble();

					if (quantiadeTermosExibidosFibonacci % 1 != 0 && quantiadeTermosExibidosFibonacci <= 0)
						System.out.println("O n�mero informado deve ser inteiro e positivo.\n");
					else if (quantiadeTermosExibidosFibonacci % 1 != 0)
						System.out.println("O n�mero informado deve ser inteiro.\n");
					else if (quantiadeTermosExibidosFibonacci <= 0)
						System.out.println("O n�mero informado deve ser positivo.\n");
				}

				System.out.println("\n");

				// Reinicializar vari�veis caso o usu�rio execute o programa mais de uma vez
				somatorioFibonacci = 1;
				primeiroTermoFibonacci = 0;
				segundoTermoFibonacci = 1;
				contadorFibonacci = 0;

				while (quantiadeTermosExibidosFibonacci > 0) {
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
				}
			} else if (opcao == 2) {
				// Reinicializar a var�vel numeroFatorial
				numeroFatorial = -1;

				while (numeroFatorial % 1 != 0 || numeroFatorial < 0) {
					System.out.println("\n\nFATORIAL");
					System.out.println("\nInforme um n�mero para o c�lculo do seu fatorial: ");
					numeroFatorial = scanner.nextDouble();

					if (numeroFatorial % 1 != 0 && numeroFatorial < 0)
						System.out.println("O n�mero informado deve ser inteiro e n�o negativo.");
					else if (numeroFatorial % 1 != 0)
						System.out.println("O n�mero informado deve ser inteiro.\n");
					else if (numeroFatorial < 0)
						System.out.println("O n�mero informado n�o pode ser negativo.\n");
				}

				System.out.println("\n");

				// Reinicializar vari�vel caso o usu�rio execute o programa mais de uma vez e definir o resultado para fatorial de 0
				resultadoFatorial = 1;

				if (numeroFatorial != 0) {
					while (numeroFatorial > 0) {
						// Exemplo de fatorial de 5: 5! = 5 x 4 x 3 x 2 x 1 = 120
						resultadoFatorial *= numeroFatorial;
						numeroFatorial--;
					}
				}

				System.out.println("\nO resultado do fatorial do n�mero informado �: " + resultadoFatorial);
			} else
				break;

			System.out.println("\n\n");
		}

		System.out.println("\n\nFim do programa.");

		scanner.close();
	}
}