package provedores;

public class Loggi implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;
        TipoProvedorFrete tipoProvedor;

        if(peso <= 5000) {
            valorFrete = 0.04*valor;
        } else {
            valorFrete = 0.12*valor;
        }

        tipoProvedor = obterTipoProvedorFrete();

        return new Frete(valorFrete, tipoProvedor);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}
