package aula5;

public class Matriz {

	public static void main(String[] args) {
		int [][] matriz = new int[3][2];
		
		int valor = 0;
		System.out.println(matriz.length);
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
			matriz[i][j] = valor+=1;
			}
		}

		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
			System.out.print(matriz[i][j]+"|");
			}
			System.out.println();
		}
//		System.out.println(matriz[0][0]+", "+ matriz[0][1]+", "+matriz[0][2]);
	}

}