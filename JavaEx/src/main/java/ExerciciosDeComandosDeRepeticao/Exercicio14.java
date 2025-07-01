package ExerciciosDeComandosDeRepeticao;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int numero;
        int sumula = 0;
        int sumula2 = 0;
        int sumula3 = 0;

        for (; contador <= 20; contador++){
            System.out.println("Digite um numero: ");
            numero = entrada.nextInt();
            if (numero >= 0 && numero <= 100){
                sumula += 1;
            } else if(numero >= 101 && numero <= 200){
                sumula2 += 1;
            }else if(numero > 200){
                sumula3 += 1;
            }

        }
        System.out.println("Desses 20 numeros: " + sumula + " estão entre 0 e 100.");
        System.out.println("Desses 20 numeros: " + sumula2 + " estão entre 101 e 200.");
        System.out.println("Desses 20 numeros: " + sumula3 + " são maiores que 200");

    }
}
