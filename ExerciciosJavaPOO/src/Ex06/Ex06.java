package Ex06;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		double numero1, numero2;
		Scanner in = new Scanner(System.in);
		Operacao operacao1 = new Operacao(0,0);
		
		System.out.println("Informe o primeiro número: ");
		numero1 = in.nextDouble();
		operacao1.setNumero1(numero1);
		System.out.println("Informe o segundo número: ");
		numero2 = in.nextDouble();
		operacao1.setNumero2(numero2);
		
		operacao1.somar();
		operacao1.subtrair();
		operacao1.dividir();
		operacao1.multiplicar();
		operacao1.potencia();

	}

}
