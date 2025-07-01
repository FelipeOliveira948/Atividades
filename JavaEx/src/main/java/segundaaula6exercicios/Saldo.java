package segundaaula;

import java.util.Scanner;

public class Saldo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

       float saldo, reajuste;

        System.out.println("Digite o seu saldo; ");

        saldo = entrada.nextFloat();

        reajuste = saldo - (saldo * 0.01f);

        System.out.println("Seu salário foi reajustado em 1%, agora seu saldo é: " + reajuste);



    }


}
