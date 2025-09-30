package Bicicleteria;

public class BicicletaElectrica extends Bicicleta implements Electrico {
    private double potenciaBateria;
    private double nivelCarga;

    public BicicletaElectrica(String modelo, Marca marca, double rodado, double potenciaBateria) {
        super(modelo, marca, rodado);
        this.potenciaBateria = potenciaBateria;
        this.nivelCarga = 100; //se entregan cargadas
        setPrecioPorDia(2000); // Precio por día para eléctrica
    }

    public double getPotenciaBateria() {
        return potenciaBateria;
    }

    public void setPotenciaBateria(double potenciaBateria) {
        this.potenciaBateria = potenciaBateria;
    }

    public void setNivelCarga(double nivelCarga) {
        this.nivelCarga = nivelCarga;
    }

    @Override
    public boolean alquilar() {
        if (!estaAlquilado) {
            estaAlquilado = true;
            System.out.println("La Bicicleta eléctrica ha sido alquilada");
            return true;
        } else {
            System.out.println("La Bicicleta eléctrica ya está alquilada");
            return false;
        }
    }

    @Override
    public boolean devolver() {
        if (estaAlquilado) {
            estaAlquilado = false;
            System.out.println("La Bicicleta eléctrica ha sido devuelta");
            return true;
        } else {
            System.out.println("La Bicicleta eléctrica no está alquilada");
            return false;
        }
    }

    @Override
    public void cargarBateria() {
        this.nivelCarga = 100;
        System.out.println("Batería cargada al 100%");
    }

    @Override
    public int getNivelCarga() {
        return (int) nivelCarga;
    }

    @Override
    public String toString() {
        return "BicicletaElectrica{" +
                "potenciaBateria=" + potenciaBateria +
                ", nivelCarga=" + nivelCarga +
                ", id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca=" + marca +
                ", estaAlquilado=" + estaAlquilado +
                '}';
    }
}