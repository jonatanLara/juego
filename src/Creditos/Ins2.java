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
    private Image icono2 = null;
     
    public Ins2() {
      
        setVisible(true);
        icono = new ImageIcon(getClass().getResource("/image/gana.gif")).getImage();
        icono2 = new ImageIcon(getClass().getResource("/image/gana.gif")).getImage();
    }
   
    @Override
        public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(102, 51, 0));
        setFont(new java.awt.Font("HERCULANUM", 500, 16));
     //   g.drawString("  instrucciones del juego ", 60, 45);
        g.drawString("paso 3 : seleccione 2 cartas que ", 40, 50);
        g.drawString("consideren que son iguales ", 40, 67);
        g.drawImage(icono, 30, 75, labelFor);
        g.drawString("paso 4 : espere 2 segundos para comprobar ", 40, 300);
        g.drawString("si son iguales, tendras 12 oportiidades.", 40, 317);
        g.drawString("encuentra todas las cartas iguales", 40, 334);
        //g.drawString("el nivel facil 12 intentos en el nivel dificil ", 180, 351);
        g.drawString("!exito !", 180, 351);
      
    }

}

