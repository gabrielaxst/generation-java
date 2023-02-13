package exerciciosRepeticao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade, pessoasMenos21 = 0, pessoasMais50 = 0;

        System.out.println("\tPara sair do loop, digite -99");
        System.out.print("Digite uma idade: ");
        idade = input.nextInt();

        while (idade != -99){
            System.out.print("Digite uma idade: ");
            idade = input.nextInt();
            if (idade < 21){
                pessoasMenos21++;
            }
            else if (idade > 50) {
                pessoasMais50++;
            }
        }

        System.out.println("Você digitou -99 e saiu do loop!");
        System.out.println("Pessoas com menos de 21 anos: " + pessoasMenos21);
        System.out.println("Pessoas com mais de 50 anos: "+ pessoasMais50);

        input.close();
    }
}
