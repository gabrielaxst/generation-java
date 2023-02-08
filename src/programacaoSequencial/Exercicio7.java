package programacaoSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double a, b, c, d, e, f, x, y;

        System.out.println("Digite os coeficientes a, b, c, d, e, f abaixo: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        e = input.nextInt();
        f = input.nextInt();

        x = (c * e - b * f) / (a * e - b * d);
        y = (a * f - c * d) / ( a * e - b * d);

        System.out.printf("X é igual a: %.2f e Y é igual a: %.2f", x, y);
        input.close();
    }
}
