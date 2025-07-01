package ExerciciosDeComandosDeRepeticao;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int numero;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        for (; contador <= 10; contador++){
            System.out.println(numero + "x" + contador + " = " + (numero * contador));

        }
    }
}
