package ifelse_exercicios;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args){
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");

        int x = sc.nextInt();

        if( x >= 0){
            System.out.printf("Esse número (%d) é positivo", x); // %d número inteiro
        }else {
            System.out.printf("Esse número (%d) é negativo", x);
        }



    }
}
