package estruturasCondicionais.ifElse;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = input.nextLine();

        System.out.print("Digite sua idade: ");
        int age = input.nextInt();

        System.out.print("Primeira doação de sangue? Sim (true) | Não (false): ");
        boolean firstDonation = input.nextBoolean();

        if (age >= 18 && age <= 69){
            if (age >= 60 && firstDonation){
                System.out.printf("%s não está apto(a) para doação de sangue!", name);
            }
            else{
                System.out.printf("%s está apto(a) para doação de sangue!", name);
            }
        }
        else {
            System.out.printf("%s não está apto(a) para doação de sangue!", name);
        }
        input.close();
    }
}
