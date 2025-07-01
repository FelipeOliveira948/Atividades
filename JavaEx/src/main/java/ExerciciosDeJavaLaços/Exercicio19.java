package ExerciciosDeJavaAlgumaCoisa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor em real desejado: ");
        double Real = entrada.nextDouble();

        double Dolar = Real / 5.54f;

        System.out.println("A cotação em dolar atual é de 5.54, pelo valor informado você possui: " + Dolar + " dolares.");



    }
}
