
package botones;

import LogoInicial.LogoInicial;
import javax.swing.ImageIcon;



public class botones {
//
static LogoInicial carga;

    public static void main(String[] args) throws InterruptedException {
        carga = new LogoInicial();
        ImageIcon icon = carga.getImage();
        int width = icon.getImage().getWidth(carga);
        int height = icon.getImage().getHeight(carga);
        carga.setSize(width, height);
        Thread.currentThread();
        Thread.sleep(6000);
        carga.setVisible(false);        
        vista reproducir = new vista();
        reproducir.setVisible(true);
    }
}
