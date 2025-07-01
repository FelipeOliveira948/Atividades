package ExerciciosDeComandosDeRepeticao;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int numero;
        int compara = 0;
        String nome;
        String menor = " ";

        for (; contador <= 10; contador++){
            System.out.println("Qual seu nome? : ");
            nome = entrada.next();
            System.out.println("Digite uma idade: ");
            numero = entrada.nextInt();
            if (compara == 0){
                compara = numero;
                menor = nome;
            }else if(compara > numero){
                compara = numero;
                menor = nome;
            }

        }
        System.out.println(menor + " é a pessoa mais nova, com a idade de: " + compara);
    }
}
