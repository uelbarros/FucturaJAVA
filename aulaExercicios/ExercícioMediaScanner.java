package aula2;

import java.util.Scanner;

public class Exerc�cioMediaScanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o salário base:");
		double salbase = input.nextDouble();
		
		System.out.println("Digite a gratificação:");
		double gratif = input.nextDouble();
		
		double salbruto = salbase + gratif;
		System.out.printf("O salário bruto é: R$ %.2f\n", salbruto);
		
		double IR = 0;
		if (salbruto < 1000.00) {
			IR = salbruto * 0.15;
		} else {
			IR = salbruto * 0.20;
		}
		System.out.printf("O IR �: R$ %.2f\n" , IR);
		
		double salliq = salbruto - IR;
		System.out.printf("O sal�rio liqu�do é: R$ %.2f\n" , salliq);
		
		input.close();
	}

}
