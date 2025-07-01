package quartaaula;

import java.util.Scanner;

public class For6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        int contador;
        int numero;
        int par = 0;
        int impar = 0;

        for(contador = 1; contador <= 10; contador++){
            System.out.println("Digite um número: ");
            numero = entrada.nextInt();
            if (numero % 2 != 0){
                System.out.println("impar");
                impar += 1;
            }else{
                System.out.println("par");
                par += 1;
            }
        }

        System.out.println("Haviam " + par + " numeros pares e " + impar + " números impares");

    }
}