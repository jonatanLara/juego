/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Games.Memoria;


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
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Atxy2k
 */
public class GameMemory extends JPanel{

    private ArrayList<CardPanel> all = new ArrayList<CardPanel>();
    private ArrayList<CardPanel> selected = new ArrayList<CardPanel>();
    private int images = 10;
    private int maxIntents = 10;
    private int intents = 0;
    
    public GameMemory() {
        super();
        this.setLayout(new GridLayout(5, 4, 1, 1));
        addCards();
    }
    
    private void addCards(){
        for (int i = 0; i < images; i++) {
            Image image = new ImageIcon(getClass().getResource("/imagenes/animals"+(i+1)+".png")).getImage();
            all.add(new CardPanel(i, image));
            all.add(new CardPanel(i, image));
        }
        for (final CardPanel card: all) {
            card.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    if (card.isBlock()) {
                        card.active();
                        selected.add(card);
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
    
    private void check(){
        if (selected.size()==3) {
            if (selected.get(0).compareTo(selected.get(1))) {
                selected.remove(0);
                selected.remove(0);
            }else{
                selected.get(0).block();
                selected.get(0).repaint();
                selected.get(1).block();
                selected.get(1).repaint();
                selected.remove(0);
                selected.remove(0);
                intents+=1;
            }
        }
        checkWin();
    }
    
    private void checkWin(){
        if (intents==maxIntents) {
            //JOptionPane.showMessageDialog(this, "Perdiste puto!!!");
            showAlert(false);
        }else{
            boolean win = true;
            for (CardPanel card : all) {
                if (card.isBlock()) {
                    win = false;
                }
            }
            if (win) {
                //JOptionPane.showMessageDialog(this, "Ganaste puto!!!");
                showAlert(true);
            }
        }
    }
    
    public void showAlert(boolean result){
        BufferedImage image = getJPanelImage();
        if (image!=null) {
            this.removeAll();
            this.setLayout(new BorderLayout());
            Background canvas;
            if (result) {
                canvas = new Background(image, new ImageIcon(getClass().getResource("/imagenes/smile.png")).getImage());
            }else{
                canvas = new Background(image, new ImageIcon(getClass().getResource("/imagenes/happy.png")).getImage());
            }
            this.add("Center", canvas);
            this.updateUI();
            this.validate();
            
        }
    }
    
    public BufferedImage getJPanelImage(){
        try {
            BufferedImage image = new Robot().createScreenCapture(new Rectangle(this.getLocationOnScreen().x, this.getLocationOnScreen().y, this.getWidth(), this.getHeight()));
            return image;
        } catch (AWTException ex) {
            return null;
        }   
    }
    
}
