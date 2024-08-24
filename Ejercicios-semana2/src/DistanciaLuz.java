import java.util.Scanner;

public class DistanciaLuz {

    public static void main(String[] args) {
        // Crear una constante para la velocidad de la luz en metros por segundo
        final long VELOCIDAD_LUZ = 299792458L;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Leer el número de días desde la entrada del usuario
        System.out.print("Introduce el número de días: ");
        int dias = scanner.nextInt();

        // Calcular la distancia recorrida por la luz en N días
        long segundosPorDia = 86400; // 24 x 60 x 60 segundos en un día
        long segundosTotales = dias * segundosPorDia;
        long distancia = VELOCIDAD_LUZ * segundosTotales;

        // Mostrar el resultado utilizando salida con formato
        System.out.printf("La distancia que recorre la luz en %d días es de %,d metros.%n", dias, distancia);
        
        // Cerrar el scanner
        scanner.close();
    }
}

