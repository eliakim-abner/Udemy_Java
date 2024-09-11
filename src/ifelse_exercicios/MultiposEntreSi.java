//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.
package ifelse_exercicios;

import java.util.Scanner;

public class MultiposEntreSi {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois número e descubra se são multiplos entre si...");

        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        if (numero1 % numero2 == 0 || numero2 % numero1 == 0){
            System.out.printf("Os números %d e %d são multiplos entre si.", numero1, numero2);
        }else {
            System.out.println("Não são multiplos");
        }

        sc.close();
    }

}
