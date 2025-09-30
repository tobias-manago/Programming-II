package Bicicleteria;

public abstract class Rodado {
    private static int contadorId = 1;
    protected int id;
    protected String modelo;
    protected Marca marca;
    protected boolean estaAlquilado;
    private double precioPorDia;

    public Rodado(int id) {
        this.id = contadorId++;
        this.estaAlquilado = false;
    }

    public Rodado(String modelo, Marca marca) {
        this.id = contadorId++;
        this.modelo = modelo;
        this.marca = marca;
        this.estaAlquilado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public boolean getEstaAlquilado() {
        return estaAlquilado;
    }

    public void setEstaAlquilado(boolean estaAlquilado) {
        this.estaAlquilado = estaAlquilado;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        if (precioPorDia < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
        this.precioPorDia = precioPorDia;
    }

    public abstract boolean alquilar();
    public abstract boolean devolver();

    @Override
    public String toString() {
        return "Rodado{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca=" + marca +
                ", estaAlquilado=" + estaAlquilado +
                '}';
    }
}
