package ExerciciosDeJavaAlgumaCoisa;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int numero = 0;

        for (; contador <= 20; contador++){
            System.out.println("Digite uma idade: ");
            numero += entrada.nextInt();

        }
        System.out.println("O valor total da soma das idades é: " + numero);
    }
}
