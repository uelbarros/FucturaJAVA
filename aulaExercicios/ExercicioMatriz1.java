package aula5;

public class ExercicioMatriz1 {

	public static void main(String[] args) {
		
		int[][] matriz = new int [3][3];
		
		int soma = 0;
		System.out.println("O tamanho da matriz �: " + matriz.length);
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = soma+=1;
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "|");
			}		
			System.out.println();
		}

	}

}
