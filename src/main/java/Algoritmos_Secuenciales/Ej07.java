package Algoritmos_Secuenciales;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        /*
        Un productor de leche lleva el registro de lo que produce en litros, pero cuando entrega la leche en la
        distribuidora le pagan según los galones entregados (1 galón son 3,78 litros). Escribe un programa que
        ayude al productor a saber cuánto recibirá por la entrega de su producción de un día, sabiendo que el
        precio del galón es 1.20€.
         */
        // Iniciamos objeto Scanner
        Scanner teclado = new Scanner(System.in);
        // Iniciamos variable final GALON, cantidad de litros por Galon
        final double GALON = 3.78;
        // Iniciamos variable PRECIO, precio por galon
        final double PRECIO = 1.2;
        // Pedimos por teclado la cantidad de litros
        System.out.println("Introduce la cantidad de litros");
        double litros = teclado.nextDouble();

        // Calculamos la ganancia
        double ganancias = (litros / GALON) * PRECIO;

        // Mostramos por pantalla las ganancias
        System.out.println("Recibirá " + ganancias + " euros");
    }
}
