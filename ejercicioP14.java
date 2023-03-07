
import java.util.Scanner;

/*
 Realiza una aplicación que nos calcule una ecuación de segundo grado. 
 Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante 
 operación en la raíz cuadrada). Para la raíz cuadrada usa el método sqlrt de Math. 
 Te recomiendo que uses mensajes de traza.
 */

/**
 *
 * @author esteban
 */
public class ejercicioP14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leera = new Scanner(System.in);
        System.out.println("Ingrese a");
        int a = leera.nextInt();
        Scanner leerb = new Scanner(System.in);
        System.out.println("ingrese b");
        int b = leerb.nextInt();
        Scanner leerc = new Scanner(System.in);
        System.out.println("ingrese c");
        int c = leerc.nextInt();
        double discriminante = Math.pow(b, 2)-(4*a*c);
        // MENSAJE DE TRAZA
        System.out.println(">>"+discriminante);
        if (discriminante>0){
            //RECORDAR EN TENER LA PRIORIDAD DEL ELEMENTO
            double x1 = b*(-1)+Math.sqrt(discriminante)/2*a;
            double x2 = b*(-1)-Math.sqrt(discriminante)/2*a;
            System.out.println("El valor de x1 es "+x1+" y el valor de x1 es "+x2);
        }else{
            System.out.println("El discriminante es Negativo");
        }
        
        
    }
    
}
