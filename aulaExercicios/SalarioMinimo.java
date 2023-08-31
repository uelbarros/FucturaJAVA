package aula2;

public class SalarioMinimo {

	public static void main(String[] args) {
		// Declarando as variáveis
		
		double salbase = 3000.00;
		double gratif = 1200.00;
		double IR = 0;
		double salliq = 0;
		
		double salbruto = salbase + gratif;
		System.out.printf("O seu salário bruto é: R$ %.2f \n", salbruto);
		
		if(salbruto < 1000.00) {
			IR = salbruto * 0.15;
		} else { 
			IR = salbruto * 0.20;
		}
		System.out.printf("Seu IR é: R$ %.2f \n", IR);
		
		salliq = salbruto - IR;
		System.out.printf("O seu salário líquido é: R$ %.2f \n", salliq);
	}

}
