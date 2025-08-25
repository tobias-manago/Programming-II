import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        //punto 1
        Empleado empleado1 = new Empleado(23456345,"Carlos","Gutiérrez",25000);
        Empleado empleado2 = new Empleado(34234123,"Ana","Sánchez",27500);
        empleado1.MostrarDatosEmpleado();
        empleado2.MostrarDatosEmpleado();
        empleado1.aumentarSalario(15);
        empleado1.MostrarDatosEmpleado();

        //punto 2
        Banco banco1 = new Banco(47,"Tobias",15000);
        banco1.depositar(2500);
        banco1.sustraccion(1500);
        banco1.sustraccion(30000);
        banco1.mostrarDatosBanco();


        //punto 3
        Libro libro1 = new Libro("El Quijote","Miguel de Cervantes",500,10);
        Libro libro2 = new Libro("Cien años de soledad","Gabriel García Márquez",700,5);
        libro1.mostrarDatosLibro();
        libro2.mostrarDatosLibro();
        libro1.vender(3);
        libro1.mostrarDatosLibro();
        libro2.vender(8);
        libro2.comprar(5);
        libro2.mostrarDatosLibro();
        */

        //punto 4
        int elegir;
        boolean ToF = false;
        Scanner scanner = new Scanner(System.in);
        ItemVenta item1 = new ItemVenta();

        do {

            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Ingresar datos del item de venta");
            System.out.println("2. Mostrar detalles del item de venta");
            System.out.println("3. Actualizar cantidad del item de venta");
            System.out.println("4. Actualizar precio unitario del item de venta");
            System.out.println("5. Calcular precio total del item de venta");
            System.out.println("0. Salir");

            elegir = scanner.nextInt();
            switch (elegir) {
                case 1:
                    System.out.println("ingrese los datos del item de venta:");
                    System.out.println("Identificador: ");
                    int identificador = scanner.nextInt();
                    System.out.println("Descripcion: ");
                    String descripcion = scanner.next();
                    System.out.println("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    System.out.println("Precio unitario: ");
                    double precioUnitario = scanner.nextDouble();
                    item1.setIdentificador(identificador);
                    item1.setDescripcion(descripcion);
                    item1.setCantidad(cantidad);
                    item1.setPrecioUnitario(precioUnitario);
                    System.out.println("Datos ingresados correctamente.");
                    ToF = true;
                    break;
                case 2:
                    if (ToF == true) {
                    item1.mostrarDatosItemVenta();
                    } else {
                        System.out.println("No se han ingresado datos del item de venta.");
                    }
                    break;
                case 3:
                    if (ToF == true) {
                    System.out.println("Ingrese la nueva cantidad:");
                    int nuevaCantidad = scanner.nextInt();
                    item1.setCantidad(nuevaCantidad);
                    System.out.println("Cantidad actualizada.");
                    } else {
                        System.out.println("No se han ingresado datos del item de venta.");
                    }
                    break;
                case 4:
                    if (ToF == true) {
                    System.out.println("Ingrese el nuevo precio unitario:");
                    double nuevoPrecio = scanner.nextDouble();
                    item1.setPrecioUnitario(nuevoPrecio);
                    System.out.println("Precio unitario actualizado.");
                    } else {
                        System.out.println("No se han ingresado datos del item de venta.");
                    }
                    break;
                case 5:
                    if (ToF == true) {
                    double precioTotal = item1.calcularPrecioTotal();
                    System.out.println("El precio total del item de venta es: " + precioTotal);
                    } else {
                        System.out.println("No se han ingresado datos del item de venta.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        }while (elegir!=0);
        scanner.close();

        //punto 5
    }
}