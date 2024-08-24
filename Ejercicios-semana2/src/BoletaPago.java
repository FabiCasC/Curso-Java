import java.util.Scanner;

public class BoletaPago {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Leer datos
            System.out.print("Ingrese el subtotal: ");
            double subtotal = scanner.nextDouble();
            System.out.print("Ingrese el porcentaje de descuento: ");
            double descuentoPorcentaje = scanner.nextDouble();

            // Calcular descuento y total
            double descuento = (subtotal * descuentoPorcentaje) / 100;
            double total = subtotal - descuento;

            // Imprimir boleta
            System.out.println("\n--- BOLETA DE PAGO ---");
            System.out.println("Subtotal: S/." + subtotal);
            System.out.println("Descuento: S/." + descuento);
            System.out.println("Total a Pagar: S/." + total);
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}


