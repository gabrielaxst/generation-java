package programacaoSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double p1 = 2.0, p2 = 3.0, p3 = 5.0, n1, n2, n3, weightedAverage;

        System.out.print("Entre com suas notas: ");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();

        weightedAverage = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);

        System.out.println("Média ponderada: " + String.format("%.1f",weightedAverage));
        input.close();
    }
}
