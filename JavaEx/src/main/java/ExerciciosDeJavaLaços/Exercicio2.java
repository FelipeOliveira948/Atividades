package ExerciciosDeJavaAlgumaCoisa;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float numero;

        System.out.println("Digite um número: ");
        numero = entrada.nextFloat();

        int contador = 4;


        while(contador > 1){

            while(contador == 4) {
                if (numero % 10 == 0) {
                    System.out.println(numero + " é divido por 10");
                } else {
                    System.out.println(numero + " Não é dividido  por 10");
                }
                contador -= 1;
            }

            while(contador == 3) {
                if (numero % 5 == 0) {
                    System.out.println(numero + " é divido por 5");
                } else {
                    System.out.println(numero + " Não é dividido por 5");
                }
                contador -= 1;
            }


            while(contador == 2) {
                if (numero % 2 == 0) {
                    System.out.println(numero + " é divido por 2");
                } else {
                    System.out.println(numero + " Não é dividido  por 2");
                }
                contador -= 1;
            }



            contador -= 1;
        }


    }

}
