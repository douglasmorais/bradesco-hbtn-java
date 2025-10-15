package conta_basica;

import conta_basica.exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }


    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor > 0) {
            this.saldo += valor;
        } else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if(this.saldo - valor >= 0) {
            this.saldo -= valor;
        } else {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
    }

    public double calcularTarifaMensal() {
        double tarifa = 0.1*this.saldo;
        if(tarifa > 10) tarifa = 10;
        return tarifa;
    }

    public double calcularJurosMensal() {
        double taxaJurosMensal = this.taxaJurosAnual/1200;
        if(this.saldo < 0) taxaJurosMensal = 0;
        return saldo*taxaJurosMensal;
    }

    public void aplicarAtualizacaoMensal() {
        this.saldo = (this.saldo - calcularTarifaMensal())+calcularJurosMensal();
    }
}
