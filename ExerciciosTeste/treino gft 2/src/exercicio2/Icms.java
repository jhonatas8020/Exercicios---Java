package exercicio2;

public class Icms implements Imposto{

	@Override
	public double calculaImposto(Double valor) {
		return valor * 0.27;
	}
}
