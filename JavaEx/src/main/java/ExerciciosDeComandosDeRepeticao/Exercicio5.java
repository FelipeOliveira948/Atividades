package ExerciciosDeComandosDeRepeticao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        float numero = 0;

        for (; contador <= 10; contador++){
            System.out.println("Digite um numero: ");
            numero += entrada.nextFloat();

        }
        System.out.println("O valor total da soma dos números é: " + numero);
    }
}
