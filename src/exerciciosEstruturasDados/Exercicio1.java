package exerciciosEstruturasDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Queue<String> filaBanco = new LinkedList<>();
        int escolhaMenu;

        System.out.println("***********************************************");
        System.out.println("1 - Adicionar Cliente na fila");
        System.out.println("2 - Listar todos os Clientes");
        System.out.println("3 - Retirar Cliente da Fila");
        System.out.println("0 - Sair");
        System.out.println("***********************************************");
        System.out.println("Entre com a opção desejada: ");
        System.out.println();

        do {
            System.out.print("Digite uma opção: ");
            escolhaMenu = input.nextInt();
            input.nextLine();

            if (escolhaMenu == 1){
                System.out.print("Digite o nome do Cliente: ");
                String nomeCliente = input.nextLine();
                filaBanco.add(nomeCliente);
                System.out.println();
            }
            Iterator<String> iFilaBanco = filaBanco.iterator();

            if (!filaBanco.isEmpty() && escolhaMenu == 1){
                System.out.println("Fila: ");
                System.out.println();
                while (iFilaBanco.hasNext()){
                    System.out.println(iFilaBanco.next());
                }
                System.out.println();
                System.out.println("Cliente adicionado!");
                System.out.println();
            }
            if (escolhaMenu == 2){
                if (filaBanco.isEmpty()){
                    System.out.println("A fila está vazia!");
                }
                else {
                    System.out.println();
                    System.out.println("Lista de Clientes na fila: ");
                    while (iFilaBanco.hasNext()){
                        System.out.println(iFilaBanco.next());
                    }
                    System.out.println();
                }

            }
            if (escolhaMenu == 3){
                if (filaBanco.isEmpty()){
                    System.out.println("A fila está vazia!");
                    System.out.println();
                }
                else {
                    filaBanco.poll();
                    System.out.println("Fila: ");
                    System.out.println();
                    for (String fb : filaBanco){
                        System.out.println(fb);
                    }
                    System.out.println();
                }
            }

        }while (escolhaMenu != 0);

        System.out.println("Programa finalizado!");
        input.close();
    }
}
