/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LogoInicial;
import java.applet.AudioClip;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Image;
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
       // this.alto=alto;
      //  this.ancho=ancho;
       ancho = Toolkit.getDefaultToolkit().getScreenSize().width; 
        alto = Toolkit.getDefaultToolkit().getScreenSize().height;
        
      }
    public void CargarImagen(){
    logo = java.applet.Applet.newAudioClip(getClass().getResource("flute+hrn+mrmba.aif"));
    logo.play();
    setUndecorated(true);
    //setLocationRelativeTo(null);
    setBackground(Color.WHITE);
    setBounds(ancho/2 - ancho/5, alto/2 - alto/5-5, 390, 380);
  
   // setBounds(alto, ancho/ 2 , 390, 380);
    imagen = new ImageIcon(getClass().getResource("login390.gif"));
    JLabel img= new JLabel(imagen);
 // img.setSize(500,500);
    setBounds(0 , 0 , 390 ,380);
    img.setVisible(true);
    add(img);
    show();

    
    }
}
