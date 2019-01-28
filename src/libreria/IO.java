/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// ACABAR DE HACER LA LIBRERIA EN ESTA CLASE,ELIMINAR LA OTRA Y ENVIAR.

package libreria;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mrebelladofernandez
 */
public class IO {

    public static final int CONSOLA = 0;   // Creamos dos constantes. 
    public static final int VENTANA = 1;  //Las constantes van siempre en mayus.

    public static int introducir(int tipo, String mensaje) {
        int numero = 0;
        switch (tipo) {
            case CONSOLA:  //dos puntos
                Scanner obx = new Scanner(System.in);
                System.out.println(mensaje);
                numero = parseInt(obx.nextLine());
                return numero; // o ponemos un break o un return para cortar el bucle

            case VENTANA:
                numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
                return numero;
        }
        return numero;
    }

    public static void mostrar(String mensaje) {
        switch (tipo){
            case CONSOLA:
                Scanner obx =new Scanner(System.in);
                //...
                
            case VENTANA:
                //...
        }
        System.out.println(mensaje);
    }
}
