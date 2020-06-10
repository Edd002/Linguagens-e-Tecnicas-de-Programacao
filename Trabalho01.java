// Caminho do arquivo para entregar: U:\Linguagens e Técnicas de Programação 1\workspace\LTP1\src\trabalhos

package trabalhos;

import java.util.Scanner;

public class Trabalho01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double salarioBruto = 0;
		double imposto = 0;
		double gratificacao = 0;
		double salarioLiquido = 0;
		int tempoServicoAnos = 0;

		System.out.println("Informe o salário bruto: ");
		salarioBruto = scanner.nextDouble();

		if (salarioBruto <= 0) {
			System.out.println("O salário bruto não pode ser menor ou igual a 0.");
		} else {
			System.out.println("Informe o tempo de serviço: ");
			tempoServicoAnos = scanner.nextInt();

			if (tempoServicoAnos < 0) {
				System.out.println("O tempo de serviço não pode ser menor do que 0.");
			} else {
				if (salarioBruto <= 500)
					imposto = 0;
				else if (salarioBruto > 500 && salarioBruto <= 1500)
					imposto = salarioBruto * 0.03;
				else if (salarioBruto > 1500 && salarioBruto <= 3000)
					imposto = salarioBruto * 0.08;
				else
					imposto = salarioBruto * 0.12;

				if (salarioBruto > 2000) {
					if (tempoServicoAnos <= 3)
						gratificacao = 20;
					else
						gratificacao = 35;
				} else {
					if (tempoServicoAnos <= 3)
						gratificacao = 23;
					else if (tempoServicoAnos > 3 && tempoServicoAnos <= 6)
						gratificacao = 30;
					else
						gratificacao = 40;
				}
				salarioLiquido = salarioBruto - imposto + gratificacao;
				System.out.println("O salário Líquido é: " + salarioLiquido);
			}
		}
		scanner.close();
	}
}