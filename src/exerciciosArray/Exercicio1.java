package exerciciosArray;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int[] vetor = {2,1,4,3,8,9,7,5,6,0};
        int numero = -1;

        System.out.print("Digite um número para ser pesquisado no vetor: ");
        int valorUsuario = leia.nextInt();

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == valorUsuario){
                numero = i;
                System.out.println("O número" + valorUsuario + " está localizado na posição: "+numero);
            }
        }
        if(numero == -1){
            System.out.println("O número " + valorUsuario + " não foi encontrado!");
        }

        leia.close();
    }
}
