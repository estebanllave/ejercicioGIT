/*
 Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
 */

/**
 *
 * @author esteban
 */
public class ejercicioP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //con For
        for (int i = 0; i<=100;i++){
            // Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
            //Utiliza el bucle que desees.
            if (i % 2== 0){
                System.out.println("el numero "+i+ " es DIVISIBLE POR 2");
            }else if(i % 3 == 0){
                System.out.println("el numero "+i+ " es DIVISIBLE POR 3" );
            }
        }
        /*
        Con while
        while (i != 100){
            i = i + 1;
            System.out.println(i);
        }
        */
    
    }
    
}
