
package Creditos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    //  g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        g.drawString("  instrucciones del juego ", 60, 45);
        g.drawString("paso 1: seleccione el icono :", 40, 65);
        g.drawImage(icono, 30, 70, labelFor);
        g.drawString("paso 2: seleccione el icono :", 40, 240);
        g.drawImage(icono2, 30, 245, labelFor);
        
        /* g.drawString("paso 2: seleciones la que crea, ", 15, 130);
        g.drawString("  que es igual a la primera carta", 15, 150);
        g.drawString("paso 3: espere 2 segundos para ", 15, 170);
        g.drawString("  comparar si son iguales", 15, 190);
         g.drawString(" ", 10, 210);*/
    }

}

