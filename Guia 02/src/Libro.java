public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    //atributos

    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    //constructor

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Autor getAutor() {
        return autor;
    }

    //getters y setters
    @Override
    public String toString() {
        return "Libro: " + titulo + ", " + autor +
                ", Precio: " + precio + " pesos, Stock: " + stock;
    }
    // Punto g
    public void imprimirMensajeVenta() {
        System.out.println("El libro, " + titulo + " de " + autor.getNombre() +
                ". Se vende a " + precio + " pesos.");
    }
    //metodos
}
