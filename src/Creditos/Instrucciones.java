
package Creditos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class Instrucciones extends JLabel {
  
     private Image icono = null;
     private Image icono2 = null;
    public Instrucciones() {
      
        setVisible(true);
        icono = new ImageIcon(getClass().getResource("/image/run.gif")).getImage();
        icono2 = new ImageIcon(getClass().getResource("/image/niveles.gif")).getImage();
    }
   
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(102, 51, 0));
        setFont(new java.awt.Font("HERCULANUM", 500, 16));
        g.drawString("  instrucciones del juego ", 60, 45);
        g.drawString("paso 1: seleccione el icono :", 40, 65);
        g.drawImage(icono, 30, 70, labelFor);
        g.drawString("paso 2: seleccione el nivel que desee :", 40, 240);
        g.drawImage(icono2, 30, 245, labelFor);
        
    }

}

