/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import java.awt.Image;
import javax.swing.JFrame;

/**
 *
 * @author usuario
 */
public class JFrameImage extends JFrame {

    private final JPaneImage modelo = new JPaneImage();

    public JFrameImage() 
    {
        setContentPane(modelo);

    }

    public void setImage(String nombreimagen) {
        modelo.setImage(nombreimagen);
    }

    public void setImage(Image imagennueva) {
        modelo.setImage(imagennueva);
    }
}
