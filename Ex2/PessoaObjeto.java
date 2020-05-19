package Ex2;
import java.util.Scanner;
public class PessoaObjeto {

	public static void main(String[] args) {
		
		
		String nome="";
		int anoNascimento = 0;
		
		
		PessoaModelo novapessoa = new PessoaModelo(nome, anoNascimento);
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o nome: ");
		nome=entrada.nextLine();
		novapessoa.setNome(nome);
		
		System.out.println("Digite o seu ano de nascimento: ");
		anoNascimento=entrada.nextInt();
		novapessoa.setAnoNascimento(anoNascimento);
		
		
		System.out.println();
		novapessoa.idadeAtual();
		System.out.println();
		novapessoa.idadeDaqui50Anos();

	}

}
