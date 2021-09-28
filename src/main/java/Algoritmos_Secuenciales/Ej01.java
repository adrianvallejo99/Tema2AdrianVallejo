package Algoritmos_Secuenciales;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        // Valor euro - rupias: 86,59
        // Iniciamos objeto Scanner
        Scanner teclado = new Scanner(System.in);
        // Pedimos el importe de euros y guardamos en variable double
        System.out.println("Cambio de Euros a Rupías Indias. \nIntroduce el importe de euros");
        double euros = teclado.nextDouble();
        // Declaramos e inicializamos variable constante double para el cambio de euros a rupías
        final double VALOR = 86.59;
        // Guardamos en otra variable el valor total del cambio de euros a rupías
        double cambio = euros*VALOR;
        // Mostramos por pantalla el cambio
        System.out.println("El cambio de: " + euros + " euros a Rupías Indias es de: + " + cambio + " Rupías");
    }
}
