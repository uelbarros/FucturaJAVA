package aula7.metodo;

public class CalculadoraTeste {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		int num1 = 4;
		int num2 = 2;

		calc.somarDoisNumeros();
		calc.subtrairDoisNumeros(num1, num2);

		double resultado = calc.multiplicarDoisNumeros();
		System.out.println(resultado * 5);

		double retorno = calc.multiplicarDoisNumeros2(num1, num2);
		System.out.println(retorno);

		calc.imprimir();

		int nota1 = 4;
		int nota2 = 2;

		double retornoMedia = calc.media(nota1, nota2);

		calc.resultadoDaMedia(retornoMedia);// exibe o resultado da média

		System.out.println(calc.resultadoDaMedia2(retornoMedia));
	}

}
