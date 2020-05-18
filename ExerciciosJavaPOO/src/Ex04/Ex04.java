package Ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		String data, horario;
		int numVoo, numPassageiros, novosPassageiros;
		boolean cadastro = true;
		Scanner inTexto = new Scanner(System.in);
		Scanner inNumero = new Scanner(System.in);
		Voo[] voos = new Voo[5];
		Voo voo1 = new Voo(0,"","",0);
		Voo voo2 = new Voo(0,"","",0);
		
		System.out.println("Informe o número do vôo 1: ");
		numVoo = inNumero.nextInt();
		voo1.setNumVoo(numVoo);
		System.out.println("Informe a data do vôo 1: ");
		data = inTexto.nextLine();
		voo1.setData(data);
		System.out.println("Informe o horário do vôo 1: ");
		horario = inTexto.nextLine();
		voo1.setHorario(horario);
		System.out.println("Informe o número de passageiros do vôo 1: ");
		numPassageiros = inNumero.nextInt();
		voo1.setNumPassageiros(numPassageiros);
		voos[0]=voo1;
		
		System.out.println("Informe o número do vôo 2: ");
		numVoo = inNumero.nextInt();
		voo2.setNumVoo(numVoo);
		System.out.println("Informe a data do vôo 2: ");
		data = inTexto.nextLine();
		voo2.setData(data);
		System.out.println("Informe o horário do vôo 2: ");
		horario = inTexto.nextLine();
		voo2.setHorario(horario);
		System.out.println("Informe o número de passageiros do vôo 2: ");
		numPassageiros = inNumero.nextInt();
		voo2.setNumPassageiros(numPassageiros);
		voos[1]=voo1;
		
		System.out.println("\nInforme a quantidade de novos passageiros para o vôo 1: ");
		novosPassageiros = inNumero.nextInt();
		voo1.controlaPassageiros(novosPassageiros);
		System.out.println("\nInforme a quantidade de novos passageiros para o vôo 2: ");
		novosPassageiros = inNumero.nextInt();
		voo2.controlaPassageiros(novosPassageiros);
		
		if(voo1.getNumPassageiros()>=50) {
			System.out.println("\nO vôo "+voo1.getNumVoo()+" de data "+voo1.getData()+" e horário "+voo1.getHorario()+" está completo");
		}
		if(voo2.getNumPassageiros()>=50) {
			System.out.println("\nO vôo "+voo2.getNumVoo()+" de data "+voo2.getData()+" e horário "+voo2.getHorario()+" está completo");
		}
		
	}

}
