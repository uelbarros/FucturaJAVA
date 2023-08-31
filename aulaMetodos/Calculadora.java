package aula7.metodo;

public class Calculadora {
	
	void somarDoisNumeros() {// Metodos sem retorno
		System.out.println(10 + 10);
	}
	
	void subtrairDoisNumeros(int valor , int numero){// Metodos sem retorno
		System.out.println(valor - numero);
	}
	
	double multiplicarDoisNumeros() {// Metodos com retorno
		return 1 * 5;
	}
	
	double multiplicarDoisNumeros2(int num1 , int num2) {// Metodos com retorno
		double resp = num1 * num2; 
		return resp ;
	}
	
	void imprimir() {// Metodos sem retorno
		System.out.println("+==============+");
		System.out.println("+===  Menu ====+");
		System.out.println("+==============+");
		System.out.println("+ 1 - Saldo    +");
		System.out.println("+ 2 - Saque    +");
		System.out.println("+ 3 - Deposito +");
		System.out.println("+==============+");
		System.out.println("Opção = ");
	}
	
	double media(double nota1,double nota2 ) {// Metodos com retorno
		return (nota1 + nota2) /2;
	}
	
	void resultadoDaMedia(double valor) {// Metodos sem retorno
		if(valor < 3 ) {
			System.out.println("Reprovado");
		}else if (valor <=6) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Aprovado");
		}		
	}
	
	String resultadoDaMedia2(double valor) {// Metodos com retorno
		String resp;
		if(valor < 3 ) {
			resp="Reprovado";
			return resp;
		}else if (valor <=6) {
			resp="Recuperação";
			return resp;
		}else {
			resp="Aprovado";
		}
		return resp;
	}
}
