
import java.util.Scanner;


/*
 
 */

/**
 *
 * @author esteban
 */
public class ejercicio5 {

    /**
     * 1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, 
     * división y módulo (resto de la división).
     * @param args
     */
    public static void main(String[] args) {
        int numero;
        Scanner leernum = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = leernum.nextInt();
        int numero1;
        Scanner leernum1 = new Scanner(System.in);
        System.out.println("ingrese otro numero");
        numero1 = leernum1.nextInt();
        System.out.println("suma "+ (numero + numero1)+"\nresta "+(numero-numero1)+"\nmultiplicacion "+(numero*numero1)+"\ndivision "+(numero/numero1));
    }
}