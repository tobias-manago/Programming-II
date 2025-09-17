import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bienvenido al sistema de gestion de empleados");
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Agregar empleado tiempo completo");
            System.out.println("2. Agregar empleado por hora");
            System.out.println("3. Agregar empleado contratista");
            System.out.println("0. Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombreTC = scanner.nextLine();
                    System.out.println("Ingrese el salario del empleado:");
                    double salarioTC = scanner.nextDouble();
                    System.out.println("Ingrese los dias trabajados del empleado:");
                    int diasTrabajados = scanner.nextInt();
                    EmpleadoTC empleadoTC = new EmpleadoTC(nombreTC, salarioTC, diasTrabajados);
                    System.out.println("El salario del empleado " + empleadoTC.getNombre() + " es: " + empleadoTC.calcularSalario());
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombrePH = scanner.nextLine();
                    System.out.println("Ingrese el salario por hora del empleado:");
                    double salarioPH = scanner.nextDouble();
                    System.out.println("Ingrese las horas trabajadas del empleado:");
                    int horasTrabajadas = scanner.nextInt();
                    EmpleadoPH empleadoPH = new EmpleadoPH(nombrePH, salarioPH, horasTrabajadas);
                    System.out.println("El salario del empleado " + empleadoPH.getNombre() + " es: " + empleadoPH.calcularSalario());
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombreC = scanner.nextLine();
                    System.out.println("Ingrese el salario por hora del empleado:");
                    double salarioC = scanner.nextDouble();
                    System.out.println("Ingrese las horas trabajadas del empleado:");
                    int horasTrabajadasC = scanner.nextInt();
                    System.out.println("Ingrese la tarifa por proyecto del empleado:");
                    double tarifaPorProyecto = scanner.nextDouble();
                    EmpleadoContratista empleadoC = new EmpleadoContratista(nombreC, salarioC, horasTrabajadasC, tarifaPorProyecto);
                    System.out.println("El salario del empleado " + empleadoC.getNombre() + " es: " + empleadoC.calcularSalario());
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 0);
        */
        int opcion1;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de gestion de Libros");
        do {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Agregar Autor");
            System.out.println("2. Agregar Libro y su Autor");
            System.out.println("3.agregar Libro a autor existente");
            System.out.println("0. Salir");
            opcion1 = scanner1.nextInt();
            switch (opcion1) {
                case 1:
                    scanner1.nextLine();
                    System.out.println("Ingrese el nombre del autor:");
                    String nombreAutor = scanner1.nextLine();
                    System.out.println("Ingrese el apellido del autor:");
                    String ApellidoAutor = scanner1.nextLine();
                    System.out.println("Ingrese el email del autor:");
                    String EmailAutor = scanner1.nextLine();
                    System.out.println("Ingrese el genero del autor (M/F):");
                    String GeneroAutor = scanner1.nextLine();
                    Autor autor = new Autor(nombreAutor, ApellidoAutor, EmailAutor,GeneroAutor);
                    System.out.println("Autor agregado: Nombre " + autor.getNombre() + " Apellido: " + autor.getApellido() + " email: " + autor.getEmail() + " sexo: " + (autor.getGenero().equals("M") ? "Hombre" : "Mujer"));
                    break;
                case 2:
                    scanner1.nextLine();
                    System.out.println("Ingrese el nombre del autor:");
                    String nombreAutorL = scanner1.nextLine();
                    System.out.println("Ingrese el apellido del autor:");
                    String ApellidoAutorL = scanner1.nextLine();
                    System.out.println("Ingrese el email del autor:");
                    String EmailAutorL = scanner1.nextLine();
                    System.out.println("Ingrese el genero del autor (M/F):");
                    String GeneroAutorL = scanner1.nextLine();
                    System.out.println("Ingrese el titulo del libro:");
                    String tituloLibro = scanner1.nextLine();
                    System.out.println("Ingrese el precio del libro:");
                    double precioLibro = scanner1.nextDouble();
                    System.out.println("Ingrese el stock del libro:");
                    int stockLibro = scanner1.nextInt();
                    Libro libro = new Libro(nombreAutorL, ApellidoAutorL, EmailAutorL, tituloLibro, GeneroAutorL, precioLibro, stockLibro);
                    System.out.println("Libro agregado: Titulo " + libro.getTitulo() + " Autor: " + libro.getNombre() + " " + libro.getApellido() + " email: " + libro.getEmail() + " precio: " + libro.getPrecio() + " stock: " + libro.getStock());
                    break;
                case 3:

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while (opcion1 != 0);
    }
}