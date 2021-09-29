package Algoritmos_Secuenciales;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        /*
        Leer dos números por teclado, a y b. Imprimir por pantalla el resultado de las siguientes operaciones:
        a/b
        a mod b
         */
        // Iniciamos objeto Scanner
        Scanner teclado = new Scanner(System.in);
        // Pedimos por teclado las dos variables
        System.out.println("Introduce un número");
        int a = teclado.nextInt();
        System.out.println("Introduce otro número");
        int b = teclado.nextInt();

        // Mostramos el resultado de las operaciones
        System.out.println("Operacion a/b: " + (a / b));
        System.out.println("Operacion a%b: " + (a % b));
    }
}
