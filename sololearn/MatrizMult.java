package sololearn;

public class MatrizMult {

	public static void main(String[] args) {
		int[][] matrix = {
				{8, 1, 6},
				{3, 5, 7},
				{4, 9, 0},
		};
		//output the numbers
		System.out.println("O valor da matriz é: "+matrix.length);
		
		for(int i = 0; i<matrix.length; i++) {
			for(int j = 0; j<matrix.length; j++){
				System.out.print(matrix[i][j]+"|");
			}
			System.out.println();
		}
	}

}
