package aulas;
// �rea Global

public class Aula01 {

	public static void main(String[] args) {
		// Coment�rio de linha

		/*
		 * Coment�rio Bloco
		 */
		int contador = -10;

		// Teste 1
		System.out.println("Teste 1");
		System.out.println();

		do {
			if (contador > 0) {
				System.out.println("Positivo");
			} else if (contador < 0) {
				System.out.println("Negativo");
			} else {
				System.out.println("Neutro");
			}

			contador++;
		} while (contador <= 10);
	}
}