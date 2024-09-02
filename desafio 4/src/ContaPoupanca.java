public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    // Construtor da classe derivada
    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero);
        
        this.taxaJuros = taxaJuros;
    }
    // Método para exibir informações sobre a conta poupança
    /*
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de juros: " + taxaJuros);
    }
        */

    public void exibirInformacoes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exibirInformacoes'");
    }
}
