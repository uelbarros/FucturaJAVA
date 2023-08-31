package exerciciosfuctura;

import java.util.Scanner;

public class RespMercadinhoFor {

	public static void main(String[] args) {
//		Faça um programa que recebe uma quantidade conhecida de produtos que serão comprados.
//		Cada produto tem um nome, um preço da unidade ou kg e a quantidade comprada.
//		Você deve registrar todos os itens da compra e no final deverá mostrar o Preço Total da compra dos produtos.
		
		// Usando Loop For
		double preco_total = 0;   // Variável que irá guardar o preço total dos produtos
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos: "); //Captar a qtdd de interações
		int n = entrada.nextInt();
		
		for (int i=0; i<n; i++) {
			
		System.out.println("Digite o nome do produto: ");
		String nome = entrada.next();
		
		System.out.printf("Digite o preço da Unid./Kg do produto: ");
		double preco_unid = entrada.nextDouble();
		
		System.out.println("Agora digite a quantidade do produto: ");
		double quant_produto = entrada.nextDouble();
		
		preco_total = preco_total + (preco_unid * quant_produto); // Atualizar o valor total dos produtos
		}
		System.out.printf("A compra total deu: R$ %.2f", preco_total);

	}

}
