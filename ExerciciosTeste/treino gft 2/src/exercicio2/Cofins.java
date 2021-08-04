package exercicio2;

public class Cofins implements Imposto{

	@Override
	public double calculaImposto(Double valor) {
		if (valor > 12000) {
			return valor * 0.04;
		}
		else {
			return 0;
		}
	}
}
