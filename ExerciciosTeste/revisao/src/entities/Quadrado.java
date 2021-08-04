package entities;

public class Quadrado extends FormaGeometrica {

	private double lados;
	
	public Quadrado(double lados) {
		this.lados = lados;
	}

	public double getLados() {
		return lados;
	}


	public void setLados(double lados) {
		this.lados = lados;
	}

	@Override
	public Double calculaArea() {
		return lados * lados;
	}

	
}
