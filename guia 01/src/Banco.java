public class Banco {
    private int ID;
    private String nombre;
    private float balance;
    //Atributos

    public Banco(int ID, String nombre, float balance) {
        this.ID = ID;
        this.nombre = nombre;
        this.balance = balance;
    }
    //Constructor


    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }
    //getters y setters

    public float depositar(float monto) {
        balance = balance + monto;
        System.out.println("Deposito realizado. \nNuevo balance: " + balance);
        return balance;
    }

    public float sustraccion(float monto) {
        if (monto > balance) {
            System.out.println("Fondos insuficientes. \nBalance actual: " + balance);
        } else {
            balance = balance - monto;
            System.out.println("Sustraccion realizada. \nNuevo balance: " + balance);
        }
        return balance;
    }

    public void mostrarDatosBanco() {
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + nombre);
        System.out.println("Balance: " + balance);
    }
    //Metodos
}