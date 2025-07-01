package ExerciciosDeComandosDeRepeticao;

public class Exercicio2 {
    public static void main(String[] args) {

        int contador = 0;
        int numero;

        for (numero = 0; contador <= 15; contador++){
            numero += contador;
        }

        System.out.println("O total da soma dos números de 1 a 15 é: " + numero);
    }
}
