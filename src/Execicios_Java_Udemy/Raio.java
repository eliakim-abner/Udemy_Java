package Execicios_Java_Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Raio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        //formula da área > area = Pi * raio²
        // Pi = 3,14159

        float area, Pi, raio, r;
        int y;
        r = 2.00f; // valor de entrada da circunferência
        y = 2; // expoente
        Pi = 3.14159f;
        raio =(float)Math.pow(r,y); // operação com numero int e float
        area = Pi * raio;

        System.out.printf("Valor da área do círculo com raio " +
                " de %.2f é igual a A = %.4f%n ",r, area );


        r = 100.64f; // valor de entrada da circunferência
        y = 2; // expoente
        Pi = 3.14159f;
        raio =(float)Math.pow(r,y); // operação com numero int e float
        area = Pi * raio;

        System.out.printf("Valor da área do círculo com raio " +
                " de %.2f é igual a A = %.4f%n ",r, area );

        r = 150.00f; // valor de entrada da circunferência
        y = 2; // expoente
        Pi = 3.14159f;
        raio =(float)Math.pow(r,y); // operação com numero int e float
        area = Pi * raio;

        System.out.printf("Valor da área do círculo com raio " +
                " de %.2f é igual a A = %.4f%n ",r, area );
    }
}