package aula8.construtor;


public class Cachorro {
	private String nome;
	private String cor;
	private int idade;
	private float peso;

	// construtores
	public Cachorro() {

	}

	// construtorer this()
	public Cachorro(String nome, String cor, int idade, float peso) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
		this.peso = peso;
	}

	public void latir() {
		String latido="Au Au";
		latir2(latido);
	}

	public void latir2(String latir) {
		System.out.println(latir);
	}

	//get set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}

}
