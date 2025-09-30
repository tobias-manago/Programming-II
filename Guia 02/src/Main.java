import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        /*
        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Bienvenido al sistema de gestion de empleados");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Agregar empleado tiempo completo");
            System.out.println("2. Agregar empleado por hora");
            System.out.println("3. Agregar empleado contratista");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("ingrese el nombre del empleado");
                    scanner.nextLine(); // Limpiar el buffer
                    String nombreTC = scanner.nextLine();
                    System.out.println("ingrese el salario por dia del empleado");
                    double salarioTC = scanner.nextDouble();
                    System.out.println("ingrese los dias trabajados");
                    int diasTrabajadosTC = scanner.nextInt();
                    EmpleadoTC empleadoTC = new EmpleadoTC(salarioTC, nombreTC, diasTrabajadosTC);
                    System.out.println("desea mostrar al empleado [S/N]");
                    scanner.nextLine(); // Limpiar el buffer antes de leer la respuesta
                    if (scanner.nextLine().equalsIgnoreCase("S")) {
                        empleadoTC.mostrarEmpleado();
                    }
                    break;
                case 2:
                    System.out.println("ingrese el nombre del empleado");
                    scanner.nextLine(); // Limpiar el buffer
                    String nombrePH = scanner.nextLine();
                    System.out.println("ingrese el salario por hora del empleado");
                    double salarioPH = scanner.nextDouble();
                    System.out.println("ingrese las horas trabajadas");
                    int horasTrabajadasPH = scanner.nextInt();
                    EmpleadoPH empleadoPH = new EmpleadoPH(salarioPH, nombrePH, horasTrabajadasPH);
                    System.out.println("desea mostrar al empleado [S/N]");
                    scanner.nextLine(); // Limpiar el buffer antes de leer la respuesta
                    if (scanner.nextLine().equalsIgnoreCase("S")) {
                        empleadoPH.mostrarEmpleado();
                    }
                    break;
                case 3:
                    System.out.println("ingrese el nombre del empleado");
                    scanner.nextLine(); // Limpiar el buffer
                    String nombreC = scanner.nextLine();
                    System.out.println("ingrese el salario por hora del empleado");
                    double salarioC = scanner.nextDouble();
                    System.out.println("ingrese las horas trabajadas");
                    int horasTrabajadasC = scanner.nextInt();
                    System.out.println("ingrese la tarifa por proyecto");
                    double tarifaPorProyectoC = scanner.nextDouble();
                    EmpleadoContratista empleadoC = new EmpleadoContratista(salarioC, nombreC, horasTrabajadasC, tarifaPorProyectoC);
                    System.out.println("desea mostrar al empleado [S/N]");
                    scanner.nextLine(); // Limpiar el buffer antes de leer la respuesta
                    if (scanner.nextLine().equalsIgnoreCase("S")) {
                        empleadoC.mostrarEmpleado();
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 0);

        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", "M");

        System.out.println(autor);

        Libro libro = new Libro("Effective Java", 450, 100, autor);

        System.out.println(libro);

        libro.setPrecio(500);
        libro.setStock(libro.getStock() + 50);

        Autor autorDelLibro = libro.getAutor();
        System.out.println("Autor del libro: " + autorDelLibro.getNombre() + " " +
                autorDelLibro.getApellido() + " - " +
                autorDelLibro.getEmail() + " (" +
                autorDelLibro.getGenero() + ")");

        libro.imprimirMensajeVenta();
        //-------------------------------------------------------------------------------------------------------------
        Cliente cliente = new Cliente("Juan Pérez", "juan.perez@mail.com", 10.0);
        System.out.println(cliente);

        BigDecimal montoTotal = BigDecimal.valueOf(1000.00);
        Factura factura = new Factura(montoTotal, cliente);

        System.out.println("Monto total (sin descuento): " + factura.getMonto().toPlainString());
        System.out.println("Monto final (con descuento): " + factura.calcularMontoFinal().toPlainString());

        factura.imprimir();
        scanner.close();

        System.out.println("Antes de crear el cilindro");
        Cilindro c = new Cilindro();
        System.out.println("Después de crear el cilindro\n");

        System.out.println("Radio del cilindro: " + c.getRadio());
        System.out.println("Altura del cilindro: " + c.getAltura());
        System.out.println("Área de la base: " + c.calcularAreaBase());
        System.out.println("Volumen: " + c.calcularvolumen());

        System.out.println(c.toString());
        System.out.println("--------------------------------------------------");
        System.out.println("segundo cilindro");
        Cilindro c2 = new Cilindro(6,"oro",12);

        System.out.println("Radio del cilindro: " + c2.getRadio());
        System.out.println("Altura del cilindro: " + c2.getAltura());
        System.out.println("Área de la base: " + c2.calcularAreaBase());
        System.out.println("Volumen: " + c2.calcularvolumen());
        */
        Estudiante estudiante = new Estudiante(47231123,"Tobias","Manago","Tqmanago@gmail.com","Ayolas 6642",2025,80000,"Programacion");
        Estudiante estudiante2 = new Estudiante(47231124,"Juan","Perez","juanpi@gmail.com","magallanes 6919",2024,75000,"Redes");
        Estudiante estudiante3 = new Estudiante(47231125,"Maria","Gonzalez","marigon@gmail.com","san lorenzo 1234",2023,90000,"ingenieria de sistemas");
        Estudiante estudiante4 = new Estudiante(47231126,"Ana","Lopez","anitaMaxWinn@gmail.com","cordoba 5678",2025,85000,"Seguridad Informatica");
    }
}