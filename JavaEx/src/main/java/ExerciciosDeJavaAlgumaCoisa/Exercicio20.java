package ExerciciosDeJavaAlgumaCoisa;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int numero;
        int sumula = 0;

        for (; contador <= 20; contador++){
            System.out.println("Digite um numero: ");
            numero = entrada.nextInt();
            if (numero > 8){
                sumula += 1;
            }

        }
        System.out.println("Desses 20 numeros: " + sumula + " são maiores que 8");
    }
}
