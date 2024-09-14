package ifelse_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Tempo_DeJogo {
    public static void main(String[] args){
    //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial e final do jogo:");

        int horaI = sc.nextInt();
        int horaF = sc.nextInt();

       int duracao;
       if (horaI < horaF){
           duracao = horaF - horaI;
       }else {
           duracao = 24 - horaI + horaF;

       }

        System.out.printf("Hora inicial %d e hora final %d do jogo", horaI , horaF);
        System.out.println();
        System.out.printf("Duração do jogo foi de %d : 00", duracao);

        // prof=grama roda com horarios inteiro, falta transformar para usar com horario quebrado, tipo 02:15

        // 1h = 60min
        // 1min = 60 seg
        // 02:15 > 2 x 60 + 15 = 120 + 15 = 135 min
        //135 > 135/60 = 2.25 > 2h  25 * 60 / 100 = 15 >> 2:15

        //1. Solução com Conversão Manual (como você mencionou)
        //
        //Você pode pedir ao usuário para inserir horas e minutos separadamente, converter tudo para minutos para fazer os cálculos, e depois transformar novamente em horas e minutos no final.
        //
        //2. Solução Usando java.time
        //
        //Uma solução mais elegante é utilizar a classe java.time.LocalTime, que já lida com horas e minutos e oferece métodos prontos para calcular a diferença entre tempos.
        //
        //
        //
        //Diferenças:
        //
        //Conversão manual: Você converte as horas para minutos e depois reverte o processo no final.
        //
        //API java.time: A classe LocalTime facilita o cálculo de tempo e Duration calcula a diferença automaticamente.
        //
        //A segunda abordagem, com java.time, é mais simples e menos propensa a erros, pois Java já lida com os cálculos de tempo para você.


    }

}
