package exerciciosRepeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0, idade, genero, op, pessoasCalmas = 0, mulheresNervosas = 0, homensAgressivos = 0,
        outrosCalmos = 0, nervososMais40 = 0, calmosMenos18 = 0;
        char sair;

        System.out.println("Pesquisa para saber as características psicológicas dos indivíduos desta região!");
        System.out.println("\tPara sair do loop, digite 0.");

        while (contador <= 150){
            System.out.print("Idade: ");
            idade = input.nextInt();

            System.out.println("Identificação de gênero: (1) Feminino | (2) Masculino | (3) Outros");
            System.out.print("Opção -> ");
            genero = input.nextInt();
            while (genero < 1 || genero > 3){
                System.out.println("Opeção inválida! Digite novamente: ");
                System.out.print("Opção -> ");
                genero = input.nextInt();
            }

            System.out.println("Você se considera uma pessoa: (1) Calma | (2) Nervosa | (3) Agressiva");
            System.out.print("Opção -> ");
            op = input.nextInt();
            while (op < 1 || op > 3){
                System.out.println("Opeção inválida! Digite novamente: ");
                System.out.print("Opção -> ");
                op = input.nextInt();
            }
            contador++;

            if (op == 1){
                pessoasCalmas++;
            }
            if(op == 2 && genero == 1){
                mulheresNervosas++;
            }
            if (op == 3 && genero == 2) {
                homensAgressivos++;
            }
            if(op == 1 && genero == 3){
                outrosCalmos++;
            }
            if(op == 2 && idade > 40){
                nervososMais40++;
            }
            if(op == 1 && idade < 18){
                calmosMenos18++;
            }

            System.out.print("Deseja sair do loop s/n?");
            sair = input.next().charAt(0);
            if (sair == 's'){
                contador = 151;
            }
        }

        System.out.println("Pessoas calmas: " + pessoasCalmas);
        System.out.println("Mulheres nervosas: " +  mulheresNervosas);
        System.out.println("Homens agressivos: " + homensAgressivos);
        System.out.println("Outros calmos: " + outrosCalmos);
        System.out.println("Pessoas nervosas com mais de 40 anos: " + nervososMais40);
        System.out.println("pessoas calmas com menos de 18 anos: " + calmosMenos18);

        input.close();
    }
}
