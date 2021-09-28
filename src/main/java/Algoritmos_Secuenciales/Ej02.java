package Algoritmos_Secuenciales;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        // area = pi * radio²;
        // Iniciamos objeto Scanner
        Scanner teclado = new Scanner(System.in);
        // Pedimos por teclado el radio del circulo
        System.out.println("Introduce el radio de tu circulo:");
        double radio = teclado.nextDouble();
        // Calculamos el area del circulo y la guardamos en otra variable
        double area = Math.PI * radio * radio;
        // Mostramos por pantalla el resultado
        System.out.println("El area de tu círculo es de: " + area);
    }
}
