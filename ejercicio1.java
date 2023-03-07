
import java.util.Scanner;

/*
 Programa que lea 10 números desde teclado en un proceso repetitivo y muestre la suma.
 Realizar el programa con <<do-while>>
 */

/**
 *
 * @author esteban
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 0;
        int n = 0;
        do{
            n = n + 1;
            Scanner leer = new Scanner(System.in);
            System.out.println("INGRESE UN NUMERO POR FAVOR "+n);
            numero = numero + leer.nextInt();
            
        }
        while (n <= 9);
        System.out.println("la suma de los numeros ingresados es: "+numero+"   "+n);
    }
    
}
