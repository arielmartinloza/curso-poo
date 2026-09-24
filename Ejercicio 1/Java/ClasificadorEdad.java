import java.util.Scanner;

public class ClasificadorEdad {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu edad: ");

        // Validar que el usuario ingrese un número entero
        if (scanner.hasNextInt()) {
            int edad = scanner.nextInt();

            // Verificar que la edad no sea negativa
            if (edad < 0) {
                System.out.println("Por favor, ingresa una edad válida.");
            } else {
                // Clasificar al usuario según los rangos de edad establecidos
                if (edad < 13) {
                    System.out.println("Eres un niño.");
                } else if (edad <= 17) {
                    System.out.println("Eres un adolescente.");
                } else if (edad <= 64) {
                    System.out.println("Eres un adulto.");
                } else {
                    System.out.println("Eres un adulto mayor.");
                }
            }
        } else {
            // Si el usuario no ingresó un número entero
            System.out.println("Error: Debes ingresar un número entero.");
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}
