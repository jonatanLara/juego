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
    //creo mi imagen
    ImageIcon imagen;
    //le doy un alto y un ancho 
    int alto;
    int ancho;
    //el sonido con el que empieza mi aplicacion
    AudioClip logo;    
    
    public LogoInicial(){
        //lo ublico en el centro 
        setLocationRelativeTo(null);
        //cargo mi imagen con mi metodo cargarImagen
        cargarImagen();
       
    }
    //mi metodo
    public final void cargarImagen(){
        ///creo y le doy la ubicacion de mi audio
        logo = java.applet.Applet.newAudioClip(getClass().getResource("flute+hrn+mrmba.aif"));
        //le digo que empiese
        logo.play();
        //le elimino los bordes
        setUndecorated(true);
        //le doy un color blanco
        setBackground(Color.WHITE);
        //inicializo y cargo mi imagen 
        imagen = new ImageIcon(getClass().getResource("login390.gif"));
        // lo incliyo en un label con el nombre de img
        JLabel img= new JLabel(imagen);
        //le digo que sea visible 
        img.setVisible(true);
       // y agrego mi imagen
        add(img);
      //nose que hace pero ta chido :D
        move(450,250);
        //y aho visible CargarImagen
        this.setVisible(true);
    }
        
        public ImageIcon getImage() {
        return this.imagen;
    }
          
}
