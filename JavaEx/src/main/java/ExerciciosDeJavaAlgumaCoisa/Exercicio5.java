package ExerciciosDeJavaAlgumaCoisa;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int idade;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        if(idade >= 18 && idade < 65){
            System.out.println("Você é um eleitor obrigatório. ");
        }else if(idade >= 16 || idade >= 65){
            System.out.println("Você é um eleitor facultativo.");
        }else{
            System.out.println("Você é um não eleitor." );
        }

    }
}
