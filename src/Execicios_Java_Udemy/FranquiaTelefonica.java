package Execicios_Java_Udemy;

import java.util.Locale;
import java.util.Scanner;

public class FranquiaTelefonica {
    public static void main(String[] args) {
        //Problema exemplo
        //Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
        //dá direito a 100 minutos de telefone. Cada minuto que exceder a
        //franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
        //quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
        //a ser pago.

        Locale.setDefault(Locale.US); // para trabalhar com ponto ao inves de virgula nas numerações
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor dos minutos: ...");
        double conta = 50.00;
        int minuto = sc.nextInt();

        if(minuto > 100){
            conta +=(minuto - 100) * 2.0; // resposta: o valor da franquia 50.00 + os minutos falados menos os 100 minutos da franquia * 2.

        }
        System.out.printf("Conta do telefônica = R$%.2f", conta);
        sc.close();


    }
}