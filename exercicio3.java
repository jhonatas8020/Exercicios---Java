public class exercicio3 {
    public static void main(String[] agrs) {

      int idadeAnos = 3;
      int idadeMeses = 2;
      int idadeDias = 15;

      int diasAnos = idadeAnos * 365;
      int diasMeses = idadeMeses * 30;
      int totalDias = diasAnos + diasMeses + idadeDias;

      System.out.println(idadeAnos + " anos, " + idadeMeses + " meses, " + idadeDias + " dias = " + totalDias + " dias.");
    }
}

/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/