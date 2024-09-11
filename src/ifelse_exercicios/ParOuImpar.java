package ifelse_exercicios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro e veja se ele é Par ou Ímpar:");
        int numero = sc.nextInt();

        if (numero % 2 == 0){   // < % > resto da divisão for igual a zero: Par.
            System.out.printf("O número digitado, %d, é par", numero);
        } else{
            System.out.printf("O número %d, é ímpar.", numero);
        }
            sc.close();
    }
}