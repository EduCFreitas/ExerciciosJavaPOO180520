package Ex05;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int id;
		String nome, sobrenome;
		double salarioAtual, indiceAumento;
		Scanner inInt = new Scanner(System.in);
		Scanner inDouble = new Scanner(System.in);
		Scanner inString = new Scanner(System.in);
		
		Empregado empregado1 = new Empregado(0,"","",0);
		
		System.out.println("Informe o ID do funcion�rio: ");
		id = inInt.nextInt();
		empregado1.setId(id);
		System.out.println("Informe o nome do funcion�rio: ");
		nome = inString.nextLine();
		empregado1.setNome(nome);
		System.out.println("Informe o sobrenome do funcion�rio: ");
		sobrenome = inString.nextLine();
		empregado1.setSobrenome(sobrenome);
		System.out.println("Informe o sal�rio atual do funcion�rio: ");
		salarioAtual = inDouble.nextDouble();
		empregado1.setSalarioAtual(salarioAtual);
		
		empregado1.exibeNomeCompletoSalario();
		empregado1.aumentaSalario20PC();
		System.out.println("\nInforme o �ndice de aumento de sal�rio para o funcion�rio: ");
		indiceAumento = inDouble.nextDouble();
		empregado1.aumentaSalarioIndiceInformado(indiceAumento);
	}

}
