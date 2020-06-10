package exercicios;

import java.util.Scanner;

public class Lista04_exercicio4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int idade = 0;
		int quantidadeAlunosClassificacaoJunior = 0;
		int quantidadeAlunosClassificacaoAdulto = 0;
		int quantidadeAlunosClassificacaoMelhorIdade = 0;
		int menorIdade = Integer.MAX_VALUE;
		int maiorIdade = 0;
		double percentualAlunosClassificacaoAdulto = 0.0;
		double tempoAnosTreinamentoAcademiaAdulto = 0.0;
		double totalTempoTreinamentoAnosAlunosAdultos = 0.0;
		double mediaTempoTreinamentoAnosAlunosAdultos = 0.0;
		char verificarIniciarPrograma = 'X';

		do {
			do {
				System.out.println("Informe S para inicar o programa e N para sair: ");
				verificarIniciarPrograma = scanner.next().charAt(0);

				if (verificarIniciarPrograma != 'S' && verificarIniciarPrograma != 'N')
					System.out.println("Informe uma entrada válida.\n");
			} while (verificarIniciarPrograma != 'S' && verificarIniciarPrograma != 'N');

			if (verificarIniciarPrograma == 'N')
				break;

			do {
				System.out.println("\n\nInforme a idade: ");
				idade = scanner.nextInt();

				if (idade < 0)
					System.out.println("A idade não pode ser menor do que 0.\n");
				else if (idade > 120)
					System.out.println("A idade não pode ser maior do que 120.\n");
			} while (idade < 0 || idade > 120);

			if (idade < 16) {
				quantidadeAlunosClassificacaoJunior++;
				System.out.println("Classificação do nadador: Júnior \n\n");
			} else if (idade >= 16 && idade < 65) {
				do {
					System.out.println("\n\nInforme o tempo de treinamento na academia em anos: ");
					tempoAnosTreinamentoAcademiaAdulto = scanner.nextDouble();

					if (tempoAnosTreinamentoAcademiaAdulto < 0)
						System.out.println("O tempo de treinamento na academia em anos não pode ser menor do que 0.\n");
					else if (tempoAnosTreinamentoAcademiaAdulto % 1 != 0)
						System.out.println("O tempo de teinamento na academia em anos deve ser uma número inteiro.\n");
					else
						totalTempoTreinamentoAnosAlunosAdultos += tempoAnosTreinamentoAcademiaAdulto;
				} while (tempoAnosTreinamentoAcademiaAdulto < 0 || (tempoAnosTreinamentoAcademiaAdulto % 1 != 0));

				quantidadeAlunosClassificacaoAdulto++;
				System.out.println("Classificação do nadador: Adulto\n\n");
			} else {
				quantidadeAlunosClassificacaoMelhorIdade++;
				System.out.println("Classificação do nadador: Melhor Idade\n\n");
			}

			if (idade < menorIdade)
				menorIdade = idade;

			if (idade > maiorIdade)
				maiorIdade = idade;
		} while (true);

		if (quantidadeAlunosClassificacaoJunior == 0 && quantidadeAlunosClassificacaoAdulto == 0 && quantidadeAlunosClassificacaoMelhorIdade == 0)
			percentualAlunosClassificacaoAdulto = 0;
		else
			percentualAlunosClassificacaoAdulto = (double) (quantidadeAlunosClassificacaoAdulto / (double) (quantidadeAlunosClassificacaoAdulto + quantidadeAlunosClassificacaoJunior + quantidadeAlunosClassificacaoMelhorIdade)) * 100;

		if (quantidadeAlunosClassificacaoAdulto == 0)
			mediaTempoTreinamentoAnosAlunosAdultos = totalTempoTreinamentoAnosAlunosAdultos;
		else
			mediaTempoTreinamentoAnosAlunosAdultos = totalTempoTreinamentoAnosAlunosAdultos / quantidadeAlunosClassificacaoAdulto;

		System.out.println("Quantidade de alunos na classificação Júnior: " + quantidadeAlunosClassificacaoJunior);
		System.out.println("Percentual de alunos na classificação Adulto: " + percentualAlunosClassificacaoAdulto + "%");
		System.out.println("Média de tempo de treinamento de alunos classificados como adultos: " + mediaTempoTreinamentoAnosAlunosAdultos);
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Menor idade: " + menorIdade);

		scanner.close();
	}
}