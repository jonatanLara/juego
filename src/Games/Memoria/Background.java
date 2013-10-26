
package Games.Memoria;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author Atxy2k
 */
public class Background extends JPanel{
    
    BufferedImage image;
    Image after;
    
    public Background(BufferedImage image, Image after) {
        this.image = image;
        this.after = after;
    }
    
    public void paint(Graphics g){
        g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        g.drawImage(after, 0, 0, getWidth()/2, getHeight(), this);
    }
    
    
}
