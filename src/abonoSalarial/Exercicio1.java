package abonoSalarial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        float salary, allowance, updatedSalary;

        System.out.print("Digite o salário: ");
        salary = input.nextFloat();

        System.out.print("Digite o abono: ");
        allowance = input.nextFloat();

        updatedSalary = salary + allowance;

        System.out.printf("Novo salário: %.2f", updatedSalary);

        input.close();
    }
}
