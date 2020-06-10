package exercicios;

import java.util.Scanner;

public class Lista04_exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double salario = 0.0;
		double salarioReajustado = 0.0;
		double somaSalariosReajustados = 0.0;
		double mediaSalariosReajustados = 0.0;
		int contador = 0;

		do {
			System.out.println("Informe o salário da " + (contador + 1) + "ª pessoa: ");
			salario = scanner.nextDouble();

			if (salario < 0) {
				System.out.println("O salário informado deve ser maior do que 0.\n\n");
			} else {
				salarioReajustado = salario * 1.1;
				somaSalariosReajustados += salarioReajustado;
				contador++;
			}
		} while (contador < 50);

		System.out.println(contador);

		mediaSalariosReajustados = somaSalariosReajustados / contador;

		System.out.println("Soma dos salários reajustados: " + somaSalariosReajustados);
		System.out.println("Média dos salários reajustados: " + mediaSalariosReajustados);

		scanner.close();
	}
}