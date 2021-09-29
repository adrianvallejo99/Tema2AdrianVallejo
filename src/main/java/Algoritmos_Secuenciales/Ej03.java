package Algoritmos_Secuenciales;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        // Iniciamos objeto Scanner
        Scanner teclado = new Scanner(System.in);
        // Pedimos los tres números por teclado y lo guardamos en variables
        System.out.println("Introduce una nota:");
        double nota1 = teclado.nextDouble();
        System.out.println("Introduce una segunda nota:");
        double nota2 = teclado.nextDouble();
        System.out.println("Introduce una tercera nota:");
        double nota3 = teclado.nextDouble();
        // Calculamos la media de las notas
        double media = (nota1 + nota2 + nota3) / 3;
        // Mostramos por pantalla el resultado
        System.out.println("La media de las notas es: " + media);
    }
}
