package exercicio2;

public class Ipi implements Imposto {

	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public double calculaImposto(double valor) {
		
		if (valor < 20000) {
			return valor * 0.07;
		}
		else {
			return valor * 0.19;
		}
	}
}
