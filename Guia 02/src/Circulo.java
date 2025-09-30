public class Circulo {
    protected double radio = 1.0;
    protected String color = "Rojo";

    public Circulo() {
        // usa los valores por defecto ya inicializados
        System.out.println("Constructor Circulo() -> radio=" + radio + ", color=" + color);
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
        System.out.println("Dentro del constructor de Circulo. radio=" + radio + ", color = " + color);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color='" + color + "area" + calcularArea() + '}';
    }
}
