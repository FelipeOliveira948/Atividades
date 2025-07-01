package ExerciciosDeComandosDeRepeticao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador;
        String nome;

        System.out.println("Digite seu nome: ");
        nome = entrada.next();

        System.out.println("Digite a quantidade vezes para repetir: ");
        contador = entrada.nextInt();

        for (; contador >= 0; contador--){
            System.out.println(nome);
        }
    }
}
