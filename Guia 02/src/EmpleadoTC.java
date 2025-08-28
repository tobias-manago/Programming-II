public class EmpleadoTC extends Empleado {
    //esta es la clase Empleado tiempo completo
    private int DiasTrabajados;
    private double PagoPorDia;
    //atributos

    public EmpleadoTC(String nombre, double salario, int DiasTrabajados) {
        super(nombre, salario);
        this.PagoPorDia = (int) (salario * 8);
        this.DiasTrabajados = DiasTrabajados;
    }

    //constructor


    //metodos


    @Override
    public double calcularSalario() {
        return PagoPorDia * DiasTrabajados;
    }
}
