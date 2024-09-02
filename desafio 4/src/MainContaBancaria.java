import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo inicial da conta ao usuário
        double saldoInicial = scanner.nextDouble();

        // Cria uma nova conta bancária com o saldo inicial
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Solicita o valor do depósito ao usuário e realiza o depósito
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Solicita o valor do saque ao usuário e realiza o saque
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
            saldo += valor; // Corrige a atualização do saldo
            System.out.println("Deposito feito.");
    
            imprimirSaldo();
    }

    public void sacar(double valor) {
            if(valor <= saldo) {
                saldo = saldo - valor;
                System.out.println("Saque feito.");
            } else {
                System.out.println("Saldo insuficiente. Saque nao realizado.");
            }
        imprimirSaldo();
        }


    private void imprimirSaldo() {
        System.out.println(saldo);
    }
}


