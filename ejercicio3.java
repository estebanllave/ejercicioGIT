

import javax.swing.JOptionPane;

/*
Ejercicio 1. Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio 
del 1 al 100. A continuación va pidiendo números y va respondiendo si el número a adivinar es mayor o 
menor que el introducido, a demás de los intentos que te quedan (tienes 10 intentos para acertarlo). 
El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), 
si se llega al limite de intentos te muestra el número que había generado.
 */

/**
 *
 * @author esteban
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //al crear el numero aleatorio el 10 marca el numero maximo y el 1 el numero minimo
        int aleatorio = (int) (Math.random()*100 + 1);
        int n = 0 , m = 10;
        int numero;
        JOptionPane.showMessageDialog(null, "JUEGO DEL NUMERO MAGICO \n cantidad de intentos "+m);
        
        boolean log;
        do{
            do{
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Numero \n cantidad de intentos "+m));
                n = n + 1;
            m = m - 1;
            if (aleatorio > numero){
                JOptionPane.showMessageDialog(null,"el Numero ingresado "+numero+" es Menor al numero MAGICO");
                
            }else if (aleatorio == numero){
                JOptionPane.showMessageDialog(null,"FELICIDADES ENCONTRASTE EL NUMERO MAGICO "+numero);
                JOptionPane.showMessageDialog(null,"TE QUEDARON "+m+" INTENTOS!");
                break;
                
            }else if(aleatorio < numero){
                JOptionPane.showMessageDialog(null,"el Numero ingresado "+numero+" es Mayor al numero MAGICO");
                
            }
            }
            while(n <= 10);
        }
        while(n < 10);
        if (n == 10){
            JOptionPane.showMessageDialog(null,"PERDISTE EL NUMERO MAGICO ES: ");
            JOptionPane.showMessageDialog(null,aleatorio);
        }
        
        
    }
    
}
