package entities;

public class Funcionario {
	
	private int nRegistro;
	private Double hTrabalhadas;
	private Double vPHora;
	
	public Funcionario(int nRegistro, Double hTrabalhadas, Double vPHora) {
		this.nRegistro = nRegistro;
		this.hTrabalhadas = hTrabalhadas;
		this.vPHora = vPHora;
	}

	public int getnRegistro() {
		return nRegistro;
	}

	public void setnRegistro(int nRegistro) {
		this.nRegistro = nRegistro;
	}

	public Double gethTrabalhadas() {
		return hTrabalhadas;
	}

	public void sethTrabalhadas(Double hTrabalhadas) {
		this.hTrabalhadas = hTrabalhadas;
	}

	public Double getvPHora() {
		return vPHora;
	}

	public void setvPHora(Double vPHora) {
		this.vPHora = vPHora;
	}
	
	public Double calculaSalario() {
		return hTrabalhadas * vPHora;
	}
	
	
}
