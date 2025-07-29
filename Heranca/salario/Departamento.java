public class Departamento {
    private double valorMeta;
    private double valorAtingidoMeta;

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public boolean alcancouMeta() {
        if(getValorAtingidoMeta() >= valorMeta) {
            return true;
        } else {
            return false;
        }
    }
}