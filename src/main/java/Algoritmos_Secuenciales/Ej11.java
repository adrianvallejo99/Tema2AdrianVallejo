package Algoritmos_Secuenciales;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        /*
        Realiza un programa para calcular la distancia entre dos puntos en un plano cartesiano,
        a partir de las coordenadas de los mismos. Utiliza el teorema de Pitágoras
         */
        // √(x2 - x1)² + (y2 - y1)²

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce coordenadas x punto 1:");
        int x1 = teclado.nextInt();
        System.out.println("Introduce coordenadas y punto 1:");
        int y1 = teclado.nextInt();
        System.out.println("Introduce coordenadas x punto 2:");
        int x2 = teclado.nextInt();
        System.out.println("Introduce coordenadas y punto 2:");
        int y2 = teclado.nextInt();

        double distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2));
        System.out.println("La distancia es: " + distancia);
    }
}
