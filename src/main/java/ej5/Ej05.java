package ej5;

public class Ej05 {
    public static void main(String[] args) {
        /*
        5.- En un nuevo proyecto, llamado Tema2+tunombre, crea una nueva clase llamada Ej05, que contenga una llamada al método public static void main(String[] args). La aplicación Java contendrá comentarios descriptivos del código y realiza lo siguiente:
	    a.- Declara una variable primitiva de cada uno de los tipos estudiados.
	    b.- Declara una constante numérica de tipo double y otra de tipo int. Presta especial atención a la hora de poner el nombre de estas constantes y usa el modificador final.
	    c.- Declara un objeto String.
	    d.- Inicializa las variables, la constante y el objeto con literales de tu elección.
	    e.- Muestra en pantalla cada una de las variables, constantes y objetos anteriores, en distintas líneas y especificando el tamaño que ocupan en memoria, según la tabla que hay en los apuntes (paǵ 7).

         */
        // APARTADO A

        // int para números enteros
        int entero;

        // double para números con decimales
        double decimalDouble;

        // float para números con decimales
        float decimalFloat;

        //char para caracteres
        char caracter;

        // boolean para valores lógicos true or false
        boolean verdaderoFalso;

        // byte para números enteros
        byte enteroByte;

        // short para números enteros
        short enteroShort;

        // long para números enteros
        long enteroLong;

        // APARTADO B

        // constante númerica int
        final int CONSTANTEINT;

        // constante númerica double
        final double CONSTANTEDOUBLE;

        // APARTADO C

        // variable String que guarda cadenas de texto
        String palabra = "hola";

        // APARTADO D

        entero = 1;

        decimalDouble = 1.5;

        decimalFloat = 3.5f;// la f es para que se sepa que es un float

        caracter = 'a';

        verdaderoFalso = true;

        enteroByte = 3;

        enteroShort = 19;

        enteroLong = 1518L;

        CONSTANTEINT = 10;

        CONSTANTEDOUBLE = 35.3;

        // APARTADO E

        System.out.println("Int: " + entero + ", ocupa 32 bits" +
                "\nDouble: " + decimalDouble + ", ocupa 64 bits" +
                "\nFloat: " + decimalFloat + ", ocupa 32 bits" +
                "\nChar: " + caracter + ", ocupa 16 bits" +
                "\nBoolean " + verdaderoFalso + ", ocupa 1 bit" +
                "\nByte " + enteroByte + ", ocupa 8 bits" +
                "\nShort " + enteroShort + ", ocupa 16 bits" +
                "\nLong " + enteroLong + ", ocupa 64 bits" +
                "\nConstante int " + CONSTANTEINT +
                "\nConstante double " + CONSTANTEDOUBLE +
                "\nString " + palabra
                );
    }
}
