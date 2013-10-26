package Pruebas2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;
//import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Principal extends JFrame{
	
	ArrayList<PanelCarta> todos,todos2,seleccionados;
	int contadorperdedor=0;
	int contadorganador=0;
	JPanel panelPrincipal;
	
	public Principal(){
		setLayout(new BorderLayout());
		panelPrincipal=new JPanel();
		panelPrincipal.setLayout(new GridLayout(5,4,5,5));
		JMenuBar menu=new JMenuBar();
		JMenu archivo=new JMenu("Archivo");
		JMenuItem nuevo=new JMenuItem("Nuevo");
		nuevo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panelPrincipal.removeAll();
				agregarPaneles();
			}
		});
		JMenuItem salir=new JMenuItem("Salir");
		salir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		archivo.add(nuevo);
		archivo.add(salir);
		menu.add(archivo);
		setJMenuBar(menu);
		todos=new ArrayList<PanelCarta>();
		todos2=new ArrayList<PanelCarta>();
		seleccionados=new ArrayList<PanelCarta>();
		agregarPaneles();
		add(panelPrincipal);
	}
	
	public void agregarPaneles(){
		todos.clear();
		todos2.clear();
		seleccionados.clear();
		for(int i=0;i<10;i++){
			ImageIcon img=new ImageIcon(this.getClass().getResource("/imagenes/animals"+(i+1)+".png"));
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

	public void verificar() {
		if (seleccionados.size() == 3) {
			if (seleccionados.get(0).clave == seleccionados.get(1).clave) {
				seleccionados.get(0).bloqueado = true;
				seleccionados.get(1).bloqueado = true;
				seleccionados.clear();
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
				JOptionPane.showMessageDialog(null, "Ganaste!!!!");
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

	public static void main(String arg[]) {

		Principal p = new Principal();
		p.setVisible(true);
		p.setBounds(0, 0, 800, 600);
		p.setLocationRelativeTo(null);
		p.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

}
