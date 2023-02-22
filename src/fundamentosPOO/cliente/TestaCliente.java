package fundamentosPOO.cliente;

import java.util.Locale;
import java.util.Scanner;

public class TestaCliente {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nome, cidade, estado;
        int idade;
        double saldo;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        System.out.print("Digite sua cidade: ");
        cidade = input.nextLine();
        System.out.print("Digite seu estado: ");
        estado = input.nextLine();
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        System.out.print("Digite seu saldo: ");
        saldo = input.nextDouble();
        input.nextLine();
        System.out.println();

        Cliente cliente1 = new Cliente(nome, cidade, estado, idade, saldo);
        System.out.println(cliente1.visualizar());
        System.out.println();

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        System.out.print("Digite sua cidade: ");
        cidade = input.nextLine();
        System.out.print("Digite seu estado: ");
        estado = input.nextLine();
        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        System.out.print("Digite seu saldo: ");
        saldo = input.nextDouble();
        System.out.println();

        Cliente cliente2 = new Cliente(nome, cidade, estado, idade, saldo);
        System.out.println(cliente2.visualizar());

        input.close();
    }
}
