package diferencaProduto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n1, n2, n3, n4;

        System.out.print("Número 1: ");
        n1 = input.nextInt();

        System.out.print("Núemro 2: ");
        n2 = input.nextInt();

        System.out.print("Número 3: ");
        n3 = input.nextInt();

        System.out.print("Número 4: ");
        n4 = input.nextInt();

        System.out.println("Diferença: " + ((n1 * n2) - (n3 * n4)));
        input.close();
    }
}
