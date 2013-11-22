/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Games.Memoria;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author Atxy2k
 */
public class CustomCanvas extends Canvas{
    
    private float rWidth, rHeight, pixelSize;
    protected int left, right, top, bottom, xmiddle, ymiddle, centerX, centerY;
    
    
    public CustomCanvas(float rWidth, float rHeight) {
        this.rWidth = rWidth;
        this.rHeight = rHeight;
        setBackground(Color.white);
    }

    public CustomCanvas() {
        this.rWidth = 10.0F;
        this.rHeight = 10.0F;
        setBackground(Color.white);
    }
    private void initComponents(){
        Dimension d = getSize();
        int maxX = d.width-1;
        int maxY = d.height-1;
        pixelSize = Math.max(rWidth/maxX, rHeight/maxY);
        centerX = maxX/2;
        centerY = maxY/2;
        left = toFisicX(-rWidth/2);
        right = toFisicX(rWidth/2);
        top = toFisicY(rHeight/2);
        bottom = toFisicY(-rHeight/2);
        xmiddle = toFisicX(0);
        ymiddle = toFisicY(0);
    }

    @Override
    public void paint(Graphics g){
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());
      //  g.setColor(Color.black);
        initComponents();
    }
    
    protected int toFisicX(float x){
        return Math.round(centerX+x/pixelSize);
    }
    protected int toFisicY(float y){
        return Math.round(centerY-y/pixelSize);
    }
    protected float toRealX(int x){
        return (x-centerX) * pixelSize;
    }
    protected float toRealY(int y){
        return (centerY-y) *pixelSize;
    }

    @Override
    public void update(Graphics g){
        paint(g);
    }
    
}
