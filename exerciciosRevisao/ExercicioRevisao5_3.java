package exerciciosfuctura;

import java.util.Scanner;

public class ExercicioRevisao5_3 {

	public static void main(String[] args) {
		/* 	Faça um programa que crie uma matriz M (com valores informados do
			usuário) e mostre a matriz com o dobro dos valores lidos (2*M)
		 */
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o tamanho da matriz 'l x c' (onde: l = linha | c = coluna)");
		
		System.out.println("Digite a quantidade de linhas (l): ");
		int l = entrada.nextInt();
		System.out.println("Digite a quantidade de colunas (c): ");
		int c = entrada.nextInt();
		
		int[][] matriz = new int[l][c];

		System.out.println("A matriz é do tipo " + l + "x" + c);
		System.out.println("Tamanho da matriz: " + matriz.length);
		
		for(int i = 0 ; i<matriz.length ; i++) {
			for(int j = 0 ; j<matriz[0].length ; j++) {
				System.out.println("Digite um número para preencher a matriz: ");
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		for(int i = 0 ; i<matriz.length ; i++) {
			for(int j = 0 ; j<matriz[0].length ; j++) {
				System.out.print(matriz [i][j]*2 + "|");
			}
			System.out.println();
		}
	}

}
