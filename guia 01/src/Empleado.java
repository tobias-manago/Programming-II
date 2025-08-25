public class Empleado {
    private int DNI;
    private String nombre;
    private String apellido;
    private double salario;
    //Atributos

    public Empleado(int DNI, String nombre, String apellido, double salario) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }
    //Constructor

    public float calcularSalarioAnual() {
        float salarioAnual = (float) salario * 12;
        return salarioAnual;
    }

    public double aumentarSalario(double porcentaje) {
        float aumento = (float) (salario * porcentaje) / 100;
        salario = salario + aumento;
        return salario;
    }

    public void MostrarDatosEmpleado() {
        System.out.println("DNI: " + DNI);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Salario mensual: " + salario);
        System.out.println("Salario anual: " + calcularSalarioAnual());
    }

    //Metodos


}
