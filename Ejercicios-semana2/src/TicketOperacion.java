import java.util.Scanner;

public class TicketOperacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Leer datos
            System.out.print("Ingrese nombre del cliente: ");
            String nombreCliente = scanner.nextLine();
            System.out.print("Ingrese número de cuenta: ");
            String numeroCuenta = scanner.nextLine();
            System.out.print("Ingrese monto de la operación: ");
            double monto = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            // Leer el tipo de operación
            System.out.print("Ingrese el número de la operación (1 para depósito, 2 para retiro): ");
            int tipoOperacionNumero = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            // Determinar tipo de operación
            String tipoOperacion;
            if (tipoOperacionNumero == 1) {
                tipoOperacion = "depósito";
            } else if (tipoOperacionNumero == 2) {
                tipoOperacion = "retiro";
            } else {
                tipoOperacion = "desconocida";
            }

            // Imprimir ticket
            System.out.println("\n--- TICKET DE OPERACIÓN ---");
            System.out.println("Nombre del Cliente: " + nombreCliente.toUpperCase());
            System.out.println("Número de Cuenta: " + numeroCuenta);
            System.out.println("Monto de la Operación: $" + monto);
            System.out.println("Tipo de Operación: " + tipoOperacion.toLowerCase());
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}

