public class EmpleadoPH extends Empleado {
    //esta es la clase Empleado por hora
    private final int horasTrabajadas;
    //atributos
    public EmpleadoPH(double salario, String nombre, int horasTrabajadas) {
        super(salario, nombre);
        this.horasTrabajadas = horasTrabajadas;
    }
    //constructor
    @Override
    public double calcularSalario() {
        return horasTrabajadas * salario;
    }
    @Override
    public void mostrarEmpleado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas trabajadas: " + horasTrabajadas);
        System.out.println("Sueldo: " + calcularSalario());
    }
    //metodos
}