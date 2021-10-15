package Ej15;

public class Ej15 {
    public static void main(String[] args) {
        /*
            Indica si el siguiente código funciona o no. En caso afirmativo indica que hace, en caso negativo explica por qué no funciona.
	        a.- 	boolean adivina = ((97 == 'a') && true);
		    System.out.println(adivina);

	        b.- 	int a = 'a';
		    System.out.println(a);

	        c.- 	int pi = 3.14;
		    System.out.println(pi);

		    d.-	double pi = 3,14;
		    System.out.println(pi);

	        e.- 	boolean adivina = (1==4);
		    System.out.println(adivina);
         */

        // Funciona porque en el codigo ASCII, 97 equivale a 'a'
        boolean adivina = ((97 == 'a') && true);
        System.out.println(adivina);

        // Funciona porque en el codigo ASCII, 'a' equivale a 97
        int a = 'a';
        System.out.println(a);

        // No funciona porque está introduciendo un número real a una variable entera
        /*int pi = 3.14;
        System.out.println(pi);*/
        int pi = 3;
        System.out.println(pi);

        // No funciona porque la variable pi ya se ha declarado
        // ademas el numero real es con . 3.14
        /*double pi = 3,14;
        System.out.println(pi);*/
        double pi2 = 3.14;
        System.out.println(pi2);

        // variable adivina ya declarada anteriormente
        /*boolean adivina = (1==4);
        System.out.println(adivina);*/
        adivina = (1==4);
        System.out.println(adivina);
    }
}
