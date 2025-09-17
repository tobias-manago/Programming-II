public class Autor{
    private String nombre;
    private String apellido;
    private String email;
    private String Sexo; // 'M' o 'F'

    //atributos
    public Autor(String nombre, String apellido, String email, String genero){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.Sexo = genero;
    }

    //constructor
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getEmail(){
        return email;
    }

    public String getGenero(){
        return Sexo;
    }

    public String setNombre(String nombre){
        return this.nombre = nombre;
    }

    public String setApellido(String apellido){
        return this.apellido = apellido;
    }

    public String setEmail(String email){
        return this.email = email;
    }

    public String setGenero(String genero){
        return this.Sexo = genero;
    }
    //getters y setters

}
