package exercicio3;

public class Vagao extends Transporte{

	public Vagao(double valor, double peso) {
		super(valor, peso);
	}

	@Override
	public double calculaFrete(int distancia) {
		double frete = carga.getPeso() * 0.07 + carga.getValor() * 0.01 + distancia * 0.50;
		if (carga.getPeso() < 15000) {
			return frete + 5000;
		}
		else {
			return frete;
		}
	}
}
