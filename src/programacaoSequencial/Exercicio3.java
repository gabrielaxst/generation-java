package programacaoSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int inputSeconds, hours, minutes, seconds;

        System.out.print("Digite o tempo em segundos: ");
        inputSeconds = input.nextInt();

        hours = inputSeconds / 3600;
        minutes = inputSeconds % 3600 / 60;
        seconds = inputSeconds % 3600 % 60;

        System.out.printf("Tempo em horas, minutos e segundos: %dH: %dM: %dS",
                hours, minutes, seconds);
        input.close();
    }
}
