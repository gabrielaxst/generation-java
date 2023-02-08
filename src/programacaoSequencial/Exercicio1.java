package programacaoSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int years, months, days, ageInDays;

        System.out.println("Digite sua idade em anos, meses e dias: ");
        System.out.print("Anos: ");
        years = input.nextInt();

        System.out.print("Meses: ");
        months = input.nextInt();

        System.out.print("Dias: ");
        days = input.nextInt();

        ageInDays = (years * 365) + (months * 30) + days;
        System.out.println("Sua idade expressa em dias é: ");
        System.out.println(ageInDays);

        input.close();
    }
}
