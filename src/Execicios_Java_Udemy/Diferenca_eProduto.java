package Execicios_Java_Udemy;

import java.util.Scanner;

public class Diferenca_eProduto {
    public static void main(String[] args){
        //Fazer um programa para ler quatro valores inteiros A, B, C e D.
        // A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Scanner sc = new Scanner(System.in);
        int A, B, C, D, i, diferenca;


        System.out.println("Digite o primeiro valor: ");
        A = sc.nextInt();

        System.out.println("Digite o primeiro valor: ");
        B = sc.nextInt();

        System.out.println("Digite o primeiro valor: ");
        C = sc.nextInt();

        System.out.println("Digite o primeiro valor: ");
        D = sc.nextInt();

        diferenca = ((A * B) - (C * D));

        System.out.printf("A diferença do produto %d  x %d - %d x %d = %d",
                A, B, C, D, diferenca);

        sc.close();



    }
}
