package ifelse_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Intervalos {
     public static void main(String[] args){
        //Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
        //seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
        //nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double interalos;
        System.out.println("Digite um valor qualquer: ..");
        interalos = sc.nextDouble();

        if ((interalos < 0) || (interalos > 100.0)) {
            System.out.println("Fora do intervalo");
        } else if(interalos <= 25){
            System.out.println("(0,25)");
        }else if (interalos <= 50) {
            System.out.println("(25,50)");
        }else if (interalos <= 75){
            System.out.println("(50,75)");
        }else {
            System.out.println("(75,100)");
        }
        sc.close();

    }
}

