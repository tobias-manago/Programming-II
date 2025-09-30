public class Estudiante extends  Persona {
    private int AñoDeIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante(int dni, String nombre, String apellido, String email, String dirección, int añoDeIngreso, double cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, dirección);
        this.AñoDeIngreso = añoDeIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public String getAñoDeIngreso() {
        return AñoDeIngreso;
    }

    public void setAñoDeIngreso(String añoDeIngreso) {
        AñoDeIngreso = añoDeIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
