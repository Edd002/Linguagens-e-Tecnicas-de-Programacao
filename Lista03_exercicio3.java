package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista03_exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double salario = 0.0;
		double salarioAjustado = 0.0;
		char sexo = 'a';
		DecimalFormat decimalFormatSalario = new DecimalFormat("#.##");

		System.out.println("Informe o salário: ");
		salario = scanner.nextDouble();

		if (salario < 0) {
			System.out.println("O salário informado não pode ser negativo.");
		} else {
			System.out.println("Informe M para masculino ou F para feminino: ");
			sexo = scanner.next().charAt(0);

			if (sexo != 'M' && sexo != 'F') {
				System.out.println("O sexo informado deve ser M para masculino ou F para feminino.");
			} else {
				if (salario <= 1500.0) {
					salarioAjustado = salario * 1.1; 
				} else if (salario > 1500.0 && salario <= 5000.0) {
					salarioAjustado = salario * 1.05;
				} else {
					salarioAjustado = salario;
				}

				if (sexo == 'F') {
					salarioAjustado += 150.0;
				}
			}

			salarioAjustado = Double.parseDouble(decimalFormatSalario.format((salarioAjustado)));
			System.out.println("O salário final é: " + salarioAjustado);
		}

		scanner.close();
	}
}