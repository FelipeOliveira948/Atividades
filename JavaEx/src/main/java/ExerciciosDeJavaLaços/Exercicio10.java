package ExerciciosDeJavaAlgumaCoisa;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double saldo ;

        System.out.println("Digite seu salario: ");
        saldo = entrada.nextDouble();

        double resultado = saldo + (saldo * 0.015f);
        System.out.println("Seu saldo com reajuste:" + df.format(resultado) );
    }
}
