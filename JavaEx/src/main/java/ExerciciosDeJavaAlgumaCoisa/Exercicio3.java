package ExerciciosDeJavaAlgumaCoisa;

import java.util.Scanner;


public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salarioM;

        System.out.print("Digite seu salário médio: ");
        salarioM = entrada.nextDouble();

        double salario30 = (salarioM * 0.30) + salarioM;
        double salario40 = (salarioM * 0.40) + salarioM;
        double salario50 = (salarioM * 0.50) + salarioM;

        if (salarioM > 0 && salarioM <= 500.00) {
            System.out.println("Você não recebeu nenhum crédito seu saldo é: " + salarioM);
        } else if (salarioM > 501 && salarioM <= 1000) {
            System.out.println("Você recebeu 30% de crédito seu saldo é: " + salario30);
        } else if (salarioM > 1001 && salarioM <= 3000) {
            System.out.println("Você recebeu 40% de crédito seu saldo é: " + salario40);
        } else if (salarioM > 30001) {
            System.out.println("Você recebeu 50% de crédito seu saldo é: " + salario50);
        } else {
            System.out.println("Salário inválido.");
        }

        entrada.close();
    }
}
