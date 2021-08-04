package entities;

public class Juridica extends Contribuintes {

	private Integer nFuncionarios;
	
	public Juridica() {
		super();
	}

	public Juridica(String nome, Double rendaAnual, Integer nFuncionarios) {
		super(nome, rendaAnual);
		this.nFuncionarios = nFuncionarios;
	}

	public Integer getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(Integer nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}

	@Override
	public Double calculaImposto() {
		if (nFuncionarios > 10) {
			return super.getRendaAnual() * 0.14;
		}
		else {
			return super.getRendaAnual() * 0.16;
		}
		
	}
	
}
