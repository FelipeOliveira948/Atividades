package terceiraaula;

import java.util.Scanner;

public class Exemplo2Switch {

    public static void main(String[] args) {
        int numMes;
        String nomeMes;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o numero do mês: ");
        numMes = entrada.nextInt();

        switch(numMes){
            case 1: nomeMes = "Janeiro"; break;
            case 2: nomeMes = "Fevereiro"; break;
            case 3: nomeMes = "Março"; break;
            case 4: nomeMes = "Abril"; break;
            case 5: nomeMes = "Maio"; break;
            case 6: nomeMes = "Junho"; break;
            case 7: nomeMes = "Julho"; break;
            case 8: nomeMes = "Agosto"; break;
            case 9: nomeMes = "Setembro"; break;
            case 10: nomeMes = "Outubro"; break;
            case 11: nomeMes = "Novembro"; break;
            case 12: nomeMes = "Dezembro"; break;
            default: nomeMes = "Mês inválido";


        }

        System.out.println(nomeMes);
    }

}
