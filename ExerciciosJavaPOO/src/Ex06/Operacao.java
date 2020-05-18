package Ex06;

public class Operacao {
	private double numero1;
	private double numero2;
	
	public Operacao(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public void somar() {
		double soma = this.numero1+this.numero2;
		System.out.println(this.numero1+" + "+this.numero2+" = "+soma);
	}
	
	public void subtrair() {
		double subtracao = this.numero1-this.numero2;
		System.out.println(this.numero1+" - "+this.numero2+" = "+subtracao);
	}
	
	public void dividir() {
		if(this.numero2>0) {
			double divisao = this.numero1/this.numero2;
			System.out.println(this.numero1+" ÷ "+this.numero2+" = "+divisao);
		}else {
			System.out.println("Impossível dividir por 0!");
		}
	}
	
	public void multiplicar() {
		double multiplicacao = this.numero1*this.numero2;
		System.out.println(this.numero1+" x "+this.numero2+" = "+multiplicacao);
	}
	
	public void potencia() {
		double potenciacao = Math.pow(this.numero1, this.numero2);
		System.out.println(this.numero1+" ^ "+this.numero2+" = "+potenciacao);
	}
}
