package aula4;

import java.util.Scanner;

public class ExercicioRepeticao1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = input.next();
		System.out.println("Digite um número: ");
		int valorfinal = input.nextInt();
		
		for (int contador = 1; contador <= 2*valorfinal; contador ++) {
			System.out.println(contador + "-" + nome);
		}
		
//		int contador = 0;
//		while (contador <= repeticao) {
//			++contador;
//			System.out.println(contador);
//		}
//		int contador = 1;
//		do {
//			System.out.println(nome);
//			contador++;
//		} while (contador <= repeticao);
	}

}
