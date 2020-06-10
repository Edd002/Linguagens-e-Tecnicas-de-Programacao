package exercicios;

import java.util.Scanner;

public class Lista04_exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double salario = 0.0;
		double salarioAposAumento = 0.0;
		double somaSalarioFeminino = 0.0;
		double totalFolhaPagentoAntesAumento = 0.0;
		double totalFolhaPagentoAposAumento = 0.0;
		double mediaSalarialFemininaAposAumento = 0.0;
		double totalPagementosMasculinoAposAumento = 0.0;
		double menorSalarioAposAumento = Double.MAX_VALUE;
		double maiorSalarioAposAumento = 0.0;
		String percentualAumento = null;
		char sexo = 'X';
		char sexoMaiorSalarioAposAumento = 'X';
		char sexoMenorSalarioAposAumento = 'X';
		int contadorFuncionarios = 0;
		int contadorFuncionariosFemininos = 0;

		do {
			do {
				System.out.println("Informe o salário do funcionário da empresa XPTO: ");
				salario = scanner.nextDouble();
				if (salario < 0)
					System.out.println("O salário não pode ser negativo.\n");
			} while (salario < 0);

			do {
				System.out.println("Informe o sexo do funcionário da empresa XPTO: ");
				sexo = scanner.next().charAt(0);
				if (sexo != 'M' && sexo != 'F')
					System.out.println("Sexo inválido.\n");
			} while (sexo != 'M' && sexo != 'F');

			if (salario <= 1500.0) {
				percentualAumento = "20%";
				salarioAposAumento = salario * 1.2;
			} else if (salario > 1500.0 && salario <= 5000.0) {
				percentualAumento = "10%";
				salarioAposAumento = salario * 1.1;
			} else if (salario > 5000.0 && salario <= 15000.00) {
				percentualAumento = "5%";
				salarioAposAumento = salario * 1.05;
			} else {
				salarioAposAumento = salario;
			}

			if (sexo == 'F') {
				somaSalarioFeminino += salarioAposAumento;
				contadorFuncionariosFemininos++;
			}

			if (sexo == 'M') {
				totalPagementosMasculinoAposAumento += salarioAposAumento;
			}

			if (menorSalarioAposAumento > salarioAposAumento) {
				menorSalarioAposAumento = salarioAposAumento;
				sexoMaiorSalarioAposAumento = sexo;
			}

			if (maiorSalarioAposAumento < salarioAposAumento) {
				maiorSalarioAposAumento = salarioAposAumento;
				sexoMenorSalarioAposAumento = sexo;
			}
			
			totalFolhaPagentoAntesAumento += salario;
			totalFolhaPagentoAposAumento += salarioAposAumento;

			System.out.println("Novo salário do funcionário: " + salarioAposAumento);
			System.out.println("Percentual de aumento do funcionário: " + percentualAumento + "\n\n");

			contadorFuncionarios++;
		} while (contadorFuncionarios < 2); // 500

		if (contadorFuncionariosFemininos > 0)
			mediaSalarialFemininaAposAumento = somaSalarioFeminino / contadorFuncionariosFemininos;
		else
			mediaSalarialFemininaAposAumento = 0;

		System.out.println("Total da folha de pagamento antes do aumento: " + totalFolhaPagentoAntesAumento);
		System.out.println("Total da folha de pagamento após o aumento: " + totalFolhaPagentoAposAumento);
		System.out.println("Média salaria feminina após o aumento: " + mediaSalarialFemininaAposAumento);
		System.out.println("Total dos pagamentos masculino após o aumento: " + totalPagementosMasculinoAposAumento);
		System.out.println("Sexo do funcionário com menor salário após o aumento: " + sexoMaiorSalarioAposAumento);
		System.out.println("Sexo do funcionário com maior salário após o aumento: " + sexoMenorSalarioAposAumento);

		scanner.close();
	}
}