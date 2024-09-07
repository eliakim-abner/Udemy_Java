package Execicios_Java_Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Raio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, A, Pi = 3.14159;
        System.out.println("Valor do Raio do círculo:");
        R = sc.nextDouble();
        A = Pi * R * R;

        System.out.printf("A=%.4f%n", A);
    }
}