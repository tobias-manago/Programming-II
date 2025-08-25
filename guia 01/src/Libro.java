public class Libro {
    private String titulo;
    private int id;
    private String autor;
    private int precio;
    private int cant;
    private static int contador = 0;
    //Atributos

    public Libro(String titulo, String autor, int precio, int cant) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cant = cant;
        this.id = contador++;
    }

    //Constructor
    public String getTitulo() {
        return titulo;
    }

    public String setTitulo(String titulo) {
        this.titulo = titulo;
        return titulo;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public String setAutor(String autor) {
        this.autor = autor;
        return autor;
    }

    public int getPrecio() {
        return precio;
    }

    public int setPrecio(int precio) {
        this.precio = precio;
        return precio;
    }

    public int getCant() {
        return cant;
    }

    public int setCant(int cant) {
        this.cant = cant;
        return cant;
    }

    //getters y setters
    public int vender(int cantidad) {
        if (cantidad > cant) {
            System.out.println("No hay stock suficiente. \nStock actual: " + cant);
        } else {
            cant = cant - cantidad;
            System.out.println("Venta realizada. \nStock actual: " + cant);
        }
        return cant;
    }

    public int comprar(int cantidad) {
        cant = cant + cantidad;
        System.out.println("Compra realizada. \nStock actual: " + cant);
        return cant;
    }

    public void mostrarDatosLibro() {
        System.out.println("ID: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad en stock: " + cant);
    }
    //Metodos


}
