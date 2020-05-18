package Ex07;

public class Janela {
	private double altura;
	private double largura;
	private boolean aberta;
	
	public Janela(double altura, double largura, boolean aberta) {
		this.altura = altura;
		this.largura = largura;
		this.aberta = aberta;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	
	public void abrir() {
		if(this.aberta==true) {
			System.out.println("\nA janela já estava aberta.");
		}else {
			System.out.println("\nJanela aberta com sucesso");
			this.aberta=true;
		}
	}
	
	public void fechar() {
		if(this.aberta==false) {
			System.out.println("\nA janela já estava fechada.");
		}else {
			System.out.println("\nJanela fechada com sucesso");
			this.aberta=false;
		}
	}
	
	public void estaAberta() {
		if(this.aberta==true) {
			System.out.println("\nSim, a janela está aberta");
		}else {
			System.out.println("\nNão, a janela está fechada");
		}
	}
}
