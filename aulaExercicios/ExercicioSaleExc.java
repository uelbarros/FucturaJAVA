package aula2;

import java.util.Scanner;

public class ExercicioSaleExc {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/* Declarando Variáveis
		 * c = código do funcinário
		 * n = número de horas trabalhadas
		 * sal = salario
		 * e = excesso
		 * valor da hora de trabalho = R$ 10.00
		 * valor da hora de trabalho excedente = R$ 20.00
		 */

		System.out.println("Digite o cógido do funcionário: ");
		int C = input.nextInt();

		System.out.println("Digite as horas trabalhadas: ");
		float n = input.nextFloat();
		
		// Cálculo do excedente
		
		float e = n - 50;
		if (e > 0) {
			System.out.printf("Sua hora excedente é: %.2f\n", e);
			System.out.printf("O valor a receber por excedente: R$ %.2f\n", e * 20);
		} else {
			System.out.println("EXCEDENTE ZERO");
		}
		
		// Cálculo salário total
		
		if (n <= 50) {
			System.out.printf(C + " - O salário total é: R$ %.2f\n", n * 10);
		} else {
			System.out.printf(C + " - O salário total é: R$ %.2f\n", (50 * 10) + e * 20);
		}
		input.close();
	}

}
