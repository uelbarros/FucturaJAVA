package aula2;

import java.util.Scanner;

public class ExercicioMedia {

	public static void main(String[] args) {
		//QuestÃ£o 01 - MÃ©dia dos Alunos 

		Scanner input = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		float nota1 = input.nextFloat();
		System.out.println("Digite a segunda nota: ");
		float nota2 = input.nextFloat();

		float media = (nota1+nota2)/2;
		
		System.out.println("Sua média foi: " +media);

		if (media <= 4) {
			System.out.println("Reprovado!");
		} else if (media > 4 && media <= 6) {
			System.out.println("Recuperação!");
		} else if (media > 6 && media <= 8) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("DESTAQUE!");
		}
		input.close();
	}

}
