package entities;

public class Trapezio extends FormaGeometrica{

	private double baseMenor;
	private double baseMaior;
	private double altura;

	public Trapezio(double baseMenor, double baseMaior, double altura) {
		this.baseMenor = baseMenor;
		this.baseMaior = baseMaior;
		this.altura = altura;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double getBaseMaior() {
		return baseMaior;
	}

	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public Double calculaArea() {
		
		return (baseMaior + baseMenor) * altura / 2;
	}
	
}
