
package Games.Memoria;

import java.awt.Dimension;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class Animacion extends JLabel{
    private Timer tiempo;
    private TimerTask task;
    private int speed = 120;
    private int frame=0;
    boolean run = true;
    
    //se redimencion al tamaño del contenedor
    public Animacion(Dimension d){
        this.setSize(d);
    }
    //coloca una imagen en el label
    public void setimage(int n){
  // this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/im/a_"+ n +".png")));   
 // this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/japo_"+ n +".jpg")));
        this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprite/"+ n +".png")));
    }
    //incializamos la velocidad de las imagenes
    public void setVelocidad(int v){
        this.speed=v;
     }

   public void StartAnimacion(){
        run=true;
           tiempo = new Timer();
           task = new TimerTask() {               
               @Override
               public void run() {
                   frame++;                   
                   if (frame<=12){
                        setimage(frame);
                        
                   }
                  else
                {
                 
                    frame=0;
                       try {
                           Thread.sleep(6000);
                       } catch (InterruptedException ex) {
                           Logger.getLogger(Animacion.class.getName()).log(Level.SEVERE, null, ex);
                       }
                }
               }
           };
           //se inicia la animacion
           System.out.println("Se inicia la animacion");                                             
           tiempo.schedule(task,0,speed); 
    }
       
    }
   
