
import javax.swing.JOptionPane;

/*
 Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. 
 Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».
 Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir 
 (recuerda usar JOptionPane).
 */

/**
 *
 * @author esteban
 */
public class ejercicioP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String nombre = "Esteban";
        //System.out.println("Bien venido "+nombre);
        String nombre;
        nombre = JOptionPane.showInputDialog("ingresa tu nombre");
        JOptionPane.showMessageDialog(null,nombre+ "Bien Venido");
    }
    
}
