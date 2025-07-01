package quintaaula;


import java.util.Random;
import java.util.Scanner;

public class Conta {

   int numero_conta;
   String titular_conta;
   double saldo; //Double é para valores quebrados de monetários, float é pra valores pequenos.
    Scanner entrada = new Scanner(System.in);


    public Conta(String nome_titular, double saldo_inicial){
        this.titular_conta = nome_titular;
        this.saldo = saldo_inicial;
        Random randomiza = new Random(); //gerador randomico de numeros
        numero_conta = randomiza.nextInt(1000);
    }
    public void VerSaldo(){

        System.out.println("O número da conta é: " + numero_conta);
        System.out.println("O titular da conta é: " + titular_conta);
        System.out.println("O saldo da conta é: " + saldo);

    }

    public void Saque(double valor_saque ){
        if(saldo >= valor_saque){
            saldo = saldo - valor_saque;
            System.out.println("Valor do saldo atual é: " + saldo);
        }else{
            System.out.println("Seu saldo é insuficiente!");
        }
    }

    public void Deposito(double valor_deposito){
        if(valor_deposito <= 0){
            System.out.println("Valor inválido! o valor deve ser acima de 0.");
        }else{
            saldo = saldo + valor_deposito;
            System.out.println("Depósito concluido! seu saldo é: " + saldo);
        }
    }

    public void Emprestimo(double valor_saque){
        if(saldo <= 100) {
            if(valor_saque > 1000) {
                System.out.println("Valor excede o valor de emprestimo permitido, tente novamente no menu. ");
            }
            saldo += valor_saque;
        }else{
            System.out.println("Você não possui saldo valido para empréstimo");
        }
    }

    public void Exibir_menu(){
        System.out.println("Bem vindo ao Banco XYZ");
        System.out.println("Escolha a sua opção:");
        System.out.println("1 - Ver o saldo");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Finalizar");
        System.out.println("5 - Empréstimo");
    }

    public void Iniciar(){
        int opcao;
        do{
            Exibir_menu();
            opcao = entrada.nextInt();
            Escolher_funcao(opcao);
        }while (opcao !=4);
    }

    public void Escolher_funcao(int opcao){
        double saque;
        double deposito;

        switch (opcao){
            case 1: VerSaldo();
            break;
            case 2:
                System.out.println("Digite o valor do saque: ");
                saque = entrada.nextDouble();
                Saque(saque);
            break;

            case 3:
                System.out.println("Digite o valor do depósito: ");
                deposito = entrada.nextDouble();
                Deposito(deposito);
            break;

            case 4:
                System.out.println("Operação finalizada");
                break;

            case 5:
                System.out.println("Escolha o valor do emprestimo (1000max)");
                saque = entrada.nextDouble();
                Emprestimo(saque);
                break;

            default:
                System.out.println("Opção inválida!");
        }
    }


}

