package Ex07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		int opcao = 1;
		double altura, largura;
		boolean aberta;
		Scanner in = new Scanner(System.in);
		Janela janela1 = new Janela(1, 2, false);
		
		System.out.println("Informe a altura da janela: ");
		altura = in.nextDouble();
		janela1.setAltura(altura);
		System.out.println("Informe a largura da janela: ");
		largura = in.nextDouble();
		janela1.setLargura(largura);
		
		while(opcao!=0&&opcao<4) {
			System.out.println("\nO que deseja fazer com a janela?\n1) Abrir  2) Fechar  3) Verificar se está aberta  0) Cancelar");
			opcao = in.nextInt();
			switch(opcao) {
				case 0:
					break;
				case 1:
					janela1.abrir();
					break;
				case 2:
					janela1.fechar();
					break;
				case 3:
					janela1.estaAberta();
					break;
				default:
					System.out.println("Opção selecionada inválida!");
			}
		}

	}

}
