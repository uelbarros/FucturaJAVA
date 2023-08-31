package aula5;

import java.util.Scanner;

public class TabuadaArrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		boolean stop = true;
		
		do {
		
		System.out.println("\nQual tabuada você deseja? " 
				+ "\n1- Tabuada de 1" 
				+ "\n2- Tabuada de 2" 
				+ "\n3- Tabuada de 3"
				+ "\n4- Tabuada de 4" 
				+ "\n5- Tabuada de 5" 
				+ "\n6- Tabuada de 6" 
				+ "\n7- Tabuada de 7" 
				+ "\n8- Tabuada de 8"
				+ "\n9- Tabuada de 9" 
				+ "\n10- Tabuada de 10"
				+ "\n0- Finalizar Tabuada");

		int tabuada = input.nextInt();

		int[] vetor = {0,1,2,3,4,5,6,7,8,9,10};
			
		switch (tabuada) {
		case 1: {
			for (int i = 0 ; i < vetor.length ; i++)
				System.out.println("A Tabuada de 1x" + vetor[i] + " - " + vetor[i] * 1);
			break;
		}
		case 2: {
			for (int i = 0 ; i < vetor.length ; i++)
				System.out.println("A Tabuada de 2x" + vetor[i] + " - " + vetor[i] * 2);
			break;
		}
		case 3: {
			for (int i = 0 ; i < vetor.length ; i++)
				System.out.println("A Tabuada de 3x" + vetor[i] + " - " + vetor[i] * 3);
			break;
		}
		case 4: {
			for (int i = 0 ; i < vetor.length ; i++)
				System.out.println("A Tabuada de 4x" + vetor[i] + " - " + vetor[i] * 4);
			break;
		}
		case 5: {
			for (int i = 0 ; i < vetor.length ; i++)
				System.out.println("A Tabuada de 5x" + vetor[i] + " - " + vetor[i] * 5);
			break;
		}
		case 6: {
			for (int i = 0 ; i < vetor.length ; i++)
				System.out.println("A Tabuada de 6x" + vetor[i] + " - " + vetor[i] * 6);
			break;
		}
		case 7: {
			for (int i = 0 ; i < vetor.length ; i++)
				System.out.println("A Tabuada de 7x" + vetor[i] + " - " + vetor[i] * 7);
			break;
		}
		case 8: {
			for (int i = 0 ; i < vetor.length ; i++)
				System.out.println("A Tabuada de 8x" + vetor[i] + " - " + vetor[i] * 8);
			break;
		}
		case 9: {
			for (int i = 0 ; i < vetor.length ; i++)
				System.out.println("A Tabuada de 9x" + vetor[i] + " - " + vetor[i] * 9);
			break;
		}
		case 10: {
			for (int i = 0 ; i < vetor.length ; i++)
				System.out.println("A Tabuada de 10x" + vetor[i] + " - " + vetor[i] * 10);
			break;
		}
		case 0:{
			System.out.println("Quando você tiver dúvida em alguma tabuda, pode voltar aqui. Obrigado!");
			stop = false;
			break;
		}
		default:
			break;
		}
		
		} while (stop);
		
		input.close();
	}

}
