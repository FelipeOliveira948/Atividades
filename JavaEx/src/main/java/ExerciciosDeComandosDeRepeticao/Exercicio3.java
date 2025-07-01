package ExerciciosDeComandosDeRepeticao;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = entrada.next();

        for (contador = 1;contador <= 10; contador++){
            System.out.println(nome);
        }
    }
}
