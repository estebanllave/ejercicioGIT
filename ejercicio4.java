
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
  Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ 
  en caso contrario, el programa termina cuando se introduce un espacio.
 */

/**
 *
 * @author esteban
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "hola SILVIA");
            Scanner scanner = new Scanner(System.in);
    String cadena;
    int longitud;
    char caracter;
    boolean vocal = true;
// Solicitud de datos al usuario
    System.out.println("El programa analizará si los carácteres son vocales o no.");
    System.out.print("Introduce los carácteres a analizar, en caso de querer terminar "
        + "el programa, introduce un espacio: ");
    cadena = scanner.nextLine();
    while (!cadena.equals(" ")){
      longitud = cadena.length();
      for (int i=0;(i < longitud);i++){
        caracter = cadena.toUpperCase().charAt(i);
        if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
          vocal = true;
        } else {
          vocal =false;
          cadena = " ";
          break;
        }
      }
      if (vocal){
        System.out.println("Los carácteres son VOCALES.");
       } else {
         System.out.println("Los carácteres NO SON VOCALES");
       }
      System.out.print("Introduce nuevos carácteres a analizar, en caso de querer terminar "
          + "el programa, introduce un espacio: ");
      cadena = scanner.nextLine(); 
     }
    System.out.println("FIN DEL PROGRAMA");
  }
}

