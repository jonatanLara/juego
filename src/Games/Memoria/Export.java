/*
 * captura la imagen de todo el panel  
 * 
 */
package Games.Memoria;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 *
 * @author 
 */
public class Export {
   // Formats Support bmp, jpg, jpeg, png.
    protected JPanel canvas;
    protected BufferedImage image;
    
    public Export(JPanel canvas) throws AWTException {
        this.canvas = canvas;
        Dimension d = this.canvas.getSize();
        image = new Robot().createScreenCapture(new Rectangle(canvas.getLocationOnScreen().x, canvas.getLocationOnScreen().y, canvas.getWidth(), canvas.getHeight()));
        //image = new BufferedImage(d.width, d.height, BufferedImage.TYPE_INT_RGB);
    }
    
    
    
}
