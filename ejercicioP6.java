
//import java.util.Scanner;
import javax.swing.JOptionPane;
/*
 Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
 Si no lo es, también debemos indicarlo.
 */

/**
 *
 * @author esteban
 */
public class ejercicioP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //usando Scanner
        /*
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();
        if (numero % 2 == 0){
            System.out.println(" El numero es divisible por 2");
            
        }else{
            System.out.println("El numero NO es divisible por 2");
        }
        */
        //usando JOption
        String leer = JOptionPane.showInputDialog("ingrese un numero");
        int numero = Integer.parseInt(leer);
        if (numero % 2 == 0){
            System.out.println("El numero es divisible por 2");
        }else{
            System.out.println("el numero NO es divisible por 2");
        }
    }
    
}
