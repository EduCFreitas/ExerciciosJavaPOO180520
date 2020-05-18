package Ex02;

public class Pessoa {
	private String nome;
	private int anoNasc;
	
	public Pessoa(String nome, int anoNasc) {
		this.nome = nome;
		this.anoNasc = anoNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	
	public void calculaIdade() {
		System.out.println(getNome()+", sua idade é de "+(2020-getAnoNasc())+" anos.");
	}
	
	public void calculaIdade50Anos() {
		System.out.println(getNome()+", sua idade daqui a 50 anos será de "+(2020+50-getAnoNasc())+" anos.");
	}
}
