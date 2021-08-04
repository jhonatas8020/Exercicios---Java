package exercicio3;

public abstract class Transporte extends Carga{

	public Transporte(Carga carga) {
		
	}
	
	public double calculaFrete(int distancia) {
		setValor(getPeso() * distancia);
		return getValor();
	}
}
