package Ej08;

public class Ej08 {
    public static void main(String[] args) {
        /*
        8.- Crea una nueva clase llamada Ej08, que contenga una llamada al método public static void main(String[] args).
            La aplicación Java contendrá comentarios descriptivos del código y realice lo siguiente:
        a.- Declara e inicializa tres variables int (a=10,  b=5, i=0)
        b.- Declara e inicializa dos variables double (c=71.3 y d=4.8)
        c.- Realiza las siguiente operaciones aritméticas a+b, a-b, a*b, a/b, c+d, c-d, c*d, c/d.
            El resultado de cada operación se almacena en una nuevas variables que se crearán para tal efecto.
        d.- Muestra el resultado de cada operación, usando las variables creadas en el paso c).
        e.- También muestra en pantalla los resultados de las siguientes operaciones: a*=3, b-=1, a/=b, c+=d.
        f.- Finalmente, el programa muestra en consola la siguiente información, en distintas instrucciones:
            valor de i, valor de i++, valor de i y valor de ++i.
         */
        // APARTADO A
        // Declaramos e inicializamos variables enteras
        int a = 10;
        int b = 5;
        int i = 0;

        // APARTADO B
        // Declaramos e inicializamos variables double
        double c = 71.3;
        double d = 4.8;

        // APARTADO C
        // Realizamos las operaciones y las guardamos en otras variables
        int sumaAB = a+b;
        int restaAB = a-b;
        int productoAB = a*b;
        int divisionAB = a/b;

        double sumaCD = c+d;
        double restaCD = c-d;
        double productoCD = c*d;
        double divisionCD = c/d;

        // APARTADO D
        // Mostramos por pantalla el resultado de las operaciones guardadas en variables en el apartado anterior
        System.out.println("----APARTADO D----");
        System.out.println("SUMA A+B: " + sumaAB +
                "\nRESTA A-B: " + restaAB +
                "\nPRODUCTO A*B: " + productoAB +
                "\nDIVISION A/B: " + divisionAB +
                "\nSUMA C+D: " + sumaCD +
                "\nRESTA C-D: " + restaCD +
                "\nPRODUCTO C*D: " + productoCD +
                "\nDIVISION C/D: " + divisionCD );

        // APARTADO E
        // Realizamos las operaciones y las guardamos en otras variables
        int apartadoE1 = a*=3;
        int apartadoE2 = b-=1;
        int apartadoE3 = a/=b;
        double apartadoE4 = c+=d;
        // Mostramos por pantalla el resultado de las operaciones
        System.out.println("----APARTADO E----");
        System.out.println("Operación a*=3: " + apartadoE1 +
                "\nOperación b-=1: " + apartadoE2 +
                "\nOperación a/=b: " + apartadoE3 +
                "\nOperación c+=d: " + apartadoE4);

        // APARTADO F
        System.out.println("----APARTADO F----");
        System.out.println("valor de i: " + i);
        System.out.println("valor de i++: " + i++);
        System.out.println("valor de i: " + i);
        System.out.println("valor de ++i: " + ++i);
        /*
        Explicación:
        Al hacer la operación ++ de una variable (++i/i++)

         */
    }
}
