package Algoritmos_Secuenciales;

import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {
        /*
        Realiza un programa que calcule el espacio recorrido, en metros, por un cuerpo que se deplaza a 200 km/h
        si está en movimiento 20 minutos. Realiza otro programa para calcular el espacio recorrido del cuerpo
        en función de su velocidad y tiempo de movimiento.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("----APARTADO A----");
        double distancia = 200 * 20;
        System.out.println("Distancia recorrida a 200km/h en 20 minutos: " + distancia);

        System.out.println("----APARTADO B----");
        System.out.println("Velocidad: ");
        double velocidad = teclado.nextDouble();
        System.out.println("Tiempo: ");
        double tiempo = teclado.nextDouble();
        distancia = velocidad * tiempo;
        System.out.println("Distancia recorrida a " + velocidad + " km/h en " + tiempo + " minutos: " + distancia);
    }
}
