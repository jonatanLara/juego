package ImagenFondo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class ImagenFondo extends JPanel {
private Image imagen;
    public ImagenFondo() {
        imagen =null;
       
    //  this.setSize(795, 600);
      } 
     public ImagenFondo(String nombre){
          if(nombre != null)
              imagen = new ImageIcon(getClass().getResource(nombre)).getImage();
      }
        public ImagenFondo(Image img) {
        //si image es diferente asignaremos la variable imagen un image
        if (img != null) {
            imagen = img;
        }
     }
         public void setImage (String nombre) {
        //si es el nombre de la imagen que estamos resiviendo trae algun contenido
        if (nombre != null) {
            //
            imagen = new ImageIcon(getClass().getResource(nombre)).getImage();
        } else {
            imagen = null;
        }
        repaint();
    }
         @Override
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        } else {
            setOpaque(true);
        }
        super.paint(g);
    }

    @Override
    public void update(Graphics g) {
        paint(g);
    }

    }

  /*  @Override
    public void paintComponent(Graphics g) {
        Dimension tam = getSize();
        ImageIcon ImagenFondo = new ImageIcon(new ImageIcon(getClass().getResource("preview.png")).getImage());
        g.drawImage(ImagenFondo.getImage(), 0, 0, tam.width, tam.height, null);
        setOpaque(false);
        super.paintComponent(g);
        
    }
*/


