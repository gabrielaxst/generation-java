package estruturasCondicionais.switchCase;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int cod, amount;
        double totalPrice;
        System.out.println("\tMenu de lanches: ");
        System.out.println("Cachorro-Quente (1) - X-Salada (2) - X-Bacon (3)");
        System.out.println("Bauru (4) - Refrigerante (5) - Suco de Laranja (6)");
        System.out.print("Digite o número do lanche desejado: ");
        cod = input.nextInt();
        System.out.print("Digite a quantidade: ");
        amount = input.nextInt();

        switch (cod) {
            case 1:
               totalPrice = amount * 10.00;
               System.out.printf("Produto: Cachorro-Quente\nValor total: R$%.2f", totalPrice);
               break;
            case 2:
                totalPrice = amount * 15.00;
                System.out.printf("Produto: X-Salada\nValor total: R$%.2f", totalPrice);
                break;
            case 3:
                totalPrice = amount * 18.00;
                System.out.printf("Produto: X-Bacon\nValor total: R$%.2f", totalPrice);
                break;
            case 4:
                totalPrice = amount * 12.00;
                System.out.printf("Produto: Bauru\nValor total: R$%.2f", totalPrice);
                break;
            case 5:
                totalPrice = amount * 8.00;
                System.out.printf("Produto: Refrigerante\nValor total: R$%.2f", totalPrice);
                break;
            case 6:
                totalPrice = amount * 13.00;
                System.out.printf("Produto: X-Salada\nValor total: R$%.2f", totalPrice);
                break;
            default:
                System.out.println("Não existe lanche relacionado ao número digitado!");
        }
        input.close();
    }
}
