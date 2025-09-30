package Bicicleteria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tienda{
    private List<Rodado> rodados;
    private List<Alquiler> alquileres;

    public Tienda() {
        this.rodados = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    public List<Rodado> getRodados() { return rodados; }
    public void setRodados(List<Rodado> rodados) { this.rodados = rodados; }

    public List<Alquiler> getAlquileres() { return alquileres; }
    public void setAlquileres(List<Alquiler> alquileres) { this.alquileres = alquileres; }

    // Agregar rodado
    public void agregarRodado(Rodado rodado) {
        rodados.add(rodado);
        System.out.println("Rodado agregado exitosamente con ID: " + rodado.getId());
    }

    // Quitar rodado por ID
    public void quitarRodado(int idRodado) {
        Rodado rodado = buscarRodadoPorId(idRodado);
        if (rodado == null) {
            System.out.println("Error: Rodado no encontrado.");
            return;
        }
        if (rodado.getEstaAlquilado()) {
            System.out.println("Error: No se puede quitar un rodado que está alquilado.");
            return;
        }
        rodados.remove(rodado);
        System.out.println("Rodado eliminado exitosamente.");
    }

    // Ver todos los rodados
    public void verRodados() {
        if (rodados.isEmpty()) {
            System.out.println("No hay rodados registrados.");
            return;
        }
        System.out.println("\n========== LISTA DE RODADOS ==========");
        for (Rodado r : rodados) {
            System.out.println(r);
        }
        System.out.println("======================================");
    }

    // Alquilar rodado
    public void alquilarRodado(int idRodado, LocalDate fechaAlquiler) {
        Rodado rodado = buscarRodadoPorId(idRodado);
        if (rodado == null) {
            System.out.println("Error: Rodado no encontrado.");
            return;
        }
        if (rodado.getEstaAlquilado()) {
            System.out.println("Error: El rodado ya está alquilado.");
            return;
        }

        rodado.alquilar();
        Alquiler alquiler = new Alquiler(fechaAlquiler, rodado);
        alquileres.add(alquiler);
        System.out.println("Alquiler registrado para la fecha: " + fechaAlquiler);
    }

    // Devolver rodado
    public void devolverRodado(int idRodado, LocalDate fechaDevolucion) {
        Rodado rodado = buscarRodadoPorId(idRodado);
        if (rodado == null) {
            System.out.println("Error: Rodado no encontrado.");
            return;
        }
        if (!rodado.getEstaAlquilado()) {
            System.out.println("Error: El rodado no está alquilado.");
            return;
        }

        Alquiler alquilerActivo = buscarAlquilerActivoPorRodadoId(idRodado);
        if (alquilerActivo == null) {
            System.out.println("Error: No se encontró un alquiler activo para este rodado.");
            return;
        }

        alquilerActivo.finalizarAlquiler(fechaDevolucion);
        rodado.devolver();

        System.out.print("\nRodado devuelto exitosamente.\n");
        System.out.printf("Días alquilados: %d\n", alquilerActivo.getDiasAlquilados());
        System.out.printf("Costo total: $%.2f\n", alquilerActivo.getCostoTotal());
    }

    // Ver todos los alquileres
    public void verAlquileres() {
        if (alquileres.isEmpty()) {
            System.out.println("No hay alquileres registrados.");
            return;
        }
        System.out.println("\n========== HISTORIAL DE ALQUILERES ==========");
        for (Alquiler a : alquileres) {
            System.out.println(a);
        }
        System.out.println("=============================================");
    }

    // Buscar rodado por ID
    public Rodado buscarRodadoPorId(int idRodado) {
        for (Rodado r : rodados) {
            if (r.getId() == idRodado) {
                return r;
            }
        }
        return null;
    }

    // Buscar alquiler activo por ID de rodado
    private Alquiler buscarAlquilerActivoPorRodadoId(int idRodado) {
        for (Alquiler a : alquileres) {
            if (a.getRodado().getId() == idRodado && a.estaActivo()) {
                return a;
            }
        }
        return null;
    }
}
