package Bicicleteria;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private double precioPorDia;
    private int diasAlquilados;
    private double costoTotal;
    private Rodado rodado;

    public Alquiler(LocalDate fechaAlquiler, Rodado rodado) {
        if (fechaAlquiler == null || rodado == null) throw new IllegalArgumentException("Parámetros inválidos");
        this.fechaAlquiler = fechaAlquiler;
        this.precioPorDia = rodado.getPrecioPorDia();
        this.diasAlquilados = 0;
        this.costoTotal = 0.0;
        this.rodado = rodado;
    }
    //constructor

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public int getDiasAlquilados() {
        return diasAlquilados;
    }

    public void setDiasAlquilados(int diasAlquilados) {
        this.diasAlquilados = diasAlquilados;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public Rodado getRodado() {
        return rodado;
    }

    public void setRodado(Rodado rodado) {
        this.rodado = rodado;
    }

    //getters y setters
    public void finalizarAlquiler(LocalDate fechaDevolucion) {
        if (fechaDevolucion == null || fechaDevolucion.isBefore(fechaAlquiler)) {
            throw new IllegalArgumentException("La fecha de devolución no puede ser anterior a la de alquiler");
        }
        this.fechaDevolucion = fechaDevolucion;
        this.diasAlquilados = (int) java.time.temporal.ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        if (this.diasAlquilados <= 0) this.diasAlquilados = 1; // Mínimo 1 día
        this.costoTotal = this.diasAlquilados * this.precioPorDia;
    }

    public boolean estaActivo() {
        return fechaDevolucion == null;
    }

    @Override
    public String toString() {
        if (estaActivo()) {
            return String.format("Alquiler ACTIVO | Rodado ID: %s | Fecha: %s | Precio/día: $%.2f",
                    rodado.getId(), fechaAlquiler, precioPorDia);
        } else {
            return String.format("Alquiler FINALIZADO | Rodado ID: %s | Inicio: %s | Fin: %s | Días: %d | Total: $%.2f",
                    rodado.getId(), fechaAlquiler, fechaDevolucion, diasAlquilados, costoTotal);
        }
        //metodos
    }
}
