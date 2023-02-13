package exerciciosRepeticao;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, soma = 0, totalNum = 0, media;

        System.out.println("Para sair do loop, digite 0.");
        System.out.println("Média dos múltiplos de 3!");
        do {
            System.out.print("Digite um número: ");
            num = input.nextInt();
            if (num % 3 == 0 && num != 0){
                soma += num;
                totalNum++;
            }
        }while (num != 0);

        if (soma != 0){
            media = soma / totalNum;
            System.out.println("Média de todos os números digitados é: " + media);
        }
        else {
            System.out.println("Não foram digitados números multiplos de 3.");
        }

        input.close();
    }
}
