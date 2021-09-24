package Ej07;

public class Ej07 {
    public static void main(String[] args) {
        /*
        Crea una nueva clase llamada Ej07, que contenga una llamada al método
        public static void main(String[] args). La aplicación Java contendrá
        comentarios descriptivos del código y realiza lo siguiente:
        a.- Declara e inicializa tres variables int en la misma instrucción (a=1, b=2, c=3).
        b.- Declara e inicializa tres variables double en la misma instrucción (d=4.5, e=5.7, f=6.9).
        c.- Muestra las variables en dos líneas, la primera línea mostrará las variables tipo entero
         y la segunda línea mostrará las variables tipo double.
        d.- Realiza los siguiente intercambios de valores: en b guarda c, en c guarda a, en a guarda b.
         Muestra por pantalla el resultado.
        e.- Realiza los siguiente intercambios de valores: en e guarda f, en f guarda d, en d guarda e.
         Muestra por pantalla el resultado.

         */

        // APARTADO A
        // Declaramos e inicializamos las variables a, b y c
        int a = 1, b = 2, c = 3;

        // APARTADO B
        // Declaramos e inicializamos las variables d, e y f
        double d = 4.5, e = 5.7, f = 6.9;

        // APARTADO C
        // Mostramos por pantalla las variables a, b, c, d, e, f
        System.out.println("Variable a: " + a + ", Variable b: " + b + ", Variable c:" + c +
                "\nVariable d: " + d + ", Variable e: " + e + ", Variable f: " + f);

        // APARTADO D
        // Intercambiamos los valores de las variables
        // Declaramos e inicializamos una variable auxiliar para intercambiar los valores
        int auxInt;
        auxInt = b;
        b = c;
        c = a;
        a = auxInt;
        // Imprimimos por pantalla las variables intercambiadas
        System.out.println("Variable a: " + a +
                "\nVariable b: " + b +
                "\nVariable c:" + c);

        // APARTADO E
        // Intercambiamos los valores de las variables
        // Declaramos e inicializamos una variable auxiliar para intercambiar los valores
        double auxDouble;
        auxDouble = e;
        e = f;
        f = d;
        d = auxDouble;
        // Imprimimos por pantalla las variables intercambiadas
        System.out.println("Variable d: " + d +
                "\nVariable e: " + e +
                "\nVariable f:" + f);
    }
}
