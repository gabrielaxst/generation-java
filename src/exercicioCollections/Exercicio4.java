package exercicioCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Set<Integer> setNumeros = new HashSet<>();
        setNumeros.add(2);
        setNumeros.add(5);
        setNumeros.add(1);
        setNumeros.add(3);
        setNumeros.add(4);
        setNumeros.add(9);
        setNumeros.add(7);
        setNumeros.add(8);
        setNumeros.add(10);
        setNumeros.add(6);

        System.out.print("Digite o número que você deseja encontrar: ");
        int posicaoNumero = input.nextInt();

        if (setNumeros.contains(posicaoNumero)){
            System.out.print("O número " + posicaoNumero+  " foi encontrado!");
        }
        else {
            System.out.print("O número " + posicaoNumero+  " não foi encontrado!");
        }
        input.close();
    }
}
