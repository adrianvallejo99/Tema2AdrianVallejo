package Ej14;

import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        /*
            Crea una nueva clase llamada Ej14, que contenga una llamada al método public static void main(String[] args).
             El programa tendrá una variable entera tiempo inicializada con un valor leído por teclado, en segundos, y
             queremos conocer este tiempo pero expresado en horas, minutos y segundos, mostrando los resultados por
             pantalla.
         */
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los segundos: ");
        int tiempo = teclado.nextInt();

        int horas = tiempo/3600;
        int minutos = (tiempo-(3600*horas))/60;
        int segundos = tiempo-((horas*3600)+(minutos*60));

        System.out.println(tiempo + " segundos, la hora es: " + horas + ":" + minutos + ":" + segundos);

    }
}
