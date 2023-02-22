package fundamentosPOO.funcionario;

import java.util.Locale;

public class TestaFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Funcionario funcionario1 = new Funcionario("Gabriela", "Desenvolvedora FullStack", 3665.00,
                234, 1);
        System.out.println(funcionario1.visualizar());

        System.out.println();
        Funcionario funcionario2 = new Funcionario("Alan", "Desenvolvedor Front End", 10665.00,
                334, 7);
        System.out.println(funcionario2.visualizar());

    }
}
