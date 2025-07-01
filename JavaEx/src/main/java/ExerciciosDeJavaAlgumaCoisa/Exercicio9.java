package ExerciciosDeJavaAlgumaCoisa;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario ;


        System.out.println("Digite seu salario: ");
        salario = entrada.nextDouble();

        double resultado = (int) salario / 1212.00f;

        System.out.println("Seu salario é equivalente(arredondado) á: " + Math.floor(resultado) );
    }
}
