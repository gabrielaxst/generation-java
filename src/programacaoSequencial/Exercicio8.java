package programacaoSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double dPercentage = 0.28, iPercentage = 0.45, fCost, cCost;

        System.out.println("Digite o custo de fábrica: ");
        fCost = input.nextDouble();

        cCost = (fCost * dPercentage) + (iPercentage * fCost) + fCost;

        System.out.println("Custo ao consumidor: " + String.format("%.2f", cCost));
        input.close();
    }
}
