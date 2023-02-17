package exerciciosEstruturasDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcaoDesejada;
        Stack<String> pilhaLivros = new Stack<>();

        System.out.println("***********************************************");
        System.out.println("1 - Adicionar Livro na pilha");
        System.out.println("2 - Listar todos os Livros");
        System.out.println("3 - Retirar Livro da pilha");
        System.out.println("0 - Sair");
        System.out.println("***********************************************");
        System.out.println("Entre com a opção desejada: ");
        System.out.println();

        do {
            System.out.print("Digite um opção: ");
            opcaoDesejada = input.nextInt();
            input.nextLine();

            switch (opcaoDesejada){
                case 1:
                    System.out.print("Nome do livro: ");
                    pilhaLivros.push(input.nextLine());

                    System.out.println("Pilha: ");
                    for (String pl : pilhaLivros){
                        System.out.println(pl);
                    }
                    System.out.println("Livro adicionado!");
                    System.out.println();
                    break;

                case 2:
                    if(pilhaLivros.isEmpty()){
                        System.out.println("A pilha está vazia!");
                    }
                    else {
                        System.out.println("Lista de livros na Pilha: ");
                        for (String pl : pilhaLivros){
                            System.out.println(pl);
                        }
                    }
                    break;

                case 3:
                    if(pilhaLivros.isEmpty()){
                        System.out.println("A pilha está vazia!");
                    }
                    else {
                        pilhaLivros.pop();
                        System.out.println("Pilha: ");
                        for (String pl : pilhaLivros){
                            System.out.println(pl);
                        }
                        System.out.println("Um livro foi retira da pilha!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (opcaoDesejada != 0);

        System.out.println();
        System.out.println("Programa finalizado!");

        input.close();
    }
}
