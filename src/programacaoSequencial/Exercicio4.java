package programacaoSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int a, b, c;
        double d, r, s;

        System.out.println("Digite três números inteiros e positivos: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        r = Math.pow((a + b),2);
        s = Math.pow((b + c), 2);
        d = (r + s) / 2;

        System.out.println("Resultado da expressão: " + String.format("%.2f", d));

        input.close();
    }
}
