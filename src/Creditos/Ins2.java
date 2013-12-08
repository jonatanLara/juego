/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Ins2 extends JLabel{
  
    private Image icono = null;
     
    public Ins2() {
      
        setVisible(true);
        icono = new ImageIcon(getClass().getResource("/image/niveles.gif")).getImage();
    }
   
    @Override
        public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(102, 51, 0));
        setFont(new java.awt.Font("HERCULANUM", 500, 16));
        g.drawString("  instrucciones del juego ", 60, 60);
        g.drawString("paso 2: seleccione el icono :", 40, 90);
        g.drawImage(icono, 30, 120, labelFor);
        
    }

}

