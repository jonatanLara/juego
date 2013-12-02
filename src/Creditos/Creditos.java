/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Creditos;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author usuario
 */
public class Creditos extends JLabel {
    // ImageIcon image;

    public Creditos() {
        setVisible(true);
        // image = new ImageIcon(getClass().getResource("/LogoInical/logo1.png"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //g.setColor(Color.BLUE);
        g.setColor(new Color(102, 51, 0));
        //setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        setFont(new java.awt.Font("HERCULANUM", 500, 16));
        //15 es mi separacion lateral y 90 es hacia abajo 
        g.drawString("Este juego fue creado por Jabakids S.A de C.V", 15, 60);
        g.drawString("DESARROLLADORES", 15, 110);
        g.drawString("AREA ADMINISTRATIVA", 15, 130);
        g.drawString("AREA DE MERCADOTECNIA", 15, 150);
        g.drawString("AREA DE RECURSOS HUMANOS", 15, 170);
        g.drawString("AREA DE INFORMATICA", 15, 190);
        g.drawString("", 10, 210);
      /* g.setColor(Color.GRAY);
         g.drawString("tienes 10 oportunidades para ganar", 10, 230);
         g.drawString("s", 10, 250);
         g.drawString("", 10,270);
         */
    }
}
