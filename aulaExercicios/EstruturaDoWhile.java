package aula4;

public class EstruturaDoWhile {

	public static void main(String[] args) {

		int contador = 1; // contador / inicializa��o

		do {
			System.out.println(contador); // corpo
			contador += 1; // intera��o // contador++
			if (contador > 5) {
				System.out.println("Contador j� � maior do que 5!");
			}
		} while (contador <= 5); // condi��o de parada

	}

}
