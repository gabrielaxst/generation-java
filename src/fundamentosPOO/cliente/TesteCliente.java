package fundamentosPOO.cliente;

import java.util.*;

//Com List
public class TesteCliente {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nome, cidade, estado;
        int idade;
        double saldo;

        List<Cliente> listaClientes = new ArrayList<>();

        for (int i = 0; i < 2; i++){
            System.out.printf("cliente %d ->\n", i+1);
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
            listaClientes.add(new Cliente(nome, cidade, estado, idade, saldo));
        }
        System.out.println();

        for (Cliente ls : listaClientes){
            System.out.println(ls.visualizar());
            System.out.println();
        }
        input.close();
    }
}
