package Bicicleteria;

public class Bicicleta extends Rodado {
    private double rodado; //hasta 29

    public Bicicleta(String modelo, Marca marca, double rodado) {
        super(modelo, marca);
        this.rodado = rodado;
        setPrecioPorDia(1000); // Asigna un precio por día adecuado
        this.estaAlquilado = false;
    }

    @Override
    public boolean alquilar() {
        if (!estaAlquilado) {
            estaAlquilado = true;
            System.out.println("La Bicicleta ha sido alquilada");
            return true;
        } else {
            System.out.println("La Bicicleta ya está alquilada");
            return false;
        }
    }

    @Override
    public boolean devolver(){
        if (estaAlquilado) {
            estaAlquilado = false;
            System.out.println("La Bicicleta ha sido devuelta");
            return true;
        } else {
            System.out.println("La Bicicleta no está alquilada");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "rodado=" + rodado +
                ", id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca=" + marca +
                ", estaAlquilado=" + estaAlquilado +
                '}';
    }
}