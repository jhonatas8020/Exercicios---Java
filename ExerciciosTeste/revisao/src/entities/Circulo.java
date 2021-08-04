package entities;

public class Circulo extends FormaGeometrica{

	private Double raio;
	
	public Circulo() {
		super();
	}
	
	public Circulo(Double raio) {
		this.raio = raio;
	}
	
	public Double getRaio() {
		return raio;
	}
	
	public void setRaio(Double raio) {
		this.raio = raio;
	}
	
	@Override
	public Double calculaArea() {
		return Math.PI * raio * raio;
	}
}
