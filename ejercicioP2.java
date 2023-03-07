
import java.util.Scanner;

/*
 Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos.
 Si son iguales indicarlo también.
 Ve cambiando los valores para comprobar que funciona.
 */

/**
 *
 * @author esteban
 */
public class ejercicioP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float numero1,numero2;
        Scanner leer1 = new Scanner(System.in);
        System.out.println("ingrese un numero para ser evaluado");
        numero1 = leer1.nextFloat();
        Scanner leer2 = new Scanner(System.in);
        System.out.println("ingrese otro numero para se evaluado");
        numero2 = leer2.nextFloat();
        
        if (numero1 > numero2){
            System.out.println("el numero "+numero1+" es mayor al numero "+numero2);
        }else if (numero1 == numero2){
            System.out.println("ambos numero son iguales "+numero2);
        }else{
            System.out.println("el numero "+numero2+" es mayor al numero "+numero1);
        }
        
    }
    
}
