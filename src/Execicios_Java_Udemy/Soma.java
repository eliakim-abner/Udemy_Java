package Execicios_Java_Udemy;

public class Soma {
    public static void main(String[] args) {

        int soma, x, y;

        x = 10;
        y = 30;
        soma = x + y;
        System.out.printf("A soma dos valores %d e" +
                " %d é igual = %d%n", x, y , soma);

        x = -30;
        y = 10 ;
        soma = x + y;
        System.out.printf("A soma dos valores %d e" +
                " %d é igual = %d%n", x, y , soma);

        x = 0;
        y = 0;
        soma = x + y;
        System.out.printf("A soma dos valores %d e" +
                " %d é igual = %d", x, y , soma);


    }
}
