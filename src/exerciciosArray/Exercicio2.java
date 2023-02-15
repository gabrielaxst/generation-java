package exerciciosArray;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números inteiros: ");
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Número  %d:", (i+1));
            int numeros = leia.nextInt();
            vetor[i] = numeros;
        }

        System.out.print("Elementos nos índices ímpares: ");
        for (int i = 0; i < vetor.length; i++){
            if (i % 2 != 0){
                System.out.print(vetor[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Elementos pares: ");
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] % 2 == 0){
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
        int soma = 0;
        for (int i = 0; i < vetor.length; i++){
            soma += vetor[i];
        }
        System.out.println("Soma: " + soma);

        double media;
        media = (double) soma / vetor.length;
        System.out.println("Média: "+ String.format("%.2f",media));

        leia.close();
    }
}
