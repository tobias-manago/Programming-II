package Bicicleteria;

public class MonopatinElectrico extends Rodado implements Electrico {
    private double potencia;
    private int nivelCarga;
    private double altura;

    public MonopatinElectrico( String modelo, Marca marca, double potencia, int nivelCarga, double altura) {
        super(modelo, marca);
        this.potencia = potencia;
        this.nivelCarga = 100;
        this.altura = altura;
        setPrecioPorDia(1500); // Precio por día para monopatín eléctrico
        this.estaAlquilado = false;
    }

    @Override
    public boolean alquilar() {
        if (!estaAlquilado) {
            estaAlquilado = true;
            System.out.println("El monopatín ha sido alquilado");
            return true;
        } else {
            System.out.println("El monopatín ya está alquilado");
            return false;
        }
    }

    @Override
    public boolean devolver(){
        if (estaAlquilado) {
            estaAlquilado = false;
            System.out.println("El monopatín ha sido devuelto");
            return true;
        } else {
            System.out.println("El monopatín no está alquilado");
            return false;
        }
    }

    @Override
    public void cargarBateria() {
        this.nivelCarga = 100;
        System.out.println("Batería del monopatín cargada al 100%");
    }

    @Override
    public int getNivelCarga() {
        return nivelCarga;
    }

    @Override
    public String toString() {
        return "MonopatinElectrico{" +
                "potencia=" + potencia +
                ", nivelCarga=" + nivelCarga +
                ", altura=" + altura +
                ", id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca=" + marca +
                ", estaAlquilado=" + estaAlquilado +
                '}';
    }
}