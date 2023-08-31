package exerciciosfuctura;

import java.util.Scanner;

public class ExercicioRevisao5_2 {

	public static void main(String[] args) {
			/* 	Inicialize uma lista de 20 números inteiros. Armazene os números pares
				em uma lista PAR e os números ímpares em uma lista IMPAR. Imprima as listas PAR
				e IMPAR.
			 */
		
		Scanner entrada = new Scanner (System.in);
		
		int[] vetor = new int [20];
		
		System.out.println("Escolha 20 números aleatórios");
		
		for(int i = 0 ; i < vetor.length ; i++) {
			System.out.println("Digite um número: ");
			vetor [i] = entrada.nextInt();
		}
		System.out.println("\nOs 20 números escolhidos foram:");
		for(int i = 0 ; i < vetor.length ; i++) {
			System.out.print(vetor[i] + "|");
		}
		System.out.println("\n\nOs números pares escolhidos foram:");		
		for(int i = 0 ; i < vetor.length ; i++) {
			if (vetor[i]%2 == 0) {
				System.out.print(vetor[i] + "|");
			} 
		}
		System.out.println("\n\nOs números ímpares escolhidos foram:");
		for(int i = 0 ; i < vetor.length ; i++) {
			if (vetor[i]%2 != 0) {
				System.out.print(vetor[i] + "|");
			}
		}
	}

}
