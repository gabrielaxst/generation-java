package estruturasRepeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, sex, category, totalBackend = 0, totalFrontendWoman =0, totalMobileMan =0, totalFullstackWoman =0;
        char n;

        System.out.print("Digite sua idade: ");
        age = input.nextInt();

        System.out.println("Digite seu sexo: \n(1) Masculino\n(2) Feminino\n(3) Outros");
        System.out.println("-> ");
        sex = input.nextInt();

        System.out.println("Digite sua categoria: ");
        System.out.println("Digite sua categoria: \n(1) Backend\n(2) Frontend\n(3) Mobile\n(4) Fullstack");
        System.out.println("-> ");
        category = input.nextInt();

        if (category == 1){
            totalBackend++;
        }
        if (sex == 2 && category == 2){
            totalFrontendWoman++;
        }
        if (sex == 1 && category == 3 && age > 40){
            totalMobileMan++;
        }
        if(sex == 2 && category == 4 && age < 30){
            totalFullstackWoman++;
        }

        System.out.println("Total de pessoas desenvolvedoras Backend: " + totalBackend);
        System.out.println("Total de mulheres desenvolvedoras Frontend: " + totalFrontendWoman);
        System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + totalMobileMan);
        System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: "+ totalFullstackWoman);

        System.out.print("Deseja continuar (S/N): ");
        n = input.next().charAt(0);


        while (n == 's' || n == 'S'){
            System.out.print("Digite sua idade: ");
            age = input.nextInt();
            System.out.println("Digite seu sexo: \n(1) Masculino\n(2) Feminino\n(3) Outros");
            System.out.println("-> ");
            sex = input.nextInt();

            System.out.println("Digite sua categoria: \n(1) Backend\n(2) Frontend\n(3) Mobile\n(4) Fullstack");
            System.out.println("-> ");
            category = input.nextInt();

            if (category == 1){
                totalBackend++;
            }
            if (sex == 2 && category == 2){
                totalFrontendWoman++;
            }
            if (sex == 1 && category == 3 && age > 40){
                totalMobileMan++;
            }
            if(sex == 2 && category == 4 && age < 30){
                totalFullstackWoman++;
            }

            System.out.println("Total de pessoas desenvolvedoras Backend: " + totalBackend);
            System.out.println("Total de mulheres desenvolvedoras Frontend: " + totalFrontendWoman);
            System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + totalMobileMan);
            System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: "+ totalFullstackWoman);
            System.out.print("Deseja continuar (S/N): ");

            n = input.next().charAt(0);
        }

        input.close();
    }
}
