
import java.util.Scanner;

/*
Realiza un programa que calcule la potencia de un número, dado este y su exponente. 
Pueden ocurrir tres casos:
* El exponente sea positivo: imprime resultado en pantalla.
* El exponente sea 0, el resultado es 1.
* El exponente sea negativo, el resultado es 1/potencia con el exponente positivo.
 */

/**
 *
 * @author esteban
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        float exponente;
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        numero = leer.nextInt();
        Scanner leerp = new Scanner(System.in);
        System.out.println("INGRESE EXPONENTE");
        exponente = leerp.nextFloat();
        if (exponente > 0){
            int n = 1;
            do{
                n = n + 1;
                numero = numero * numero;  
            }
            while (n <= exponente-1);
            System.out.println("como el exponente es "+exponente+"el resultado es: "+numero);
        }else if (exponente == 0){
           numero = 1;
            System.out.println("como el exponente es '0' el resultado es: "+numero); 
        }else if (exponente < 0){
            exponente = exponente*-1;
            int a = 13
                    ;
            do{
                a = a + 1;
                numero = numero * numero;  
            }
            while (a <= exponente-1);
            System.out.println("como el exponente es -"+exponente+" el resultado es 1/"+numero);
        }
    }
    
}
