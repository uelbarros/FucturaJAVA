package aula5;

public class ExercicioArrays1 {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		
		System.out.println("Tamanho do vetor: " + vetor.length);
		
		int acres = 0;
		
		for (int i = 0 ; i < vetor.length ; i++) {
			vetor [i] = acres+=3;
			System.out.println(vetor[i]);
		}

	}

}
