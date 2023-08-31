package aula2;

import java.util.Scanner;

public class ExercioPeixe {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite o peso do peixe (kg): ");
	float pesopeixe = input.nextFloat();
	
	float excesso = 0;
	
	if(pesopeixe > 50) {
		excesso = pesopeixe - 50;
	} else {
		System.out.println("Excesso ZERO");
	}
	System.out.printf("O excesso foi (kg): %.3f\n", excesso);
	
	System.out.printf("O valor da multa é: R$ %.2f\n", excesso * 4);
	
	input.close();
	}

}
