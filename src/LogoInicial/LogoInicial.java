/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogoInicial;
import java.applet.AudioClip;
//import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
//import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class LogoInicial extends JFrame{
    
    ImageIcon imagen;
    int alto;
    int ancho;
    AudioClip logo;    
    
    public LogoInicial(){
        setLocationRelativeTo(null);
        cargarImagen();
       
    }
    
    public final void cargarImagen(){
        logo = java.applet.Applet.newAudioClip(getClass().getResource("flute+hrn+mrmba.aif"));
        logo.play();
        setUndecorated(true);
        setBackground(Color.WHITE);
        imagen = new ImageIcon(getClass().getResource("login390.gif"));
        JLabel img= new JLabel(imagen);
        img.setVisible(true);
        add(img);
      //nose que hace pero ta chido :D
        move(450,250);
        
        this.setVisible(true);
    }
    
        public ImageIcon getImage() {
        return this.imagen;
    }
          
}
