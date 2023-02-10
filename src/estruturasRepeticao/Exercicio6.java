package estruturasRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int num, count = 0, sum = 0;
        double mean;

        System.out.println("\tPara sair do loop, digite 0.");

        do {
            System.out.print("Digite um número: ");
            num = input.nextInt();
            if (num % 3 == 0){
                sum += num;
                count++;
            }

        }while (num != 0);

        mean = (double) sum / (count - 1);

        System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", mean);

        input.close();
    }
}
