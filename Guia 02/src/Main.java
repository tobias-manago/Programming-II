import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    if(scanner.nextLine().equalsIgnoreCase("S"))
                    {
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
                    if(scanner.nextLine().equalsIgnoreCase("S"))
                    {
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
                    if(scanner.nextLine().equalsIgnoreCase("S"))
                    {
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
    }
}