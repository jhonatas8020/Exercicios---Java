package exercicio3;

public class Caminhao extends Transporte{

	public Caminhao(double valor, double peso) {
		super(valor, peso);
	}
	
	@Override
	public double calculaFrete(int distancia) {
		double frete = carga.getPeso() * 0.02 + carga.getValor() * 0.03 + 2.00 * distancia;
		if (carga.getValor() > 40000) {
			double desconto = frete * 0.25;
			return frete - desconto;
		}
		else {
			return frete;
		}
	}
}
