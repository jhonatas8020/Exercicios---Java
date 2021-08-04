package exercicio3;

public abstract class Transporte{
	
	Carga carga = new Carga();
	
	public Transporte(double valor, double peso) {
		carga.setPeso(peso);
		carga.setValor(valor);
	}

	public double calculaFrete(int distancia) {
		return carga.getValor() * distancia;
	}
}
