package exerciciosfuctura;

import java.util.Scanner;

public class MercadinhoFucturaArrays {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] produto = {"Banana", "Ma�a", "Goiaba", "Mel�o", "Mam�o"};
		double[] preco = {4.5, 3.0, 6.45, 2.9, 3.5};
		double[] quant = {2.1, 0.95, 2.5, 1.65, 2.45};

		float valortotal = 0;

		boolean stop = true;

		do {
			System.out.println("\nPor favor, digite o que voc� deseja comprar:"
					+ "\n0 - Finalizar"
					+ "\n1 - Banana"
					+ "\n2 - Ma�a"
					+ "\n3 - Goiaba"
					+ "\n4 - Mel�o"
					+ "\n5 - Mam�o");

			int compra = entrada.nextInt();

			while (compra == 0) {

				break;
			}if (compra == 1) {
				System.out.println("O valor da banana � R$/Kg: " + preco[0] + " e a quantididade escolhida foi (kg): "+quant[0]);
				valortotal += preco[0]*quant[0];

			}else if (compra == 2) {
				System.out.println("O valor da ma�a � R$/Kg: " + preco[1] + " e a quantididade escolhida foi (kg): "+quant[1]);
				valortotal += preco[1]*quant[1];

			}else if (compra == 3) {
				System.out.println("O valor da goiaba � R$/Kg: " + preco[2] + " e a quantididade escolhida foi (kg): "+quant[2]);
				valortotal += preco[2]*quant[2];

			}else if (compra == 4) {
				System.out.println("O valor do mel�o � R$/Kg: " + preco[3] + " e a quantididade escolhida foi (kg): "+quant[3]);
				valortotal += preco[3]*quant[3];
			}else if (compra == 5){
				System.out.println("O valor do mam�o � R$/Kg: " + preco[4] + " e a quantididade escolhida foi (kg): "+quant[4]);
				valortotal += preco[4]*quant[4];
			}else {
				System.out.println("Opc�o inv�lida!");
				stop = false;
			}
		} while (stop);

		System.out.printf("Valor total da sua compra foi R$ %.2f" , valortotal);

	}

}
