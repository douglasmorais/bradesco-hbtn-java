package resumo_pedido.provedores;

public class Sedex implements ProvedorFrete {
    @Override
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete = 0;
        TipoProvedorFrete tipoProvedor;

        if(peso <= 1000) {
            valorFrete = 0.05*valor;
        } else {
            valorFrete = 0.1*valor;
        }

        tipoProvedor = obterTipoProvedorFrete();

        return new Frete(valorFrete, tipoProvedor);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}
