package segundaaula;

import java.util.Scanner;

public class AnteceSucessor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        System.out.println("O antecessor de " + numero + " é o " + (numero-1) );
        System.out.println("O sucessor de " + numero + " é o " + (numero+1)) ;
    }
}
