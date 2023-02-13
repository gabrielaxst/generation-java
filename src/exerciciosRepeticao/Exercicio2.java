package exerciciosRepeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, evenNum = 0, oddNum = 0;

        System.out.println("\tDigite 10 números abaixo");
        for (int i = 1; i <= 10; i++){
            System.out.printf("Número %d = ", i);
            num = input.nextInt();
            if (num % 2 == 0){
                evenNum++;
            }
            else{
                oddNum++;
            }
        }

        System.out.println("Quantidade de números pares: " + evenNum);
        System.out.println("Quantidade de números impares: " + oddNum);

        input.close();
    }
}
