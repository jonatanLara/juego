/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class BackgroundImage extends JPanel {

    private Image imagen;

    public BackgroundImage() {
        imagen = null;
    }

    public BackgroundImage(String nombreimagen) {
        //si nombre imagen es diferente de null asignara la imagen
        if (nombreimagen != null) {
            imagen = new ImageIcon(getClass().getResource(nombreimagen)).getImage();

        }
    }

    public BackgroundImage(Image img) {
        //si image es diferente asignaremos la variable imagen un image
        if (img != null) {
            imagen = img;
        }
    }

    public void setImage(String nombreimagen) {
        //si es el nombre de la imagen que estamos resiviendo trae algun contenido
        if (nombreimagen != null) {
            //
            imagen = new ImageIcon(getClass().getResource(nombreimagen)).getImage();
        } else {
            imagen = null;
        }
        repaint();
    }

    public void setImage(Image nuevaimagen) {
        //si imagen es diferente de null
        if (nuevaimagen != null) {
            //
            imagen = nuevaimagen;
        } else {
            imagen = null;
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        if (imagen!=null)
        {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
        } 
        else 
        {
            setOpaque(true);
        }
        super.paint(g);
    }
}
