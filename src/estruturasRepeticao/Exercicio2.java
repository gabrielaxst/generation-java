package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, even = 0, odd = 0;

        System.out.println("\tDigite 10 números inteiros: ");
        for (int i = 1; i <= 10; i++){
            System.out.printf("Digite o %d número: ",i);
            num = input.nextInt();
            if (num % 2 == 0){
                even += 1;
            }
            else {
                odd += 1;
            }
        }

        System.out.printf("Total de números pares: %d\nTotal de números impares: %d", even, odd);

        input.close();
    }
}
