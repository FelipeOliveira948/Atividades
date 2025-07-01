package ExerciciosDeComandosDeRepeticao;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int numero;
        int sumula = 0;

        for (; contador <= 20; contador++){
            System.out.println("Digite um numero: ");
            numero = entrada.nextInt();
            if (numero % 2 == 0){
                sumula += 1;
            }

        }
        System.out.println("Desses 20 numeros: " + sumula + " são pares.");
    }
}
