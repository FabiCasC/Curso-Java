import java.util.Scanner;

public class BoletoViaje {
    public static void main(String[] args) {
        // Crear una instancia del objeto Scanner
        Scanner scanner = new Scanner(System.in);

        try {
            // Leer datos
            System.out.print("Ingrese nombre del pasajero: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese origen del viaje: ");
            String origen = scanner.nextLine();
            System.out.print("Ingrese destino del viaje: ");
            String destino = scanner.nextLine();
            System.out.print("Ingrese fecha de viaje (DD/MM/AAAA): ");
            String fecha = scanner.nextLine();
            System.out.print("Ingrese número de boleto: ");
            int numeroBoleto = scanner.nextInt();

            // Imprimir boleto
            System.out.println("\n--- BOLETO DE VIAJE INTERPROVINCIAL ---");
            System.out.println("Nombre del Pasajero: " + nombre.toUpperCase());
            System.out.println("Origen: " + origen.toUpperCase());
            System.out.println("Destino: " + destino.toUpperCase());
            System.out.println("Fecha de Viaje: " + fecha);
            System.out.println("Número de Boleto: " + numeroBoleto);
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}



