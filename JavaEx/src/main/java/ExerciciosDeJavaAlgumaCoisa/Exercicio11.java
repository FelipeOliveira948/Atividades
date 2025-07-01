package ExerciciosDeJavaAlgumaCoisa;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Digite o seu nome: ");
        String nome = entrada.next();

        System.out.println("Seu salario fixo: ");
        double salario = entrada.nextDouble();

        System.out.println("Quantidade de vendas feita: ");
        int vendas = entrada.nextInt();

        double comissao = (salario * 0.15f) * vendas;

        System.out.println(nome + " seu salário é " + salario + " com a comissão você recebeu no total: " + df.format(salario + comissao));
    }
}
