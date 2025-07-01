package ExerciciosDeComandosDeRepeticao;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int numero = 0;

        for (; contador <= 20; contador++){
            System.out.println("Digite uma idade: ");
            numero += entrada.nextInt();

        }
        System.out.println("A média das idades é: " + (numero/20));
    }
}
