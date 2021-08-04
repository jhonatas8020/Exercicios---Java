package exercicio2;

public class Cofins implements Imposto{

	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public double calculaImposto(double valor) {
		
		if (valor > 12000) {
			return valor * 0.04;
		}
		else {
			return 0;
		}
	}
}
