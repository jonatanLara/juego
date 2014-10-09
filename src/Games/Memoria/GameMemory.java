package Games.Memoria;

import static Games.Memoria.memoria.lblTime;
import java.applet.AudioClip;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.JPanel;

/**
 *
 * @author Atxy2k
 */
public class GameMemory extends JPanel {
//public class GameMemory extends JLabel {

    private ArrayList<CardPanel> all = new ArrayList<CardPanel>();
    private ArrayList<CardPanel> selected = new ArrayList<CardPanel>();
    private int images = 10;
    private int maxIntents = 12;
    private int intents = 0;
    private int bonus = 0;
    private int puntos = 0;
    private int puntobonus=0;
    //contador
     Timer Reloj;
       private int segundos = 60;
        private int copiaSegundos=segundos;// Para recordar los segundos en caso de reiniciar la cuenta regresiva.
        private int delay = 1000;
        private int segTerminados =0;
   
        
        public GameMemory() {
        super();
        //5x4 //el 2 x 2 es el espacio  que hay entre ellas
        this.setLayout(new GridLayout(5, 4, 2, 2));
        this.setBackground(new Color(0, 0, 0, 10));
        addCards();
       
      //  memoria memo = new memoria();
       // memo.iniciar();
    }
    
      
    private void addCards() {
        /*CuentaRegresiva c = new CuentaRegresiva(null, true);
        c.iniciar();*/
        for (int i = 0; i < images; i++) {
            Image image = new ImageIcon(getClass().getResource("/imagenes/animals" + (i + 1) + ".png")).getImage();
            all.add(new CardPanel(i, image));
            all.add(new CardPanel(i, image));
            
        }
        for (final CardPanel card : all) {
            card.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (card.isBlock()) {
                        card.active();
                        selected.add(card);
                        //  AUDIOO POR CARRTAA 
                        AudioClip combo32;
                        combo32 = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/combo32.wav"));
                        combo32.play();
                        
                        card.repaint();
                        check();
                    }
                }
            });
        }
        ArrayList<CardPanel> aux = new ArrayList<CardPanel>(all);
        while (!aux.isEmpty()) {
            Random random = new Random();
            int x = random.nextInt(aux.size());
            this.add(aux.get(x));
            aux.remove(x);
        }
    }
              // METODO DE COMPARACION 
                    //   HILO
    private class HiloRegresaAtras extends Thread {
          @Override
          public void run() {
            try {
                // ESPERO 1 SEG 
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                 Logger.getLogger(GameMemory.class.getName()).log(Level.SEVERE, null, ex);
            }
            //selecion de mi primera carta
            selected.get(0).block();
            selected.get(0).repaint();
            //selecion de mi segunda carta
            selected.get(1).block();
            selected.get(1).repaint();
            
            selected.remove(0);
            selected.remove(0);
            intents += 1;
              System.out.println("intentos # "  + intents);
              
              bonus =0;
              System.out.println("bunos"+bonus);
             

        }
    }
    
    private void check() {
        if (selected.size() == 2) {
            if (selected.get(0).compareTo(selected.get(1))) {
                selected.remove(0);
                selected.remove(0);
                /// AUDIO //
                AudioClip combo42;
                combo42 = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/combo42.wav"));
                combo42.play();
                //--------se agrego el bunus.... nota no se ha agregado al puntuaje......
                
                bonus +=1;
                System.out.println("bonus "+bonus);
                memoria.lbpBonus.setFont(new Font("HERCULANUM", Font.BOLD, 40));
                memoria.lbpBonus.setForeground(new Color(102, 51, 0));
                
                AudioClip bons;
                bons = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Item.wav"));
                
                if(bonus==2) {
                    memoria.lbBonus.setEnabled(true);
                    
                   puntobonus +=5;
                   memoria.lbBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bon.png")));
                   segundos +=5;//agregamos 5 seg extra
                   bons.play();
                   
                   memoria.lbpBonus.setText(String.valueOf(puntobonus));
                }if (bonus==3) {
                    puntobonus +=10;
                    memoria.lbpBonus.setText(String.valueOf(puntobonus));
                    bons.play();
                    
                }
                
                //------- se agrego el puntuaje.... 
                
                 puntos +=10;
                memoria.lbPuntos.setFont(new Font("HERCULANUM", Font.BOLD, 40));
                memoria.lbPuntos.setForeground(new Color(102, 51, 0));
                memoria.lbPuntos.setText( String.valueOf(puntos));
                
                
            } else {
                HiloRegresaAtras hilo = new HiloRegresaAtras();
                hilo.start();
                }
        }
        checkWin();
       
    }
     public void checkWin() {
       // 
        if (intents == maxIntents ) {
            
         showAlert(false);//perdiste
            System.out.println("termino");
            Reloj.stop();
            
        } else 
        {
            boolean win = true;
            //Reloj.stop();
            for (CardPanel card : all) {
                if (card.isBlock()) {
                    win = false;
                }
            }
            if (win) {
                showAlert(true);
                Reloj.stop();
                if (segundos>0) {
                     memoria.lblTime.setText(null);
                     memoria.lbpBonus.setText(String.valueOf(puntobonus  += segundos));
                     memoria.lbPuntos.setText(String.valueOf(puntos += segundos));
                     AudioClip bons1;
                        bons1 = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Sprout.wav"));
                        bons1.play();
                      
                        
                }
               
            }
        }
    }
       

    public void showAlert(boolean result) {
        
        BufferedImage image = getJPanelImage();
        if (image != null) {
            this.removeAll();
            this.setLayout(new BorderLayout());
            Background canvas;
            
          
            if (result) {      
                //    ganaste
                
                canvas = new Background(image, new ImageIcon(getClass().getResource("/imagenes/felicidades.gif")).getImage());
                
                AudioClip win;
                win = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Applause.wav"));
                win.play();
             //   Invoking Thread.stop();
           //    memoria.timer.stop();
     
                
            } else {  
                // perdiste
                canvas = new Background(image, new ImageIcon(getClass().getResource("/imagenes/que.gif")).getImage());
                AudioClip loser;
                loser = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Abucheo.wav"));
                loser.play();
                
            }
            this.add("Center", canvas);
            this.updateUI();
            this.validate();

        }
    }

    public BufferedImage getJPanelImage() {
        try {
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(this.getLocationOnScreen().x, this.getLocationOnScreen().y, this.getWidth(), this.getHeight()));
            return image;
        } catch (AWTException ex) {
            return null;
        }
    }
    
     public void conteo(){
       
       
         ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                lblTime.setFont(new Font("HERCULANUM", Font.BOLD, 40));
                lblTime.setForeground(new Color(102, 51, 0));
                lblTime.setText( String.valueOf(segundos)); 
                System.out.println(String.valueOf(segundos));
                
                if(segundos<=0) 
                {
                   // Toolkit.getDefaultToolkit().beep(); // Emite sonido.
                    Reloj.stop();
                    showAlert(false);
                    } 
                else{
                  boolean win = true;
            
                         for (CardPanel card : all) {
                            if (card.isBlock()) {
                               win = false;
                      }
                }
           }//fin del else
                if (segundos==10) {
                    AudioClip time;
                    time = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Time Warning.wav"));
                    time.play();
//System.out.println("a 10 del final");
                }
                segundos--; // Reduce la cantidad de segundos.
                
            }
             }; // Fin de la declaración del ActionListener.
        
        Reloj = new Timer(delay, taskPerformer);
        Reloj.start(); // Empieza la ejecución del timer.
        
       }
}

