public class EmpleadoContratista extends Empleado {
    private final int HorasTrabajadas;
    private final double TarifaPorProyecto;
    //atributos
    public EmpleadoContratista(double salario, String nombre, int horasTrabajadas, double tarifaPorProyecto) {
        super(salario, nombre);
        HorasTrabajadas = horasTrabajadas;
        TarifaPorProyecto = tarifaPorProyecto;
    }
    //constructor
    @Override
    public double calcularSalario(){
        return TarifaPorProyecto + HorasTrabajadas * salario;
    }
    @Override
    public void mostrarEmpleado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Horas trabajadas: " + HorasTrabajadas);
        System.out.println("Tarifa por proyecto: " + TarifaPorProyecto);
        System.out.println("Ganancia Total: " + calcularSalario());
    }
    //metodos
}