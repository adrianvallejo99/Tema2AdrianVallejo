package Algoritmos_Secuenciales;

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        // 0,00220462
        // Iniciamos objeto Scanner
        Scanner teclado = new Scanner(System.in);
        // Pedimos el importe de gramos y guardamos en variable double
        System.out.println("Cambio de gramos a Libras. \nIntroduce la cantidad de gramos");
        double gramos = teclado.nextDouble();
        // Declaramos e inicializamos variable constante double para el cambio de gramos a libras
        final double CAMBIO = 0.00220462;
        // Guardamos en otra variable el valor total del cambio de gramos a libras
        double resultado = gramos * CAMBIO;
        // Mostramos por pantalla el cambio
        System.out.println("El cambio de: " + gramos + " gramos a Libras es de: " + resultado + " libras");
    }
}
