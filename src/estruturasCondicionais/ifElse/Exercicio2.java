package estruturasCondicionais.ifElse;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c1, c2, c3;

        System.out.println("Escreva três características do animal: ");
        System.out.print("Vertebrado ou Invertebrado? ");
        c1 = input.nextLine().toLowerCase();
        System.out.print("Ave, Mamífero, Inseto ou Anelídeo? ");
        c2 = input.nextLine().toLowerCase();
        System.out.print("Carnívoro, Onívoro, Herbívoro, Hematófago? ");
        c3 = input.nextLine().toLowerCase();

        if (c1.equals("vertebrado") && c2.equals("ave")){
            if (c3.equals("carnívoro")){
                System.out.println("Águia!");
            }
            else if(c3.equals("onívoro")) {
                System.out.println("Pomba!");
            }
            else {
                System.out.println("Caractéristica inválida!");
            }
        }

        else if(c1.equals("vertebrado") && c2.equals("mamífero")){
            if (c3.equals("onívoro")){
                System.out.println("Homem!");
            }
            else if(c3.equals("herbívoro")){
                System.out.println("Vaca!");
            }
            else {
                System.out.println("Característica inválida!");
            }
        }

        else if(c1.equals("invertebrado") && c2.equals("inseto")){
            if (c3.equals("hematófago")){
                System.out.println("Pulga!");
            }
            else if(c3.equals("herbívoro")){
                System.out.println("Lagarta!");
            }
            else{
                System.out.println("Caractéristica inválida!");
            }
        }

        else if(c1.equals("ivertebrado") && c2.equals("anelídeo")){
            if (c3.equals("hematófago")){
                System.out.println("Sanguessuga!");
            }
            else if(c3.equals("onívoro")){
                System.out.println("Minhoca!");
            }
            else {
                System.out.println("Característica inválida!");
            }
        }

        input.close();
    }
}
