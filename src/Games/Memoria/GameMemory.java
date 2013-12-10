package Games.Memoria;

import java.applet.AudioClip;
import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
//import javax.swing.JPanel;

/**
 *
 * @author Atxy2k
 */
//public class GameMemory extends JPanel {
public class GameMemory extends JLabel {

    private ArrayList<CardPanel> all = new ArrayList<CardPanel>();
    private ArrayList<CardPanel> selected = new ArrayList<CardPanel>();
    private int images = 10;
    private int maxIntents = 12;
    private int intents = 0;

    public GameMemory() {
        super();
        //5x4 
        this.setLayout(new GridLayout(5, 4, 1, 1));
        addCards();
    }
    private void addCards() {
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
            } else {
                HiloRegresaAtras hilo = new HiloRegresaAtras();
                hilo.start();
                }
        }
        checkWin();
    }
     private void checkWin() {
        if (intents == maxIntents) {
            showAlert(false);
        } else {
            boolean win = true;
            for (CardPanel card : all) {
                if (card.isBlock()) {
                    win = false;
                }
            }
            if (win) {
                showAlert(true);
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
                
                
            } else {  
                // perdiste
                canvas = new Background(image, new ImageIcon(getClass().getResource("/imagenes/bob.gif")).getImage());
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
}
