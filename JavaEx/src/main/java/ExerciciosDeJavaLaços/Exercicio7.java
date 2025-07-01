package ExerciciosDeJavaAlgumaCoisa;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {

        float nota1 = 8;
        float nota2 = 9;
        float nota3 = 7;
        float nota4 = 4;
        float nota5 = 5;
        float nota6 = 6;
        float media1;
        float media2, mediatotal, mediafinal;

        media1 = (nota1 + nota2 + nota3 ) / 3;

        System.out.println("Sua primeira média é; " + media1);

        media2 = (nota4 + nota5 + nota6 ) / 3;

        System.out.println("Sua segunda média é; " + media2);

        mediatotal = media1 + media2;

        System.out.println("Sua soma das médias é; "+ mediatotal);

        mediafinal = mediatotal / 2;

        System.out.println("Sua média das médias é; "+ mediafinal);
    }

}
