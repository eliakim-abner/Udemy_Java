//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura. <A= A * C / 2>
//b) a área do círculo de raio C. (pi = 3.14159) <A= Pi * C * C >
//c) a área do trapézio que tem A e B por bases e C por altura. <A = ((A + B) * C) /2>
//d) a área do quadrado que tem lado B. < A = B * B >
//e) a área do retângulo que tem lados A e B. < A = A * B >

package Execicios_Java_Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Areas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaT, areaC, areaTr, areaQ, areaR, Pi= 3.14159;
        System.out.println("Digite os valores de A, B e C:");

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        System.out.println("Resuldado das areas:");
        areaT =  A * C / 2.0;
        areaC =  Pi * C * C;
        areaTr = (A + B) * C /2.0;
        areaQ = B * B;
        areaR =  A * B;

        System.out.printf("%.2f%n",areaT);
        System.out.printf("%.2f%n",areaC);
        System.out.printf("%.2f%n",areaTr);
        System.out.printf("%.2f%n",areaQ);
        System.out.printf("%.2f%n",areaR);


        sc.close();

    }
}
