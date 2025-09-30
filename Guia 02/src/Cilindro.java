public class Cilindro extends Circulo{
    private double altura = 1.0;

    public Cilindro() {
        System.out.println("Constructor Cilindro() -> radio=" + radio + "altura=" + altura +", color=" + color);
    }

    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
        System.out.println("Dentro del constructor de Cilindro. radio(inherido)=" + this.radio + ", altura=" + this.altura);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularvolumen(){
        return Math.PI * Math.pow(radio,2) * altura;
    }
    public double calcularAreaBase(){
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * Math.pow(radio, 2) + 2 * Math.PI * radio * altura;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura=" + altura +
                ", radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}
