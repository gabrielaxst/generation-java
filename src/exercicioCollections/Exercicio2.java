package exercicioCollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(2);
        listaNumeros.add(5);
        listaNumeros.add(1);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(9);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(10);
        listaNumeros.add(6);

        System.out.print("Digite o número que você quer encontrar? ");
        int posicaoNumero = input.nextInt();

        if (listaNumeros.contains(posicaoNumero)){
            System.out.print("O número " + posicaoNumero+  " está localizado na posição: " +
                    listaNumeros.indexOf(posicaoNumero));
        }
        else {
            System.out.println("O número " + posicaoNumero + " não foi encontrado!");
        }

        input.close();
    }
}
