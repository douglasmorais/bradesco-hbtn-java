package provedores;

public class JadLog implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;
        TipoProvedorFrete tipoProvedor;

        if(peso <= 2000) {
            valorFrete = 0.045*valor;
        } else {
            valorFrete = 0.07*valor;
        }

        tipoProvedor = obterTipoProvedorFrete();

        return new Frete(valorFrete, tipoProvedor);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
