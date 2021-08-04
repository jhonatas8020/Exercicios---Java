package entities;

public class Fisica extends Contribuintes {
	
	private Double gastosSaude;
	
	public Fisica() {
		super();
	}

	public Fisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public Double calculaImposto() {
		double imposto = 0;
		if (super.getRendaAnual() < 20000.00) {
			imposto = super.getRendaAnual() * 0.15;
		}
		else {
			imposto = super.getRendaAnual() * 0.25;
		}
		
		return imposto - (gastosSaude * 0.5);
	}

}
