package Games.memorama;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelCarta extends Canvas implements MouseListener{

	Image img;
	int clave;

        boolean sw=false;
	boolean bloqueado=false;
	Memorama p;

	public PanelCarta(Memorama prin,Image im, int c){
		p=prin;

		img=im;
		clave=c;
		addMouseListener(this);
               // setBackground(Color.YELLOW);
	}

        /*public class sonido{

        private Clip clip;
        private JPanel jPanel;

        }*/

        @Override
	public void paint(Graphics g){
            g.setColor(Color.WHITE);//color del cuadro
	        g.fillRect(0, 0, getWidth(), getHeight());
		if(sw || bloqueado){
                        int x = (getWidth()/4);// dividimos para centrar la imagen
			g.drawImage(img, x, 0, getHeight(),getHeight(), this);
		}
	}

        @Override
        public void update(Graphics arg0) {
            paint(arg0);
        }

	@Override
	public void mouseClicked(MouseEvent e) {
		if(bloqueado==false){
			if(!sw){
				sw=true;
				p.seleccionados.add(this);
				p.verificar();
			}
		}
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
