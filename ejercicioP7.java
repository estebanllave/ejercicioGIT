import javax.swing.JOptionPane;
/*
Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
Por ejemplo: si introduzco un 97, me muestre una a.
 */

/**
 *
 * @author esteban
 */
public class ejercicioP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ){
        String ascii;
        do{
        ascii = JOptionPane.showInputDialog("ingrese un numero para moscrar la tabla ASCII");
        int codigo = Integer.parseInt(ascii);
        char caracter = (char)codigo;
        System.out.println(caracter);
        }
        while (ascii == "x");
    }
}
