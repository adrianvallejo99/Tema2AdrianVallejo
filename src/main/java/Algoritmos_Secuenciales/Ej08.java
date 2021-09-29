package Algoritmos_Secuenciales;

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        /*
        Programa que pida el precio de un artículo y calcule su valor aplicando un 16% de IVA.
        Realiza un programa para calcular el valor de cualquier artículo aplicando cualquier IVA.
         */
        // Iniciamos objeto Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("----APARTADO A----");
        // Pedimos por telcado el precio del producto
        System.out.println("Precio del producto: ");
        double precio = teclado.nextDouble();
        // Variable constante IVA
        final int IVA = 16;
        // Calculamos el precio con el porcentaje de iva aplicado
        double precioFinal = precio + (IVA * precio) / 100;
        // Mostramos por pantalla el resultado
        System.out.println("Precio con IVA: " + precioFinal);

        System.out.println("----APARTADO B----");
        // Pedimos por teclado el precio del producto
        System.out.println("Precio del producto");
        double precio2 = teclado.nextDouble();
        // Pedimos por teclado el % de IVA
        System.out.println("% IVA aplicable");
        double ivaAplicable = teclado.nextDouble();
        // Calculamos el precio con el porcentaje de iva aplicado
        double precioFinal2 = precio2 + (ivaAplicable * precio2) / 100;
        // Mostramos por pantalla el resultado
        System.out.println("Precio final: " + precioFinal2);

    }
}
