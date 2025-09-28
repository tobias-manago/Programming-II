public class EmpleadoTC extends Empleado {
    //esta es la clase Empleado tiempo completo
    private final int DiasTrabajados;
    //atributos
    public EmpleadoTC(double salario, String nombre, int diasTrabajados) {
        super(salario, nombre);
        DiasTrabajados = diasTrabajados;
    }
    //constructor
    @Override
    public double calcularSalario() {
        return salario*DiasTrabajados;
    }
    @Override
    public void mostrarEmpleado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Dias Trabajados: " + DiasTrabajados);
        System.out.println("Sueldo: " + calcularSalario());
    }
    //metodos
}