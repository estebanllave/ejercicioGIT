import javax.swing.JOptionPane;
/*
Realiza una aplicación que nos pida un número de ventas a introducir,
después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 */

/**
 *
 * @author esteban
 */
public class ejercicioP13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float total = 0;
        String ventas = JOptionPane.showInputDialog("ingrese cantidad de ventas");
        int cantidad = Integer.parseInt(ventas);
        for(int i = 1; i <= cantidad ; i++){
            String diaria = JOptionPane.showInputDialog("ingrese el palor de la venta "+i);
            float precio = Float.parseFloat(diaria);
             total = precio + total;
            
        }
                 JOptionPane.showMessageDialog(null, "EL TOTAL DE VENTAS ES :"+ total);
    }
    
}
