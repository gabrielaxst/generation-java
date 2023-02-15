package exerciciosArray;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double somaNotas = 0;
        double[][] matriz = new double[10][4];
        double[] vetorMedias = new double[10];

        System.out.println("Digite as suas notas dos 4 bimestres anuais!");
        for (int i = 0; i < 10; i++){
            System.out.printf("Aluno %d: \n", (i + 1));
            for (int j = 0; j < 4; j++){
                System.out.printf("Nota %d -> ", j+1);
                matriz[i][j] = input.nextDouble();
            }
        }
        for (int i = 0; i < 10; i++){
            somaNotas = 0;
            for (int j = 0; j < 4; j++){
                somaNotas += matriz[i][j];
            }
            vetorMedias[i] = somaNotas / 4;
            System.out.printf("Aluno %d: %.1f\n", i+1, vetorMedias[i]);
        }

        input.close();
    }
}
