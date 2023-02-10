package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum =0;

        System.out.println("\tPara sair do loop, digite 0.");

        do {
            System.out.print("Digite um número: ");
            num = input.nextInt();
            if (num >= 0){
                sum+= num;
            }
        }while (num != 0);

        System.out.println("A soma dos números positivos é: " + sum);

        input.close();
    }
}
