public class EmpleadoPH extends Empleado {
    //esta es la clase Empleado por hora
    private int horasTrabajadas;
    public EmpleadoPH(String nombre, double salario, int horasTrabajadas){
        super(nombre, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    //constructor

    @Override
    public double calcularSalario() {
        return horasTrabajadas * super.calcularSalario();
    }

    //metodos
}
