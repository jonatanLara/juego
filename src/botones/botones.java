
package botones;

import LogoInicial.LogoInicial;
import javax.swing.ImageIcon;



public class botones {
//es la clase que cree, doy el nombre de carga
static LogoInicial carga;

    public static void main(String[] args) throws InterruptedException {
        //lo incializo
        carga = new LogoInicial();
        
        ImageIcon icon = carga.getImage();
        int width = icon.getImage().getWidth(carga);
        int height = icon.getImage().getHeight(carga);
        carga.setSize(width, height);
   //-------------aqui esta el truco----------------
        Thread.currentThread();//solo por 6000ms me aparecera
        Thread.sleep(6000);
        carga.setVisible(false);//despues se sierra
        
     //y cargo mi ventana Principal
        vista reproducir = new vista();
        reproducir.setVisible(true);
       
        
        }
    }

