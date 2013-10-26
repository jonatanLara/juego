package Pruebas2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class PanelCarta extends JPanel implements MouseListener{
	
	Image img;
	int clave;
	boolean sw=false;
	boolean bloqueado=false;
	Principal p;
	
	public PanelCarta(Principal prin,Image im, int c){
		p=prin;
		img=im;
		clave=c;
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());
		if(sw || bloqueado){
			g.drawImage(img, 32, 0,130,100, this);
		}
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
