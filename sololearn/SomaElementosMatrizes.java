package sololearn;

import java.util.Scanner;

public class SomaElementosMatrizes {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		int[] array = new int[length];
//		for (int i = 0; i < length; i++) {
//			array[i] = scanner.nextInt();
//		}

		int mult = 0;
		for (int j = 0; j < length; j++) {
			array[j] = scanner.nextInt();{
				if (array[j]%4 == 0) {
					mult += array[j];
				}
			}
		}	System.out.println(mult);
scanner.close();
	}

}
