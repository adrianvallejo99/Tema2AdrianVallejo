package Algoritmos_Secuenciales;

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        // Iniciamos objeto Scanner
        Scanner teclado = new Scanner(System.in);
        // Creamos dos variables constantes, una para el precio fijo por transporte y otra para el coste por km
        final int FIJO = 150;
        final double precioKM = 15.3;
        // Pedimos por teclado el número de kilometros
        System.out.println("Introduce el número de km: ");
        double km = teclado.nextDouble();

        // Guardamos en una variable el coste total del servicio
        double costeTotal = 150 + precioKM * km;
        // Mostramos por pantalla el resultado
        System.out.println("Coste total del servicio: " + costeTotal + " euros");
    }
}
