package Ej16;

public class Ej16 {
    public static void main(String[] args) {
        /*
         Evalúa las siguientes expresiones del lenguaje, teniendo en cuenta las siguientes tablas de verdad:
            a) 67>20 && 13>12
            b) 10<=2*5&&3<4||!(8>7)&&3*2<=4*2-1
            c) !(a>b&&2*a<=b), con a = 5 y b = 3
            d) a++/2<b&&(a++/2>b || (a*2<b*4)) con a = 5 y b = 3
            e) b++>3||a+b<=8&&!(a>b) con a = 5 y b = 3
         */

        // APARTADO A
        System.out.println("----APARTADO A----");
        boolean comparador = 67 > 20 && 13 > 12;
        System.out.println("Resultado de 67 > 20 && 13 > 12 = " + comparador);

        // APARTADO B
        System.out.println("----APARTADO B----");
        comparador = 10 <= 2 * 5 && 3 < 4 || !(8 > 7) && 3 * 2 <= 4 * 2 - 1;
        System.out.println("Resultado de 10 <= 2 * 5 && 3 < 4 || !(8 > 7) && 3 * 2 <= 4 * 2 - 1 = " + comparador);

        // APARTADO C
        System.out.println("----APARTADO C----");
        int a = 5, b = 3;
        comparador = !(a > b && 2 * a <= b);
        System.out.println("Resultado de !(a > b && 2 * a <= b) = " + comparador);

        // APARTADO D
        System.out.println("----APARTADO D----");
        comparador = a++ / 2 < b && (a++ / 2 > b || (a * 2 < b * 4));
        System.out.println("Resultado de a++ / 2 < b && (a++ / 2 > b || (a * 2 < b * 4)) = " + comparador);

        // APARTADO E
        System.out.println("----APARTADO E----");
        comparador = b++ > 3 || a + b <= 8 && !(a > b);
        System.out.println("Resultado de b++ > 3 || a + b <= 8 && !(a > b) = " + comparador);
    }
}
