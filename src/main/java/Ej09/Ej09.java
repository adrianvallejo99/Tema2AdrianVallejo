package Ej09;

public class Ej09 {
    public static void main(String[] args) {
        /*
        9.- Crea una nueva clase llamada Ej09, que contenga una llamada al método public static void main(String[] args).
            La aplicación Java contendrá comentarios descriptivos del código y realizará lo siguiente:
        a.- Declara e inicializa dos variables int (a=10,  b=20).
        b.- Declara cuatro variables booleanas.
        c.- Guarda, en las variables booleanas, el resultado de realizar las siguientes operaciones relacionales:
            a<b, a>b, a==b, a!=b.
        d.- Muestra en pantalla el resultado de las operaciones, usando las variables booleanas.

         */
        // APARTADO A
        // Declaramos e inicializamos las variables a y b
        int a = 10;
        int b = 20;

        // APARTADO B
        // Declaramos variable booleanas
        boolean comparador1;
        boolean comparador2;
        boolean comparador3;
        boolean comparador4;

        // APARTADO C
        // Inicializamos las variables booleanas con operaciones de comparación entre dos variables enteras
        comparador1 = a<b; // a menor que b
        comparador2 = a>b; // a mayor que b
        comparador3 = a==b; // a igual que b
        comparador4 = a!=b; // a distinto que b

        // APARTADO D
        // Mostramos por pantalla las variables booleanas
        System.out.println("Comparador a<b: " + comparador1 +
                "\nComparador a>b: " + comparador2 +
                "\nComparador a==b: " + comparador3 +
                "\nComparador a!=b: " + comparador4);
    }
}
