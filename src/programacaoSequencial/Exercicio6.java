package programacaoSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double x1, x2, y1, y2, distance;

        System.out.println("Entre com os dados de dois pontos do plano cartesiano: ");
        System.out.print("X1: ");
        x1 = input.nextInt();
        System.out.print("X2: ");
        x2 = input.nextInt();
        System.out.print("Y1: ");
        y1 = input.nextInt();
        System.out.print("Y2: ");
        y2 = input.nextInt();

        double pow1 =  Math.pow((x2 - x1), 2);
        double pow2 =  Math.pow((y2 - y1), 2);

        distance =  Math.sqrt((pow1 + pow2));

        System.out.println("Distância: " + distance);
        input.close();
    }
}
