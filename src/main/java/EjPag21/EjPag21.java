package EjPag21;

import java.util.Scanner;

public class EjPag21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Como te llamas?");
        String nombre = teclado.nextLine();

        System.out.println("Que día naciste?");
        int dia = teclado.nextInt();

        System.out.println("En que mes?");
        int mes = teclado.nextInt();

        System.out.println("De que año?");
        int año = teclado.nextInt();

        System.out.println("Hola " + nombre + " naciste el " + dia + "/" + mes + "/" + año);
    }
}
