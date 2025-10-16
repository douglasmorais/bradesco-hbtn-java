public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes;

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    public void depositar(double valor) throws exceptions.OperacaoInvalidaException {
        super.depositar(valor - 0.10);
        this.quantidadeTransacoes += 1;
    }

    @Override
    public void sacar(double valor) throws exceptions.OperacaoInvalidaException {
        super.sacar(valor + 0.10);
        this.quantidadeTransacoes += 1;
    }
}
