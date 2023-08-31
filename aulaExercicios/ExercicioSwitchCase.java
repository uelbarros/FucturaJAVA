package aula3;

import java.util.Scanner;

public class ExercicioSwitchCase {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Por favor, digite:"
				+ "\n1 - Domingo"
				+ "\n2 - Segunda-feira"
				+ "\n3 - Ter�a-feira"
				+ "\n4 - Quarta-feira"
				+ "\n5 - Quinta-feira"
				+ "\n6 - Sexta-feira"
				+ "\n7 - S�bado");
		
		int numero = input.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Hoje � dia de descansar (Domingo), como est� o tempo?");
			String domingo = input.next().toLowerCase();
			switch (domingo) {
			case "sol":
				System.out.println("Bora pra praia");
				break;
			case "nublado":
				System.out.println("Melhor n�o arriscar, fica em casa!");
				break;
			case "chuva":
				System.out.println("Melhor pipoca, cama e filme");
				break;
			default:
				System.out.println("N�o entendi o que voc� digitou!");
				break;
			}
			break;
		case 2:
			System.out.println("Segunda-feira, bora trabalhar! Voc� trabalha de manh�, tarde ou noite?");
			String turno = input.next().toLowerCase();
			if (turno.equals("manh�")) {
				System.out.println("Levanta logo!");
			} else if (turno.equals("tarde")) {
				System.out.println("Se prepare pra mais tarde!");
			} else if (turno.equals("noite")) {
				System.out.println("Pois volte a dormir!");
			} else {
				System.out.println("N�o entendi, voc� n�o trabalha?");
			}
			break;
		case 3:
			System.out.println("Ter�a-feira, ainda tem trabalho!");
			break;
		case 4:
			System.out.println("Quarta-feira, tem trabalho, mas tem futebol!");
			break;
		case 5:
			System.out.println("Quinta-feira, dia de #tbt");
			break;
		case 6:
			System.out.println("Sextooou!!!");
			break;
		case 7:
			System.out.println("S�bado, vamos estudar Java");
			break;
		default:
			System.out.println("Desculpe, não entendi a op��oo digitada.");
			break;
		}
		input.close();
	}


}
