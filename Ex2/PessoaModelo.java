package Ex2;

public class PessoaModelo {
	
	
	private String nome;
	private int nascimento;
	
	
	public PessoaModel(String nome,int nascimento)
	{
		this.nome =nome;
		this.nascimento = nascimento;
	}

	
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Number getAnoNascimento() {
		return nascimento;
	}

	public void setnascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	
	
	public void idadeAtual() {
		
		int idade = 2020-nascimento;
		System.out.println("Sua idade é: "+idade+" anos");

	}
	
	public void idade50Anos() {
		
		int idade = 2020-nascimento;
		System.out.println("Sua idade daqui 50 anos é: "+(idade+50)+" anos");

	}

}
