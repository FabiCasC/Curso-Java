import java.util.Scanner;

public class BoletaVenta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del cliente
        System.out.print("Nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        // Solicitar datos del primer producto
        System.out.print("Nombre del primer producto: ");
        String producto1 = scanner.nextLine();
        System.out.print("Precio del primer producto: ");
        double precio1 = scanner.nextDouble();
        System.out.print("Cantidad comprada del primer producto: ");
        int cantidad1 = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        // Solicitar datos del segundo producto
        System.out.print("Nombre del segundo producto: ");
        String producto2 = scanner.nextLine();
        System.out.print("Precio del segundo producto: ");
        double precio2 = scanner.nextDouble();
        System.out.print("Cantidad comprada del segundo producto: ");
        int cantidad2 = scanner.nextInt();

        // Calcular el subtotal para cada producto
        double subtotal1 = precio1 * cantidad1;
        double subtotal2 = precio2 * cantidad2;

        // Calcular los descuentos por producto basado en la palabra "GAMER"
        double descuentoProducto1 = 0;
        double descuentoProducto2 = 0;
        if (producto1.toUpperCase().contains("GAMER")) {
            descuentoProducto1 = subtotal1 * 0.02;
        }
        if (producto2.toUpperCase().contains("GAMER")) {
            descuentoProducto2 = subtotal2 * 0.02;
        }

        // Calcular el total con descuentos por producto
        double totalConDescuentoProductos = (subtotal1 - descuentoProducto1) + (subtotal2 - descuentoProducto2);

        // Aplicar el descuento total si el cliente es ANA o JUAN
        double descuentoCliente = 0;
        if (nombreCliente.equalsIgnoreCase("ANA") || nombreCliente.equalsIgnoreCase("JUAN")) {
            descuentoCliente = totalConDescuentoProductos * 0.05;
        }

        // Calcular el total final
        double totalFinal = totalConDescuentoProductos - descuentoCliente;

        // Generar la boleta de venta
        System.out.println("\n===== BOLETA DE VENTA =====");
        System.out.printf("Cliente: %s%n", nombreCliente);
        System.out.println("----------------------------");
        System.out.printf("Producto: %s%n", producto1);
        System.out.printf("Precio unitario: S/ %.2f%n", precio1);
        System.out.printf("Cantidad: %d%n", cantidad1);
        System.out.printf("Subtotal: S/ %.2f%n", subtotal1);
        System.out.printf("Descuento aplicado: S/ %.2f%n", descuentoProducto1);
        System.out.printf("Total: S/ %.2f%n", subtotal1 - descuentoProducto1);
        System.out.println("----------------------------");
        System.out.printf("Producto: %s%n", producto2);
        System.out.printf("Precio unitario: S/ %.2f%n", precio2);
        System.out.printf("Cantidad: %d%n", cantidad2);
        System.out.printf("Subtotal: S/ %.2f%n", subtotal2);
        System.out.printf("Descuento aplicado: S/ %.2f%n", descuentoProducto2);
        System.out.printf("Total: S/ %.2f%n", subtotal2 - descuentoProducto2);
        System.out.println("----------------------------");
        System.out.printf("Descuento por cliente: S/ %.2f%n", descuentoCliente);
        System.out.println("----------------------------");
        System.out.printf("TOTAL FINAL: S/ %.2f%n", totalFinal);
        System.out.println("============================");

        // Cerrar el scanner
        scanner.close();
    }
}

