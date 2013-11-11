/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author usuario
 */
public class testThread extends Thread{
   // private  palabras = new String {""};
    private String [] palabras;
    
    private JButton boton;
    
    public testThread(JButton boton){
        this.boton = boton;
      //palabras = new String {""};
    
        
     Random random = new Random ();
    int palabras = random.nextInt();
    }
    
    
    @Override
    public void run(){
     cambiarTexto();
     //testThread();
    }
            
    public void cambiarTexto(){
    
        
    }
    
}
