
package botones;

import LogoInicial.LogoInicial;



public class botones {
//
static LogoInicial carga;

    public static void main(String[] args) throws InterruptedException {
        carga = new LogoInicial();
        carga.CargarImagen();
        Thread.currentThread();
        Thread.sleep(6000);
        carga.setVisible(false);
        
        vista reproducir = new vista();
        reproducir.setVisible(true);
        
      
        
     //in 
   /*  do
      nombre = JOptionPane.showInputDialog("Escribe tu nombre", nombre);
     while ((nombre == null) || (nombre.equals("")));

      setTitle("Bienvenido: " + nombre);
    }

    private static void setTitle(String string) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
    }
         
        
}
