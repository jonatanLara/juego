
package Creditos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class Instrucciones extends JLabel {
  //  BufferedImage image;
    public Instrucciones() {
      //  this.image=image;
      //  Image Image = new ImageIcon(getClass().getResource("/imagenes/animals.png")).getImage();
        //image = imag, new ImageIcon(getClass().getResource("/imagenes/felicidades.gif")).getImage());
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(102, 51, 0));
        setFont(new java.awt.Font("HERCULANUM", 500, 16));
    //  g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        g.drawString("  instrucciones del juego ", 30, 60);
        g.drawString("paso 1: selecciones una de las cartas", 15, 110);
        g.drawString("paso 2: seleciones la que crea, ", 15, 130);
        g.drawString("  que es igual a la primera carta", 15, 150);
        g.drawString("paso 3: espere 2 segundos para ", 15, 170);
        g.drawString("  comparar si son iguales", 15, 190);
        g.drawString("", 10, 210);
      
    }
   
}

