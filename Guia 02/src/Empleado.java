public abstract class Empleado {
    //esta es la clase base abstracta
    protected String nombre;
    protected double salario;
    //atributos
    protected Empleado(double salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }
    public abstract double calcularSalario();
    public abstract void mostrarEmpleado();
    //metodos abstractos
}