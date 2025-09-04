public class Libro extends Autor{
    private String titulo;
    private double precio;
    private int stock;
    //atributos
    public Libro(String nombre,String apellido,String email,String genero,String titulo, double precio, int stock){
        super(nombre, apellido, email, genero);
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
    }
    //constructor
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    //getters y setters
}
