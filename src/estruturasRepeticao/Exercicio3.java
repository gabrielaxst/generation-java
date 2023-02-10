package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, greater = 0, less = 0;

        System.out.println("Para parar o programa, digite um número negativo.");
        System.out.println("\tDigite sua idade: ");
        age = input.nextInt();
        while (age > 0){
            if (age < 21){
                less++;
            }
            if(age > 50){
                greater++;
            }
            System.out.println("\tDigite sua idade: ");
            age = input.nextInt();
        }
        System.out.println("Total de pessoas menores de 21 anos: " + less);
        System.out.println("Total de pessoas menores de 50 anos: " + greater);
        input.close();
    }
}
