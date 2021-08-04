package entities;

public class Peca {

	private Integer codigo;
	private Integer quantidade;
	private Double valor;
	
	public Peca(Integer codigo, Integer quantidade, Double valor) {
		this.codigo = codigo;
		this.valor = valor;
		this.quantidade = quantidade;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double valorTotal() {
		return quantidade * valor;
	}
	
}
