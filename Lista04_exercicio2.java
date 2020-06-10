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
			System.out.println("Informe \"A\" para multiplicar dois n�mero");
			System.out.println("Informe \"B\" para dividir dois n�meros");
			System.out.println("Informe \"C\" para somar dois n�mero");
			System.out.println("Informe \"D\" para sair\n");
			opcao = scanner.next().charAt(0);

			if (opcao == 'D')
				break;
			else if (opcao != 'A' && opcao != 'B' && opcao != 'C')
				System.out.println("Digite uma op��o v�lida para uma opera��o.\n\n");
			else {
				System.out.println("Informe o primeiro n�mero: ");
				numero1 = scanner.nextDouble();

				System.out.println("Informe o segundo n�mero: ");
				numero2 = scanner.nextDouble();

				if (opcao == 'B' && numero2 == 0)
					System.out.println("A divis�o por 0 n�o � metematicamente v�lida.\n\n");
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