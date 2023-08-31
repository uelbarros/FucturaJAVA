package aula8.construtor;

public class CachorroTeste {

	public static void main(String[] args) {
		
		Cachorro bob = new Cachorro("Tody", "Branco", 3, 4.5f);
		Cachorro tob = new Cachorro();
		
		String nome = "Pretinho";
		tob.setNome(nome);
		tob.setCor("Preto");
		tob.setIdade(7);
//
//		System.out.println("Nome: " + bob.getNome() + "\nidade: " +
//				bob.getIdade() + "\tCor do pelo: " + bob.getCor() + " Peso:"+bob.getPeso()+"\n");
//		System.out.println("Nome: " + tob.getNome() + "\nidade: " + tob.getIdade() +
//				"\tCor do pelo: " + tob.getCor());
//				System.out.println();
		
		// Método latir
		System.out.print("Latido de " + bob.getNome() + " ");
		String latido="Au Au";
		bob.latir();

//		System.out.print("Latido de " + tob.nome + " ");
//		String acao = "GRRRRR AU AU";
//		tob.latir(acao);
////		tob.latir("GRRRRR AU AU"); //também poderia ser assim

	}

}
