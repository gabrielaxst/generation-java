package estruturasCondicionais.switchCase;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double salary;

        System.out.print("Digite seu nome: ");
        String name = input.nextLine();

        System.out.print("Cargo: ");
        int cod = input.nextInt();

        System.out.print("Digite o seu salário: ");
        salary = input.nextFloat();

        switch (cod) {
            case 1:
                salary += salary * 0.1;
                System.out.printf("Nome do colaborador: %s\nCargo: Gerente\nSalário atualizado: R$%.2f",
                        name, salary);
                break;
            case 2:
                salary += salary * 0.07;
                System.out.printf("Nome do colaborador: %s\nCargo: Vendedor\nSalário atualizado: R$%.2f",
                        name, salary);
                break;
            case 3:
                salary += salary * 0.09;
                System.out.printf("Nome do colaborador: %s\nCargo: Supervisor\nSalário atualizado: R$%.2f",
                        name, salary);
                break;
            case 4:
                salary += salary * 0.06;
                System.out.printf("Nome do colaborador: %s\nCargo: Motorista\nSalário atualizado: R$%.2f",
                        name, salary);
                break;
            case 5:
                salary += salary * 0.05;
                System.out.printf("Nome do colaborador: %s\nCargo: Estoquista\nSalário atualizado: R$%.2f",
                        name, salary);
                break;
            case 6:
                salary += salary * 0.08;
                System.out.printf("Nome do colaborador: %s\nCargo: Técnico de TI\nSalário atualizado: R$%.2f",
                        name, salary);
                break;
            default:
                System.out.println("Cargo não encontrado!");
        }

        input.close();
    }
}
