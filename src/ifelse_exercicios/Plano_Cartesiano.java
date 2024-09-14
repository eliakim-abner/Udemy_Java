package ifelse_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Plano_Cartesiano {
    public static void main(String[] args){
        //Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
        //de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
        //ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
        //Se o ponto estiver na origem, escreva a mensagem “Origem”.
        //Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
        //situação.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreve dois valores com uma casa decimal para x e y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        if (x == y &&  y == 0){
            System.out.println("Os pontos x e y estao sobre a origem");

        } else if (x > 0 && y > 0) {
            System.out.println("Os pontos estão no Q1");

        } else if (x > 0 && y < 0) {
            System.out.println("Os pontos estão no Q4");

        }else if (x < 0 && y < 0) {
            System.out.println("Os pontos estão no Q3");

        }else if (x < 0 && y > 0) {
            System.out.println("Os pontos estão no Q2");

        }else{
            System.out.println("Dados inseridos incorretamente");
        }

        sc.close();
    }
}

// percebi que estou usando o else if errado