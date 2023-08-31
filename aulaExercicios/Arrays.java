package aula5;

public class Arrays {

	public static void main(String[] args) {
		int[] vetor = new int[8];
		
		System.out.println("Comprimento do vetor: "+ vetor.length);
		int valor = 0;
		for (int i=1; i<=vetor.length; i++) {
			vetor[i] = valor+=2; // valor = valor + 2
			System.out.println(vetor [i]);
		}
		
//		vetor[0] = 2;
//		vetor[1] = 3;
//		vetor[2] = 4;
//		vetor[3] = 5;
//		vetor[4] = 6;
		
//		for (int i= 0; i<vetor.length; i++) {
//			System.out.println(vetor [i]);
//		}

	}

}
