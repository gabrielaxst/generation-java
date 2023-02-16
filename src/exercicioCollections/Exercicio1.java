package exercicioCollections;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> listaCores = new ArrayList<>();

        System.out.println("Digite 5 cores: ");
        for (int i = 0; i <  5; i++){
            System.out.printf("Cor %d -> ", i+1);
            String cores = input.nextLine();
            listaCores.add(cores);
        }

        System.out.println();
        System.out.println("Listar todas as cores: ");
        Iterator<String> iCores = listaCores.iterator();
        while (iCores.hasNext()){
            System.out.println(iCores.next());
        }

        System.out.println();
        Collections.sort(listaCores);
        iCores = listaCores.iterator();
        while (iCores.hasNext()){
            System.out.println(iCores.next());
        }

        input.close();
    }
}
