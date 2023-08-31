package aula6;

import java.util.Iterator;

public class ForEach {

	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		int[] vetor2 = {1, 35, 355, 60};
		int[][] matriz = new int [5][2];
		
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println(vetor2[i]);
		}
		System.out.println();
		
		for (int posicao : vetor2) {
			System.out.println(posicao);
		}
	}

}
