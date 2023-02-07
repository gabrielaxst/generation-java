package salarioLiquido;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        float netSalary, grossSalary, additionalPay, overtime, discounts;
        System.out.print("Salário bruto: ");
        grossSalary = input.nextFloat();

        System.out.print("Adicional noturno: ");
        additionalPay = input.nextFloat();

        System.out.print("Horas extras: ");
        overtime = input.nextFloat();

        System.out.print("Descontos: ");
        discounts = input.nextFloat();

        netSalary = grossSalary + additionalPay + (overtime * 5) -  discounts;

        System.out.printf("Salário liquido: %.2f", netSalary);

        input.close();
    }
}
