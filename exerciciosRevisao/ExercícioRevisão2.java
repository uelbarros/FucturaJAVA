package exerciciosfuctura;

import java.util.Scanner;

public class Exerc�cioRevis�o2 {

	public static void main(String[] args) {
		
		/* 	Fa�a um programa que ir� cadastrar um cadastro de cliente em uma rede de farm�cias.
			Leia o nome, o sexo e o estado civil de uma pessoa. Caso o sexo seja "F" e o estado
			civil seja "CASADA", solicitar o tempo de casada (anos). Se a idade for maior do que
			25 anos, imprima: "Voc� tem 25% de desconto nos nossos rem�dios".
		 */

		Scanner entrada = new Scanner(System.in);
		
		// Declarar variaveis
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Qual seu sexo?"
				+"\n1 - 'M' (Masculino)"
				+"\n2 - 'F' (Feminino)");
		int sexo = entrada.nextInt();
		System.out.println("Qual seu estado civil?"
				+"\n1 - Solteiro(a)"
				+"\n2 - Casado(a)"
				+"\n3 - Outros");
		int estadociv = entrada.nextInt();
		
		System.out.println("Seja bem vindo " + nome + "!");
		
		if(sexo == 2 && estadociv == 2) {
			System.out.println("\nVemos que voc� � Casada! A quanto tempo a Sra. " + nome + " � casada?");
			int tempcasada = entrada.nextInt();
			if(tempcasada >= 25) {
				System.out.println("\nParab�ns!! Voc� tem 25% de desconto em nossos rem�dios!");
			}else {
				System.out.println("\nQue legal!! Continue aproveitando os nossos produtos oferecidos!");
			}
		}
		System.out.println("Boas compras!");
	}

}
