public class Gerente extends Empregado {
    public double calcularBonus(Departamento departamento) {
        double bonus = 0;
        if(departamento.alcancouMeta() == true) {
            bonus = (0.2 * this.salarioFixo) + (0.01 * (departamento.getValorAtingidoMeta() - departamento.getValorMeta()));
        }
        return bonus;
    }

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }
}
