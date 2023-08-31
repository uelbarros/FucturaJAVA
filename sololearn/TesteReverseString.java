package sololearn;

import java.util.Scanner;

public class TesteReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
		char entrada = ' ';
		String saida = Character.toString(entrada);
		
		for (int i = arr.length-1; i >= 0; i--) {
			saida += arr[i]; // saida = saida + arr[i]
		}
		System.out.println(saida);
	}

}
