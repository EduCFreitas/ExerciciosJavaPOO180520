package Ex04;

public class Voo {
	private int numVoo;
	private String data;
	private String horario;
	private int numPassageiros;
	
	public Voo(int numVoo, String data, String horario, int numPassageiros) {
		this.numVoo = numVoo;
		this.data = data;
		this.horario = horario;
		this.numPassageiros = numPassageiros;
	}

	public int getNumVoo() {
		return numVoo;
	}

	public void setNumVoo(int numVoo) {
		this.numVoo = numVoo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	
	public void controlaPassageiros(int novosPassageiros) {
		this.numPassageiros+=novosPassageiros;
		if(this.numPassageiros>=50) {
			System.out.println("\nO número máximo de 50 passageiros do vôo "+this.numVoo+" de "+this.data+" de horário "+this.horario+" já foi alcançado!\nRealocar os "+(this.numPassageiros%50)+" excedentes para outro vôo!");
			this.numPassageiros = 50;
		}else {
			System.out.println("\n"+novosPassageiros+" novos passageiros alocados no vôo "+this.numVoo+" de data "+this.data+" e horário "+this.horario+".\nO vôo ainda possui "+(50-this.numPassageiros)+" assentos disponíveis.");
		}
	}
	
}
