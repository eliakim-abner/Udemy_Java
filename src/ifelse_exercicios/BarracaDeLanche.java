package ifelse_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BarracaDeLanche {
    public static void main(String[] args){
        //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do seu lanche: .. ");

        double valor = 0;
        int codigo = sc.nextInt();

        System.out.println("Digite a quantidade desejada: ..");
        int quantidade = sc.nextInt();

         if (codigo == 1){
             valor = (4.00 * quantidade);
        } else if (codigo == 2) {
             valor = (4.50 * quantidade);
         } else if (codigo == 3) {
             valor = (5.00 * quantidade);
         }else if (codigo == 4) {
             valor = (2.00 * quantidade);
         }else if (codigo == 5) {
             valor = (1.50 * quantidade);
         }
         else {
             System.out.println("Erro na escolha. Tente novamente");
         }
        System.out.printf("Total = %.2f" , valor);

         sc.close();
    }

}
 // aida falta desenvolver tratamento de erro e loop