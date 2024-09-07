//Fazer um programa que leia o número de um funcionário,
// seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir,
// mostre o número e o salário do funcionário, com duas casas
//decimais.


package Execicios_Java_Udemy;

import java.util.Locale;
import java.util.Scanner;

public class Salario_Funcionario {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int func, horas;
       double  vh, salario;

        System.out.println("Digite o número do funcionário:  ");
        func = sc.nextInt();
        System.out.println("Horas trabalhadas: ");
        horas = sc.nextInt();
        System.out.println("Valor da hora trabalhada: ");
        vh = sc.nextDouble();

        salario = vh * horas;

        System.out.printf("Numero: %d%n", func);
        System.out.printf("Salário: U$ %.2f", salario);

        sc.close();



    }
}
