
package ImagenFondo;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class ImagenFondo extends javax.swing.JPanel {

    public ImagenFondo(){
     initComponents();
    this.setSize(643, 508);
    }
    @Override
    public void paintComponent(Graphics g){
  Dimension tam = getSize();
  ImageIcon ImagenFondo= new ImageIcon(new ImageIcon(getClass().getResource("fondo.jpg")).getImage());
  g.drawImage(ImagenFondo.getImage(), 0, 0, tam.width, tam.height, null);
  setOpaque(false);
  super.paintComponent(g);
}

    private void initComponents() {
        //
    }
    
    
}
