
package Games.Memoria;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Atxy2k
 */
public class CardPanel extends CustomCanvas{
    
    private boolean block = true;
    private int key;
    private Image image;
    
   public CardPanel(int key, Image image) {
        super();
        this.key = key;
        this.image = image;
    }
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        // si mi carta esta diferente de block
        if (!block) {
           // las images de los animales
            g.drawImage(image, toFisicX(-5), toFisicY(5), right-left, bottom-top, this);
        }else{
            Image question = new ImageIcon(getClass().getResource("/imagenes/question.png")).getImage();
       // carga los iconos en question 
            g.drawImage(question, toFisicX(-5), toFisicY(5), right-left, bottom-top, this);
        }
    }
    
    public void block() {
        this.block = true;
    }

    public void active() {
        this.block = false;
    }

    public boolean isBlock() {
        return block;
    }

    public int getKey() {
        return key;
    }
    
    public boolean compareTo(CardPanel card){
        return this.key == card.getKey();
    }
    
    
    
    
    
    
}
