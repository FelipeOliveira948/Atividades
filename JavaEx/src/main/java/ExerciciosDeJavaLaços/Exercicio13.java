package ExerciciosDeJavaAlgumaCoisa;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius: ");
        float C = entrada.nextFloat();

        float F = (9*C+160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + F);



    }
}
