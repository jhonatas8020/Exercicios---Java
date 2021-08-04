package entities;

public class Conta {
	
	private int numeroConta;
	private String titularConta;
	private double saldo;
	
	public Conta(int numeroConta, String titularConta) {
		
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}
	
	public Conta(int numeroConta, String titularConta, double inicialDeposito) {
		
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		deposito(inicialDeposito);
	}
	
	public int getNumConta() {
		return numeroConta;
	}
	
	public String getTituConta() {
		return titularConta;
	}
	
	public void setTituConta(String titularConta) {
		this.titularConta = titularConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void saque(double valorSaque) {
		saldo -= valorSaque + 5.00;
	}
	
	public String toString() {
		
		return "Account "
				+ numeroConta
				+ ", Holder: "
				+ titularConta
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
	
}
