public class ItemVenta {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    //Atributos

    public  ItemVenta(){
        this.identificador = 0;
        this.descripcion = ".";
        this.cantidad  = 0;
        this.precioUnitario = 0.0;
    }
    //Constructor

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    //getters y setters
    public double calcularPrecioTotal() {
        double precioTotal = cantidad * precioUnitario;
        return precioTotal;
    }

    public void mostrarDatosItemVenta() {
        System.out.print("identificador: " + identificador + ", descripcion: " + descripcion + ", cantidad: " + cantidad + ", precio unitario: " + precioUnitario + ", precio total: " + calcularPrecioTotal());
    }
    //Metodos

}
