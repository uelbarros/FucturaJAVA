package exerciciosfuctura;

import java.util.Scanner;

public class ExercicioRevisao3 {

	public static void main(String[] args) {
		
		/* 	Faça um programa que leia 10 valores para uma variável n e, para cada um deles,
			calcule a tabuada de 1 até n. Mostre a tabuada na forma:
			1 x n = n
			2 x n = 2n
			3 x n = 3n
			. . . ...
			n x n = n*n
		 */

		Scanner entrada = new Scanner(System.in);
		
		
		int[] vetor = new int[10];
		
		System.out.println("O tamanho do vetor é: " + vetor.length);
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Por favor, insira 10 números: ");
			int numero = entrada.nextInt();
			vetor[i] = numero;
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "|");
		}
		
		System.out.println("\nO resultado da tabuada dos números escolhidos é: ");
		System.out.println("1 x " + vetor[0] + " = " + vetor[0]*1);
		System.out.println("2 x " + vetor[1] + " = " + vetor[1]*2);
		System.out.println("3 x " + vetor[2] + " = " + vetor[2]*3);
		System.out.println("4 x " + vetor[3] + " = " + vetor[3]*4);
		System.out.println("5 x " + vetor[4] + " = " + vetor[4]*5);
		System.out.println("6 x " + vetor[5] + " = " + vetor[5]*6);
		System.out.println("7 x " + vetor[5] + " = " + vetor[6]*7);
		System.out.println("8 x " + vetor[7] + " = " + vetor[7]*8);
		System.out.println("9 x " + vetor[8] + " = " + vetor[8]*9);
		System.out.println("10 x " + vetor[9] + " = " + vetor[9]*10);

	}
}
