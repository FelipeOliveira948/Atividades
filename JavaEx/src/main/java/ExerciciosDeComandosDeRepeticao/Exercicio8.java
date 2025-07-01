package ExerciciosDeComandosDeRepeticao;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int numero;
        int sumula = 0;

        for (; contador <= 20; contador++){
            System.out.println("Digite uma idade: ");
            numero = entrada.nextInt();
            if (numero >= 18){
                sumula += 1;
            }

        }
        System.out.println("Dessas 20 pessoas: " + sumula + " são maiores de idade");
    }
}
