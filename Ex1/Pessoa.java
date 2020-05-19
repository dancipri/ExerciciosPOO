package Ex1;

public class Pessoa {

	
	private String nome;
	private String email;
	private String fone;
	
	
	public Pessoa(String nome, String email, String fone)
	{
		this.nome = nome;
		this.email = email;
		this.fone = fone;
	}
	


	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return fone;
	}

	public void setTelefone(String fone) {
		this.fone = fone;
	}
	
	
	
	public void ImprimeCartao() {
		System.out.println("\n"+getNome()+"\n\n"+getEmail()+"\n\n"+"telefone: "+getfone());
	}
	
}
