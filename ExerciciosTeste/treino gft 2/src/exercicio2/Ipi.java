package exercicio2;

public class Ipi implements Imposto{

	@Override
	public double calculaImposto(Double valor) {
		if(valor < 20000) {
			return valor * 0.07;
		}
		else {
			return valor * 0.19;
		}
	}
}
