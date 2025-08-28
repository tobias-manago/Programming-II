public class Empleado {
    //esta es la clase base abstracta
    private String nombre;
    private double salario;

    //atributos

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    //constructor

    public double calcularSalario() {
        return salario;
    }

    //metodo abstracto

    public String getNombre() {
        return nombre;
    }

    //getter
}
