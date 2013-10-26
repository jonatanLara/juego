/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Games.Memoria;

import java.awt.AWTException;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Atxy2k
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
