package Ex1;
import java.util.Scanner;
public class ObjetoPessoa {

	public static void main(String[] args) {
		

		String nome="",email="",fone="";
		
		
		Pessoa newPessoa = new Pessoa(nome,email,fone);
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		nome = entrada.nextLine();
		newPessoa.setNome(nome); 
		
		System.out.println("Digite o email: ");
		email = entrada.nextLine();
		newPessoa.setEmail(email);
		
		System.out.println("Digite o telefone: ");
		fone = entrada.nextLine();
		novaPessoa.setTelefone(telefone);
		
		
		newPessoa.ImprimeCartao();
	}

}
