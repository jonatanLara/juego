package Components;


import java.awt.AlphaComposite;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;


/**
 *
 * @author usuario
 */
public class FondoTransparente extends Canvas
{
    
    @Override
    public void paint(Graphics graphics){
        Graphics2D g = (Graphics2D)graphics;
        AlphaComposite composite = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0F);
        g.setComposite(composite);
        g.fill(new Rectangle2D.Double(0, 0, getWidth(), getHeight()));
    }
    
}
