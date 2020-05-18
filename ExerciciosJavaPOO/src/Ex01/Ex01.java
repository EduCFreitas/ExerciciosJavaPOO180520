package Ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		String nome, email, telefone;
		Scanner in = new Scanner(System.in);
		Pessoa pessoa = new Pessoa("","","");
		
		System.out.println("Informe o nome: ");
		nome = in.nextLine();
		pessoa.setNome(nome);
		System.out.println("Informe o email: ");
		email = in.nextLine();
		pessoa.setEmail(email);
		System.out.println("Informe o telefone: ");
		telefone = in.nextLine();
		pessoa.setTelefone(telefone);
		
		pessoa.mostraCartaoVisitas();
	}

}
