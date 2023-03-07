
import javax.swing.JOptionPane;
/*
 *Haz una aplicación que calcule el área de un círculo(pi*R2). 
  El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). 
  Usa la constante PI y el método pow de Math.
 */

/**
 *
 * @author esteban
 */
public class ejercicioP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //usando JOptionPane
        String texto = JOptionPane.showInputDialog("Introduce un radio");
        double radio = Double.parseDouble(texto);
        /*
        usando Scanner
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el valor del radio");
        radio = leer.nextDouble();
        */
        System.out.println("el area del circulo es: "+Math.pow(radio,2));
    }
    
}
