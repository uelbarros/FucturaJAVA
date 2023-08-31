package exerciciosfuctura;

import java.util.Scanner;

public class ExercicioRevisao4 {

	public static void main(String[] args) {
		
		/* Faça um programa que represente um sistema de entradas e saídas de caixa. Se for uma
		entrada, soma o valor ao total do caixa, se for uma saída, subtraia o valor do total do
		caixa. Ao fim de todas as entradas e saídas, se o total do caixa for positivo, imprima na
		tela: Saldo positivo, senão, imprima: Saldo negativo. */
		
		Scanner teclado = new Scanner(System.in);
		
		double entrada = 0;
		double saida = 0;
		
		boolean stop = true;
		
		do {
			
		System.out.println("Programa de Fluxo de Caixa"
				+ "\nVOCÊ DESEJA REGISTRAR:"
				+ "\n1 - Entrada"
				+ "\n2 - Saída"
				+ "\n3 - Finalizar");
		
		int operacao = teclado.nextInt();
		
		switch (operacao) {
		case 1:
			System.out.println("Digite o valor da ENTRADA: R$ ");
			double entrada1 = teclado.nextDouble();
			entrada += entrada1;
			break;
			
		case 2:
			System.out.println("Digite o valor da SAÍDA: R$ ");
			double saida1 = teclado.nextDouble();
			saida += saida1;
			break;
			
		case 3:
			double soma = entrada-saida;
			System.out.printf("Valores registrados com sucesso! O seu saldo é: R$ %.2f \n" , soma );
			if (soma > 0) {
				System.out.println("Saldo POSITIVO!");
			} else {
				System.out.println("Saldo NEGATIVO!");
			}
			stop = false;
			break;

		default:
			System.out.println("Opção inválida. Repita a operação.");
			break;
		}
		
		} while (stop);

	}

}
