package exerciciosfuctura;

import java.util.Scanner;

public class RespMercadinhoFor {

	public static void main(String[] args) {
//		Fa�a um programa que recebe uma quantidade conhecida de produtos que ser�o comprados.
//		Cada produto tem um nome, um pre�o da unidade ou kg e a quantidade comprada.
//		Voc� deve registrar todos os itens da compra e no final dever� mostrar o Pre�o Total da compra dos produtos.
		
		// Usando Loop For
		double preco_total = 0;   // Vari�vel que ir� guardar o pre�o total dos produtos
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de produtos: "); //Captar a qtdd de intera��es
		int n = entrada.nextInt();
		
		for (int i=0; i<n; i++) {
			
		System.out.println("Digite o nome do produto: ");
		String nome = entrada.next();
		
		System.out.printf("Digite o pre�o da Unid./Kg do produto: ");
		double preco_unid = entrada.nextDouble();
		
		System.out.println("Agora digite a quantidade do produto: ");
		double quant_produto = entrada.nextDouble();
		
		preco_total = preco_total + (preco_unid * quant_produto); // Atualizar o valor total dos produtos
		}
		System.out.printf("A compra total deu: R$ %.2f", preco_total);

	}

}
