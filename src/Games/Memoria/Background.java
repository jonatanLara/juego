package Games.Memoria;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

/**  EN ESTA CLASE SE CAPTURA LAS IMAGENES 
 *   DEL PANEL O PLANILLA Y LA IMAGE 
 *   GANADORA O PERDEDORA
 */
public class Background extends JPanel{
     
    BufferedImage image;
    Image after;
    
    public Background(BufferedImage image, Image after) {
        //planilla del juego
        this.image = image;
        //imagen ganador o perdedor
        this.after = after;
        
    }
   
    @Override
    public void paint(Graphics g){
        //imagen del juego la planilla
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        //imagen que sale despues del juego 
        g.drawImage(after, 150, 0, getWidth()/2 ,getHeight(), this);
       
    }
    
    
}
