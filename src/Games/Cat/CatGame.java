/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Games.Cat;

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Atxy2k
 */
public class CatGame extends JLabel{

    private final ArrayList<FigureCat> cards = new ArrayList<FigureCat>();
    private boolean circle = false;
    
    public CatGame() {
        super();
        init();
    }
    
    public final void init(){
        this.removeAll();
        this.setLayout(new GridLayout(3, 3, 3, 3));
        cards.clear();
        addCards();
        this.updateUI();
        this.validate();
    }
    
    private void addCards(){
        for (int i = 0; i < 9; i++) {
            cards.add(new FigureCat());
        }
        
        for (final FigureCat card:cards) {
            this.add(card);
            card.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    card.flip(circle);
                         AudioClip combo32;
                         combo32 = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/combo32.wav"));
                         combo32.play();
                    circle =!circle;
                    checkWin();
                   
                }
            });
        }
        
    }
    
    private void checkWin(){
        boolean win = false;
        int count = 0;
       
        
        for (int i = 0; i < cards.size(); i++) {
            if (!cards.get(i).isBlock()) {
                
                count++;
               
            }
        }
        if (count>=5) {
            if (win()) {
                win = true;
              //  System.out.println("co"+count);
            }
            
        }
        //juego ganado 1
        if (win) { 
          
           
              /* AudioClip ganador;
                ganador = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Applause.wav"));
                ganador.play();*/
                
                
                this.init();
                this.repaint();
            if (count==1||count==3||count==5||count==7||count==9) {
                JOptionPane.showMessageDialog(this, "Gano el perro");
            }
            else{
            JOptionPane.showMessageDialog(this, "Gano el gato!");
            }
            
        }else{//si no hay ganador esto es un gato encerraado
            if (cat()) {
                AudioClip loser;
                loser = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/cat1.wav"));
                loser.play();
                JOptionPane.showMessageDialog(this, "Gato", "Gato!", JOptionPane.ERROR_MESSAGE);
                this.init();
                this.repaint();
                
            }
        }
        
    }
    
    public boolean cat(){
        int n = 0;
        for (int i = 0; i < cards.size(); i++) {
            if (!cards.get(i).isBlock()) {
                n++;
            }
        }
      //  System.out.println(n);
        return n==cards.size();
    }
    
    public boolean win(){
        boolean[] results = new boolean[8];
        results[0] = checkValue(0, 1, 2);
        results[1] = checkValue(3, 4, 5);
        results[2] = checkValue(6, 7, 8);
        results[3] = checkValue(0, 3, 6);
        results[4] = checkValue(1, 4, 7);
        results[5] = checkValue(2, 5, 8);
        results[6] = checkValue(0, 4, 8);
        results[7] = checkValue(6, 4, 2);
        for (boolean res : results) {
            if (res) {
                return true;
            }
        }
        return false;
    }
    
    public boolean checkValue(int a, int b, int c){
        FigureCat[] vec = {cards.get(a),cards.get(b),cards.get(c)};
        for (FigureCat vec1 : vec) {
            if (vec1.isBlock()) {
                return false;
            }
        }
        return vec[0].isCircle() && vec[1].isCircle() && vec[2].isCircle() || 
                !vec[0].isCircle() && !vec[1].isCircle() && !vec[2].isCircle();
    }

}

