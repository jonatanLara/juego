
package Pruebas;

import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author usuario
 */
public class testThread extends Thread{
   // private  palabras = new String {""};
   // private String[] palabras = new String[5];
    String[] nombres = {"rana","gato","abeja"};
    
    private JButton boton;
    
    public testThread(JButton boton, String nombres){
        this.boton = boton;
  }
    
    @Override
    public void run(){
     cambiarTexto();
     //testThread();
    }
            
    public void cambiarTexto(){
       Random random = new Random ();
      int nombres = random.nextInt();
        
        for (int i = 0; i <nombres; i++) {
        }
        
    }
    
}
