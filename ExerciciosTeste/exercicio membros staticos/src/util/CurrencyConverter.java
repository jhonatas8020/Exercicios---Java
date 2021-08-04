package util;

public class CurrencyConverter {

	public static double cotacao;
	
	public static double calculo(double dolar) {
		
		double iof = cotacao * dolar * 0.06;
		return cotacao * dolar + iof;
	}
	
}
