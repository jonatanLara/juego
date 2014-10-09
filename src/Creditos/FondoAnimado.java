/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Creditos;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author jonatanLara
 */
public class FondoAnimado extends JLabel {
    Image image = null;
    int width;
    int height;
    public FondoAnimado() {
        setVisible(true);
         image = new ImageIcon(getClass().getResource("/HilosFondo/hojasLabel.gif")).getImage();
        /* width=getWidth();
         height=getHeight();*/
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        g.drawImage(image, 30, 25, labelFor);
    }
}

