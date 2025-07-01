package ExerciciosDeJavaAlgumaCoisa;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        float valor1, valor2,total, IPI;
        int quant1, quant2;

        System.out.println("Digite a porcentagem de IPI: ");

        IPI = entrada.nextFloat();

        System.out.println("Qual o valor da peça 1; ");

        valor1 = entrada.nextFloat();

        System.out.println("Qual a quantidade da peça 1; ");

        quant1 = entrada.nextInt();

        System.out.println("Qual o valor da peça 2; ");

        valor2 = entrada.nextFloat();

        System.out.println("Qual a quantidade da peça 2; ");

        quant2 = entrada.nextInt();

        total = (valor1*quant1 + valor2*quant2)*(IPI/100 + 1);

        System.out.println("O valor total é: " + total);

    }
}
