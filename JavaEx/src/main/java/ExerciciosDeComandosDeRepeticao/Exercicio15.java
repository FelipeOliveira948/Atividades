package ExerciciosDeComandosDeRepeticao;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int numero;
        int sumula = 0;


        for (; contador <= 20; contador--){
            System.out.println("Digite um número que deseja por na soma (Digite um negativo para finalizar): ");
            numero = entrada.nextInt();
            if (numero < 0){
                break;
            }
            sumula += numero;

        }
        System.out.println("O total da soma dos números é: " + sumula);
    }
}
