package Ej06;

public class Ej06 {
    public static void main(String[] args) {
        /*
        Crea una nueva clase llamada Ej06, que contenga una llamada al método
        public static void main(String[] args). La aplicación Java contendrá
        comentarios descriptivos del código e intercambiará los valores de
        dos variables de tipo entero, haciendo uso de una tercera variable auxiliar.
        Antes de intercambiar los valores, debes declarar e inicializar las variables
        con los valores que tú quieras. Muestra los valores de las variables
        antes de intercambiar sus valores y después del intercambio.
         */

        // Declaramos e inicializamos las variables a y b
        int a = 10;
        int b = 20;
        // Declaramos la variable auxiliar
        int aux;
        // Imprimimos por pantalla el valor de las variables a y b
        System.out.println("Variables iniciales");
        System.out.println("Variable a: " + a +
                "\nVariable b: " + b );

        // Con ayuda de la variable auxiliar, intercambiamos el valor de a y b
        aux = a;
        a = b;
        b = aux;

        // Imprimimos por pantalla el valor de las variables a y b intercambiados.
        System.out.println("Variables intercambiadas");
        System.out.println("Variable a: " + a +
                "\nVariable b: " + b );
    }
}
