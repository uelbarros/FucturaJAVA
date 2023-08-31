package exerciciosfuctura;

import java.util.Scanner;

public class MercadinhoFuctura {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("Bem-vindo ao Mercadinho Futura!\n");
		
		System.out.println("Quantos produtos você deseja comprar?");
		int quantprod = entrada.nextInt();
		
		double valortotal = 0;
		
		for (int i = 0; i < quantprod; i++) {
			System.out.println("Digite o nome do produto: ");
			String produto = entrada.next().toUpperCase();
			
			System.out.println("Digite o valor do produto em R$: ");
			double valor = entrada.nextDouble();
			
			System.out.println("Digite a quantidade a ser comprada (kg) ou (uni): ");
			double quant = entrada.nextDouble();
			
			valortotal += valor*quant;
			System.out.printf("Você comprou "+ produto+"." + " O valor total do produto R$ "+ valor*quant + "\n");
		}

		System.out.printf("\nO Valor total da sua compra foi R$ %.2f", valortotal);
	}
}
