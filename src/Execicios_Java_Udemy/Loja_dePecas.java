
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

package Execicios_Java_Udemy;
import java.util.Locale;
import java.util.Scanner;

public class Loja_dePecas {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int cod1, cod2, quant1, quant2;
        double valor1 , valor2, total;


        System.out.println("Digite o codigo, quantidade e valor da peça1: ");

        cod1 = sc.nextInt();
        quant1 = sc.nextInt();
        valor1 = sc.nextDouble();

        System.out.println("Digite o codigo, quantidade e valor da peça2: ");

        cod2 = sc.nextInt();
        quant2 = sc.nextInt();
        valor2 = sc.nextDouble();



        total =  valor1 * quant1 + valor2 * quant2;


        System.out.printf("Total R$ %.2f%n", total);

        sc.close();

    }


}
