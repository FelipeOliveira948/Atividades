package quartaaula;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {

        float numero;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Escreva um número: ");
            numero = entrada.nextFloat();
            if (numero % 2 == 0){
                System.out.println("Esse número é par!");
            } else {
                System.out.println("Esse número é ímpar!");
            }
            System.out.println("------------------------ Thanks Isa :D S2");
        }
    }
    }


