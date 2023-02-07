package mediaFinal;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        float note1, note2, note3, note4, average;

        System.out.print("Nota 1: ");
        note1 = input.nextFloat();

        System.out.print("Nota 2: ");
        note2 = input.nextFloat();

        System.out.print("Nota 3: ");
        note3 = input.nextFloat();

        System.out.print("Nota 4: ");
        note4 = input.nextFloat();

        average = (note1 + note2 + note3 + note4) / 4;

        System.out.printf("Media: %.1f", average);
    }
}
