package exerciciosfuctura;

import java.util.Scanner;

public class ExercicioRevisao5_1 {

	public static void main(String[] args) {
		/* 	Ler uma lista de 5 n�meros inteiros e mostre cada n�mero juntamente
			com a sua posi��o na lista.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = new int[5];
		
		System.out.println("Digite 5 n�meros para compor o vetor.");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite 1 n�mero: ");
			int numero = entrada.nextInt();
			vetor[i] = numero;
		}
		
		System.out.println("Os n�meros escolhidos para compor o vetor foram:");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "|");
		}
	}

}
