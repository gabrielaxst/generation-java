package exerciciosRepeticao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("\tPara sair do loop, digite 0.");

        do {
            System.out.println("Digite um núemro: ");
            num = input.nextInt();
            sum += num;
        }while (num != 0);

        System.out.println("A soma de todos os números digitados é: " + sum);

        input.close();
    }
}
