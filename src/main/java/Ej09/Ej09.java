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
        boolean aMenorB;
        boolean aMayorB;
        boolean aIgualB;
        boolean aDistintoB;

        // APARTADO C
        // Inicializamos las variables booleanas con operaciones de comparación entre dos variables enteras
        aMenorB = a < b; // a menor que b
        aMayorB = a > b; // a mayor que b
        aIgualB = a == b; // a igual que b
        aDistintoB = a != b; // a distinto que b

        // APARTADO D
        // Mostramos por pantalla las variables booleanas
        System.out.println("Comparador a<b: " + aMenorB +
                "\nComparador a>b: " + aMayorB +
                "\nComparador a==b: " + aIgualB +
                "\nComparador a!=b: " + aDistintoB);
    }
}
