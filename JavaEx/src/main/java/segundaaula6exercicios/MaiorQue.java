package segundaaula;

import java.util.Scanner;

public class MaiorQue {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float num1, num2;

        System.out.println("Entre com o primeiro número; ");
        num1 = entrada.nextFloat();
        System.out.println("Entre com o segundo número; ");
        num2 = entrada.nextFloat();


        if (num1 > num2){
            System.out.println("O primeiro número " + num1 + " é maior");
        } else if (num2 > num1) {
            System.out.println("O segundo número " + num2 + " é maior");
        }
        else{
            System.out.println("Os números são iguais");
        }
    }
}
