package Ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		String nome;
		int anoNasc;
		Scanner inTexto = new Scanner(System.in);
		Scanner inNumero = new Scanner(System.in);
		Pessoa pessoa = new Pessoa("",0);
		
		System.out.println("Informe o nome: ");
		nome = inTexto.nextLine();
		pessoa.setNome(nome);
		System.out.println("Informe o ano de nascimento: ");
		anoNasc = inNumero.nextInt();
		pessoa.setAnoNasc(anoNasc);
		
		pessoa.calculaIdade();
		pessoa.calculaIdade50Anos();
	}

}
