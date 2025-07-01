package ExerciciosDeJavaAlgumaCoisa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Digite o valor gasto em produtos: ");
        float produto = entrada.nextFloat();

        System.out.println("Você tem 5 prestações de: " + df.format(produto / 5));
    }
}
