package estruturasRepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int num1, num2, verification, n =0;

        System.out.println("\tDigite dois números inteiros.");
        System.out.println("Regras: 1ºnúmero < 2ºnúmero");
        System.out.print("Digite o primeiro número do intervalo: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número do intervalo: ");
        num2 = input.nextInt();

        if (num1 >= num2) {
            System.out.println("Intervalo inválido!");
        }
        else{
            System.out.printf("No intervalo entre %d e %d: ", num1, num2);
            for (int i = num1; i <= num2; i++ ){
                //verification = verificar quantas vezes o loop irá rodar
                verification = num2-num1;
                if (i % 3 == 0 && i % 5 == 0){
                    System.out.printf("\n%d é múltiplo de 3 e 5", i);
                }
                else {
                    //n = cada vez que não haver múltiplos, n irá aumentar
                    //se n for igual a verification, seguinifica que não houve mútilplos de 3 e 5
                    n +=1;
                    if (n == verification){
                        System.out.println("não há números multiplos de 3 e 5.");
                    }
                }
            }
        }





        input.close();
    }
}
