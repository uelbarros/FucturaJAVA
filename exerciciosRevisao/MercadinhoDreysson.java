package exerciciosfuctura;

import javax.swing.JOptionPane;

public class MercadinhoDreysson {

	public static void main(String[] args) {
		
		/*
		 *  Mercadinho Fuctura: Faça um programa que recebe uma quantidade conhecida
			de produtos que serão comprados. Cada produto tem um
			 
			nome
			preço da unidade ou kg 
			quantidade comprada
			
			Você deve registrar todos os itens da
			compra e no final deverá mostrar o Preço Total da compra dos produtos.
			Fazer um programa utilizando Loop For e um programa utilizando Loop While.
			Preço do produto = preço da unidade x quantidade comprada
			
			Considere os 3 testes abaixo para validar o seu programa.
		 * */
		
		int qtdProdutos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos"));
		
		double somaTotalProdutos=0;
		
		String[] nomeProduto = new String[qtdProdutos];
		double [] precoProduto= new double[qtdProdutos];
		int [] qtdCompraProdutos= new int[qtdProdutos];
	
		for(int i=0;i<qtdProdutos;i++) {
			nomeProduto[i]= JOptionPane.showInputDialog("Informe o produto");
			precoProduto[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe o preco"));
			qtdCompraProdutos[i] = Integer.parseInt(JOptionPane.showInputDialog("Quantidade prodtos comprados"));
			somaTotalProdutos=somaTotalProdutos+(precoProduto[i]*qtdCompraProdutos[i]);
		}
		System.out.println("MECARDINHO FUCTURA");
		for(int i=0;i<qtdProdutos;i++){
			System.out.println(".....PRODUTO: "+nomeProduto[i]+"\n.....Preço: "+precoProduto[i]+"\nQtd: "+qtdCompraProdutos[i]);
		}

		System.out.println(".....TOTAL: R$"+somaTotalProdutos);

	}

}
