
import java.util.Scanner;

/*
 *  Lee un número por teclado que pida el precio de un producto (puede tener decimales) y 
    calcule el precio final con IVA. El IVA sera una constante que sera del 21%
 */

/**
 *
 * @author esteban
 */
public class ejercicioP9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un importe para sacar el IVA");
        numero = leer.nextFloat();
        System.out.println("el Impuesto al Valor Agregado es de: "+(numero*0.21)+"\n"+ "el total sera: "+ (numero+(numero*0.21) ) );
        
    }
    
}
