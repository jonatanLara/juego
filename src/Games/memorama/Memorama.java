

package Games.memorama;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Memorama extends JPanel{

	ArrayList<PanelCarta> todos,todos2,seleccionados;
	int contadorperdedor=0;
	int contadorganador=0;
	JPanel panelPrincipal;
        private int imagenes;

        public Memorama(){
		setLayout(new BorderLayout());
		panelPrincipal=new JPanel();
		panelPrincipal.setLayout(new GridLayout(5,5,5,5));//5,4,5,5
                todos=new ArrayList<PanelCarta>();
		todos2=new ArrayList<PanelCarta>();
		seleccionados=new ArrayList<PanelCarta>();
		agregarPaneles();
		add(panelPrincipal);

	}
        public Memorama(int numero_de_imagenes, Dimension d){
		setLayout(new BorderLayout());
                setSize((int) d.getWidth(), (int) d.getHeight());
		panelPrincipal=new JPanel();
		panelPrincipal.setLayout(new GridLayout(5,5,5,5));//5,4,5,5
                todos=new ArrayList<PanelCarta>();
		todos2=new ArrayList<PanelCarta>();
		seleccionados=new ArrayList<PanelCarta>();
		agregarPaneles();
		add(panelPrincipal);
                this.imagenes = numero_de_imagenes;
	}
        

	public void agregarPaneles(){
		todos.clear();
		todos2.clear();
		seleccionados.clear();
		//aplicamos el for para que no pongamos todas las imagenes. con el for las recorre
                for(int i=0;i<imagenes;i++){// son10 imagenes
		//(i+1)para porque incremetamos para que hace a la siguienete imagen
                    ImageIcon img=new ImageIcon(this.getClass().getResource("/imagenes/animals"+(i+1)+".png"));



                    // este sera el primer dibujo
                    PanelCarta pc=new PanelCarta(this,img.getImage(), i+1);
	            PanelCarta pc2=new PanelCarta(this,img.getImage(), i+1);
			todos.add(pc);
			todos.add(pc2);
			todos2.add(pc);
			todos2.add(pc2);
		}
		while(!todos.isEmpty()){
			Random r=new Random();
			int x=(int)(r.nextDouble() * todos.size());
			panelPrincipal.add(todos.get(x));
			todos.remove(x);
		}
		panelPrincipal.updateUI();
		repaint();
	}

        public void setImagenes(int img){
            this.imagenes = img;
        }

        public int getImagenes(){
            return this.imagenes;
        }

	public void verificar() {
		if (seleccionados.size() == 3) {

			if (seleccionados.get(0).clave == seleccionados.get(1).clave) {
			//primera imgen
                            seleccionados.get(0).bloqueado = true
                                    ;
				seleccionados.get(1).bloqueado = true;
				seleccionados.clear();//limpia

                                ocultar();
				contadorganador++;

			} else {
				seleccionados.clear();
				ocultar();
				contadorperdedor++;
				if (contadorperdedor == 20) {

                                    JOptionPane.showMessageDialog(null,
						"Perdiste, Trata nuevamente.");

					contadorperdedor = 0;
					contadorperdedor = 0;
					panelPrincipal.removeAll();
					agregarPaneles();
				}
			}
		} else {
			if (contadorganador == 9 && seleccionados.size() == 2) {
				JOptionPane.showMessageDialog(null, "Hee!! Felicidades!! Ganaste!!!!");

                                contadorperdedor = 0;
				contadorperdedor = 0;
			}
		}
	}

	public void ocultar() {
		for (int i = 0; i < todos2.size(); i++) {
			todos2.get(i).sw = false;
			todos2.get(i).repaint();
			repaint();
		}
	}
	

}
