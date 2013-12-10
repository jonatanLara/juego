/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Games.Cat;

import Games.Memoria.CustomCanvas;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Atxy2k
 */
public class FigureCat extends CustomCanvas{
    
    private Image defaultimage = null;
    private Image xImage = null;
    private Image circleImage = null;
    
    private boolean block = true;
    private boolean circle = false;
    
    
    public FigureCat() {
        super();
        //defaul la del BORREGO
        defaultimage = new ImageIcon(getClass().getResource("/image/gat.gif")).getImage();
        //circulo
        xImage = new ImageIcon(getClass().getResource("/image/cat_1.png")).getImage();
        circleImage = new ImageIcon(getClass().getResource("/image/gat1.png")).getImage();
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        if (block) {
            g.drawImage(defaultimage, toFisicX(-5), toFisicY(5), right-left, bottom-top, this);
        }else{
            g.drawImage( circle ? circleImage : xImage , toFisicX(-5), toFisicY(5), right-left, bottom-top, this);
        }
    }
    
    public void flip(boolean cir){
        block = false;
        this.circle = cir;
        this.repaint();
    }

    public boolean isBlock() {
        return block;
    }

    public boolean isCircle() {
        return circle;
    }
    
    
    
}
