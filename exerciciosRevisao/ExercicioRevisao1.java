package exerciciosfuctura;

import java.util.Scanner;

public class ExercicioRevisao1 {

	public static void main(String[] args) {
		
		/* 	Crie um programa que irá ler o nome de dois times e em seguida o placar da partida. O
			usuário irá entrar com as informações dos dois times, como nome e número de gols
			daquela partida. Ao final, retorne ao usuário quem foi o vencedor da partida.
		*/

		Scanner entrada = new Scanner(System.in);

		//DECLARAR VARIÁVEIS (obs: tirar duvida pq com conversao pra BIG nao le nomes com espaço?)
		System.out.println("Digite o nome do TIME 1: ");
		String time1 = entrada.nextLine();
		System.out.println("Digite o nome do TIME 2: ");
		String time2 = entrada.nextLine();

		System.out.println("Quantos gols o " + time1 + " marcou?");
		int goltime1 = entrada.nextInt();
		System.out.println("Quantos gols o " + time2 + " marcou?");
		int goltime2 = entrada.nextInt();

		System.out.println("O placar da partida foi: " + time1 +" "+ goltime1 + "x" + goltime2 +" "+ time2);

		if(goltime1 > goltime2) {
			System.out.println("O " + time1 + " foi o vencedor do jogo.");
			System.out.println("PARABÉNS " + time1 + "!!!!!");
		}else {
			System.out.println("O " + time2 + " foi o vencedor do jogo.");
			System.out.println("PARABÉNS " + time2 + "!!!!!");
		}

	}

}
