package exerciciosArray;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaPrincipal = 0, somaSecundaria = 0;

        System.out.println("Digite 9 números para compor sua matriz: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.print("Elementos da diagona principal: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                if(i == j){
                    System.out.print(matriz[i][j] + " ");
                    somaPrincipal+= matriz[i][j];
                }
            }
        }

        System.out.println();
        System.out.print("Elementos da diagonal secundária: ");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 3; j >= 0; j--){
                if (j == (matriz.length - 1) - i){
                    System.out.print(matriz[i][j] + " ");
                    somaSecundaria+= matriz[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaSecundaria);

        input.close();
    }
}
