// Ejercicio 1:
// Pedir nombre, apellido y edad
// imprimir frase con estos 3 datos:
// “Te llamas Pepe Luis Gonzalez y tienes 45 años”

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // A partir de aquí empieza el código principal...

        Scanner teclado = new Scanner(System.in); // Scanner abre la escucha a lo que entre por el teclado.

        System.out.println("Hola, ¿cuál es tu nombre?"); // Salida de información para interactuar con usuario.
        String nombre = teclado.nextLine(); // Se guarda información en variable 'nombre' del tipo 'String' a partir del
                                            // teclado.
        System.out.println("Muy bien " + nombre + ", ¿y cuál es tu apellido?");
        String apellido = teclado.nextLine();
        System.out.println("¿Y qué edad tienes?");
        int edad = teclado.nextInt(); // Se guarda variable tipo Integer.

        teclado.close(); // Cierra la escucha del teclado.
        System.out.println("Entonces te llamas " + nombre + " " + apellido + " y tienes " + edad + " años de edad.");
    }
}
