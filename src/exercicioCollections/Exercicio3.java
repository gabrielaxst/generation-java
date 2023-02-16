package exercicioCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> setNumeros = new HashSet<>();

        System.out.println("Digite 10 números inteiros e não repetidos: ");
        for (int i = 0; i < 10; i++){
            System.out.printf("Número %d -> ",i+1);
            int numeroDigitado = input.nextInt();
            setNumeros.add(numeroDigitado);
        }

        System.out.println();
        System.out.println("Listar dados Set: ");
        Iterator<Integer> iSetNumeros = setNumeros.iterator();
        while (iSetNumeros.hasNext()){
            System.out.println(iSetNumeros.next());
        }
    }
}
