package Bicicleteria;

import java.time.LocalDate;
import java.util.Scanner;

class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Tienda tienda = new Tienda();

    public static void main(String[] args) {
        cargarDatosPrueba();

        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    agregarRodado();
                    break;
                case 2:
                    quitarRodado();
                    break;
                case 3:
                    tienda.verRodados();
                    break;
                case 4:
                    alquilarRodado();
                    break;
                case 5:
                    devolverRodado();
                    break;
                case 6:
                    cargarBateria();
                    break;
                case 7:
                    tienda.verAlquileres();
                    break;
                case 8:
                    salir = true;
                    System.out.println("¡Gracias por usar el sistema! Hasta luego.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n╔════════════════════════════════════════╗");
        System.out.println("║  SISTEMA DE ALQUILER DE BICICLETAS     ║");
        System.out.println("╠════════════════════════════════════════╣");
        System.out.println("║ 1. Agregar rodado                      ║");
        System.out.println("║ 2. Quitar rodado                       ║");
        System.out.println("║ 3. Ver rodados                         ║");
        System.out.println("║ 4. Alquilar rodado                     ║");
        System.out.println("║ 5. Devolver rodado                     ║");
        System.out.println("║ 6. Cargar batería                      ║");
        System.out.println("║ 7. Ver alquileres                      ║");
        System.out.println("║ 8. Salir                               ║");
        System.out.println("╚════════════════════════════════════════╝");
    }

    private static void agregarRodado() {
        System.out.println("\n--- AGREGAR RODADO ---");
        System.out.println("Tipo de rodado:");
        System.out.println("1. Bicicleta");
        System.out.println("2. Bicicleta Eléctrica");
        System.out.println("3. Monopatín Eléctrico");
        int tipo = leerEntero("Seleccione: ");

        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();

        System.out.println("Marca (1-BIKE_MAX, 2-BC, 3-ZR): ");
        int marcaOp = leerEntero("");
        Marca marca = marcaOp == 1 ? Marca.BIKE_MAX : marcaOp == 2 ? Marca.BC : Marca.ZR;

        Rodado rodado = null;
        switch (tipo) {
            case 1:
                double rodadoNum = leerEntero("Rodado (pulgadas): ");
                rodado = new Bicicleta(modelo,marca,rodadoNum);
                break;
            case 2:
                int rodadoNum2 = leerEntero("Rodado (pulgadas): ");
                int potencia = leerEntero("Potencia batería (Wh): ");
                rodado = new BicicletaElectrica(modelo,marca,rodadoNum2,potencia);
                break;
            case 3:
                int potencia3 = leerEntero("Potencia batería (Wh): ");
                double altura = leerDouble("Altura (cm): ");
                rodado = new MonopatinElectrico(modelo, marca, potencia3, 100, altura);
                break;
            default:
                System.out.println("Tipo de rodado inválido.");
                return;
        }

        if (rodado != null) {
            tienda.agregarRodado(rodado);
        }
    }

    private static void quitarRodado() {
        System.out.print("ID del rodado a quitar: ");
        int id = scanner.nextInt();
        tienda.quitarRodado(id);
    }

    private static void alquilarRodado() {
        System.out.print("ID del rodado a alquilar: ");
        int id = scanner.nextInt();
        LocalDate fecha = LocalDate.now();
        tienda.alquilarRodado(id, fecha);
    }

    private static void devolverRodado() {
        System.out.print("ID del rodado a devolver: ");
        int id = scanner.nextInt();
        LocalDate fecha = LocalDate.now();
        tienda.devolverRodado(id, fecha);
    }

    private static void cargarBateria() {
        System.out.print("ID del rodado eléctrico: ");
        int id = scanner.nextInt();
        Rodado rodado = tienda.buscarRodadoPorId(id);

        if (rodado == null) {
            System.out.println("Error: Rodado no encontrado.");
            return;
        }

        if (!(rodado instanceof Electrico)) {
            System.out.println("Error: Este rodado no es eléctrico.");
            return;
        }
        ((Electrico) rodado).cargarBateria();
    }

    private static int leerEntero(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Ingrese un número válido: ");
        }
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    private static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.print("Ingrese un número válido: ");
        }
        double num = scanner.nextDouble();
        scanner.nextLine();
        return num;
    }

    private static void cargarDatosPrueba() {
        tienda.agregarRodado(new Bicicleta("Mountain Pro", Marca.BIKE_MAX, 29.0));
        tienda.agregarRodado(new BicicletaElectrica("E-City", Marca.BC, 25.0, 28));
        tienda.agregarRodado(new MonopatinElectrico( "Thunder", Marca.ZR, 10.0, 350, 95.0));
        System.out.println("✓ Datos de prueba cargados correctamente.\n");
    }
}