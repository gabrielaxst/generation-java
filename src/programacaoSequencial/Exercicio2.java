package programacaoSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int ageInDays, years, months, days;

        System.out.print("Escreva sua idade em dias: ");
        ageInDays = input.nextInt();

        years = ageInDays / 365;
        months = (ageInDays % 365) / 30;
        days =  (ageInDays % 365) % 30;

        System.out.printf("Anos: %d, Months: %d, Dias: %d",years, months, days);
        input.close();
    }
}
