public class Empregado {
    private double salarioFixo;

    public double getSalarioFixo() {
        return salarioFixo;
    }

    Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        double bonus = 0;
        if(departamento.alcancouMeta() == true) {
            bonus = 0,1 * this.salarioFixo;
        }
        return bonus;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        double salario;
        salario = this.salarioFixo + calcularBonus(departamento);
        return salario;
    }
}