package ifelse_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Imposto_DeRenda {
    public static  void main (String[] args){
        //Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
        //mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo tabela

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double IR = 0;

        System.out.println("Digite seu renda e calcule seu Imposto de Renda: ");
        double renda = sc.nextDouble();

        if (renda > 4500.00f){
            IR = renda * .28
            System.out.printf("Imposto dobre renda de R$%.2f", IR);

        } else if ( renda > 2000.01f && renda <= 3000.00f) {
            System.out.printf("Imposto dobre renda de R$%.2f", IR);
            
        } else if ( renda > 3000.01f && renda < 4500.00f) {
            System.out.printf("Imposto dobre renda de R$%.2f", IR);

        }else if( renda < 2000.00f){
            System.out.printf("Insento de imposto");

        }else{
            System.out.println("Dados incorretos");
        }

        sc.close();

    }
}


// 3002.00 = imposto de 18% porem
// 18% sobre 2.00 > ,36
//8% sobre 1000.00 > 80
// 0% de 2000.00

//1701.12 = zero imposto

//4520.00 = 28%
//20.00 = 28% > 56
//1500.00 = 18% >270
// 1000.00 = 8% >80
//2000.00 = zero