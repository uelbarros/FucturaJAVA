package aula3;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// Estrutura Switch Case

		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();

		switch (valor) {
		case 1:
			System.out.println("Primeiro case foi acionado!");
			break;
		case 2:
			System.out.println("Segundo case foi acionado!");
			break;
		case 3:
			System.out.println("Terceiro case foi acionado!");
			break;
		default:
			System.out.println("Nenhum case foi acionado!");
		}

	}

}
