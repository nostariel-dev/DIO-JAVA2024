import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesBancarias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o saldo inicial da conta ao usuário
        double saldo = scanner.nextDouble();

        // Solicita a quantidade de transações ao usuário
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<String> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Solicita o tipo de transação ao usuário
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);

            // Solicita o valor da transação ao usuário
            double valorTransacao = scanner.nextDouble();

            // Atualiza o saldo da conta e adiciona a transação à lista
            if (tipoTransacao == 'D') {
                saldo += valorTransacao;
                transacoes.add(i + ". Depósito de " + valorTransacao);
            } else if (tipoTransacao == 'S') {
                saldo -= valorTransacao;
                transacoes.add(1 + ". Saque de " + valorTransacao);
            } else {
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
            }
        }

        // Exibe o saldo final
        System.out.println("Saldo: " + saldo);

        // Exibe a lista de transações
        System.out.println("Transacoes:");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

