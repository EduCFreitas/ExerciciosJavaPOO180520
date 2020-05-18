package Ex05;

public class Empregado {
	private int id;
	private String nome;
	private String sobrenome;
	private double salarioAtual;
	
	public Empregado(int id, String nome, String sobrenome, double salarioAtual) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioAtual = salarioAtual;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalarioAtual() {
		return salarioAtual;
	}

	public void setSalarioAtual(double salarioAtual) {
		this.salarioAtual = salarioAtual;
	}
	
	public void exibeNomeCompletoSalario() {
		System.out.println("Funcion�rio: "+nome+" "+sobrenome+"\nSal�rio: R$"+salarioAtual);
	}
	
	public void aumentaSalario20PC() {
		this.salarioAtual*=1.2;
		System.out.println("\nFuncion�rio: "+this.nome+" "+this.sobrenome+"\nSal�rio com aumento de 20%: R$"+this.salarioAtual);
	}
	
	public void aumentaSalarioIndiceInformado(double indiceAumento) {
		this.salarioAtual*=indiceAumento;
		System.out.println("\nFuncion�rio: "+this.nome+" "+this.sobrenome+"\nSal�rio com aumento de "+indiceAumento+"%: R$"+this.salarioAtual);
	}
}
