import javax.swing.JOptionPane;
/*
 Escribe una aplicación con un String que contenga una contraseña cualquiera.
 Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas 
 la contraseña y mostrara un mensaje diciendo «Enhorabuena». Piensa bien en la condición de salida 
 (3 intentos y si acierta sale, aunque le queden intentos).
 */

/**
 *
 * @author esteban
 */
public class ejercicioP16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cons = "carlos";
        String contraseña;
        
        
        int c = 0;
        do{
            c = c+1;
            contraseña = JOptionPane.showInputDialog("Ingrese su contraseña");
            if (contraseña.equals(cons)){
                JOptionPane.showMessageDialog(null,"«Enhorabuena»");
                break;
            }else if(c <= 3) {
                JOptionPane.showMessageDialog(null, "vuelva a intentar contraseña incorrecta");
            }
        
            
        }
        while (c < 3);
        if (c == 3){
            JOptionPane.showMessageDialog(null, "CONTRASEÑA BLOQUEADA!");
        }
    }
    
}
