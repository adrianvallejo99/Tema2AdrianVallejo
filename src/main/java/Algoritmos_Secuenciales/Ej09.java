package Algoritmos_Secuenciales;

import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        /*
        Una empresa de juguetes se dedica a realizar cometas como las que figuran en la imagen de la derecha.
        Necesitan saber el área de tela a emplear según las medidas de las diagonales que hay entre
        los puntos A y C, y entre B y D.
         */
        // Iniciamos objeto Scanner
        Scanner teclado = new Scanner(System.in);
        // Pedimos por teclado la distancia entre A y C y B y D
        System.out.println("Distancia entre A y C:");
        double aC = teclado.nextDouble();
        System.out.println("Distancia entre B y D:");
        double bD = teclado.nextDouble();
        // Cálculamos el area de la cometa (DiagonalMayor * DiagonalMenor)/2
        double area = (aC * bD) / 2;
        // Mostramos por pantalla el valor de area
        System.out.println("El area es " + area);

    }
}
