package aula4;

import java.util.Scanner;

public class EstruturaForScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor que você quer imprimir:");
		int valorfinal = input.nextInt();
		
		for (int contador = 1; contador <= valorfinal; contador++) {
			System.out.println(contador);
		}

	}

}
