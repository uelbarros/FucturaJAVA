package aula6;

public class RevisaoGeral {

	public static void main(String[] args) {

			// Coment�rio de linha

			/*
			 * Coment�rio de multiplas linhas
			 */

			// Tipos de Primitivos
			// Declara��o e tamanho em mem�ria
			byte bt = 12; // -128 a 127
			short s = 32132;
			int n = 123432132;
			long l = 6545454534534L;
			float f = 45.4564654F;
			double d = 5454.1321231D;
			boolean b;
			char c = 's';
			char c1 = '@';

			// Operadores Aritim�ticos
			// + / * - %

			l = s + n;
			System.out.println("s + n = " + l);

			// Operadores Realacionais
			// < > >= <= != ==
			int n1 = 5;
			int n2 = 5;
			float ff = n1 / n2;
			System.out.println(ff);

			// Operadores L�gicos
			// && (and) ||(or) !

			// Operadores Atribui��o
			int contador = 0;
			System.out.println(contador++);
			contador--;
			System.out.println(contador);

			// Estruturas Condicionais
			b = s > n;
			int numero = 9;

			if (numero > 10) {
				System.out.println("Maior que 10");
			} else if (numero == 10) {
				System.out.println("Igual a 10");
			} else {
				System.out.println("menor que 10");
			}

			// Tern�rio
			String resultado;
			resultado = (numero >= 10) ? "verdade" : "falso";
//			 System.out.println(resultado);
			// Ou assim
//			 System.out.println((numero >= 10) ? "verdade" : "falso")

			// Estruturas Repeti��o
			boolean condicao = false;
			// do while
			do {
				// Conteudo de repeti��o
			} while (condicao);

			// while
			while (condicao) {
				// Conteudo de repeti��o
			}

			int valor = 5;
			for (int i = 0; i < valor; i++) {
				// Conteudo de repeti��o
			}

			// Arrays
			// vetor
			int[] vetor = new int[5];
			vetor[0] = 21;
			vetor[1] = 22;
			vetor[2] = 23;
			vetor[3] = 24;
			vetor[4] = 25;
			// 0 1 2 3 4
			int[] vetor1 = { 26, 27, 28, 29, 30 };

			for (int i = 0; i < vetor1.length; i++) {
				if (vetor1[i] % 2 != 0)// if verifica se a posi��o do verto � impar
					System.out.println(vetor1[i]); // exibe no console as posi��es impar
			}

			System.out.println("\n#==== Foreach ====#\n");

			// Foreach
			for (int posicao : vetor1) {
				System.out.println(posicao);
			}

			// matriz
			int[][] matriz = new int[10][10];
			matriz[0][0] = 1;
			matriz[0][1] = 2;
			matriz[0][2] = 3;
			matriz[1][0] = 4;
			matriz[1][1] = 5;
			matriz[1][2] = 6;
			matriz[2][0] = 7;
			matriz[2][1] = 8;
			matriz[2][2] = 9;

			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {// exibe a linha
					if (j != 0) {// matriz[i][j]-> quando a posi��o j diferente de 0
						System.out.print(", ");
					}
					System.out.print(matriz[i][j]);// exibe a posi��o "i" e "j" da matriz
				}
				System.out.println();
			}

			System.out.println("\n#==== Foreach ====#\n");

			for (int[] vetorm : matriz) {
				int cont = 0;
				for (int posicao : vetorm) {
					if (cont != 0) {
						System.out.print(", ");
					}
					cont++;
					System.out.print(posicao);
				}
				System.out.println();
			}

	}

}
