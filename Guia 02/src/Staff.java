public class Staff extends Persona {
    private double salario;
    private turno Turno;

    public Staff(int dni, String nombre, String apellido, String email, String dirección, double salario, turno turno) {
        super(dni, nombre, apellido, email, dirección);
        this.salario = salario;
        this.Turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public turno getTurno() {
        return Turno;
    }

    public void setTurno(turno turno) {
        Turno = turno;
    }
    public double calcularRemuneracionMensual(double diasTrabajados){
        return salario * diasTrabajados;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "salario=" + salario +
                ", Turno=" + Turno +
                ", dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", dirección='" + dirección + '\'' +
                '}';
    }
}