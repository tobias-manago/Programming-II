public class EmpleadoContratista extends Empleado {
    private int HorasTrabajadas;
    private double TarifaPorProyecto;
    //atributos

    public EmpleadoContratista(String nombre,double salario,int HorasTrabajadas,double TarifaPorProyecto) {
        super(nombre, salario);
        this.HorasTrabajadas = HorasTrabajadas;
        this.TarifaPorProyecto = TarifaPorProyecto;
    }
    //constructor

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * HorasTrabajadas + TarifaPorProyecto;
    }
}
