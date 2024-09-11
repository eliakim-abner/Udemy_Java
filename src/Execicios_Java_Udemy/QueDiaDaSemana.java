package Execicios_Java_Udemy;

import java.util.Scanner;

public class QueDiaDaSemana {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7 e descubra o dia da semana:");

        int x = sc.nextInt(); // x é a variável que recebe  o numero digitado
        String dia;

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "'valor inválido'";
                break;

        }
        System.out.println("Dia da semana " + dia );

    }
}
