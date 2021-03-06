/*
 * notas
    crear una clase como instrucciones con graphics para repintar la 
    animacion de la HojaAnimada!! pero con un hilo  proximamente!! 
 */

/*
 * vista2.java
 *
 * Created on 27-sep-2013, 20:01:25
 */
package botones;

import Creditos.Creditos;
import Creditos.FondoAnimado;
import Creditos.Ins2;
import Creditos.Instrucciones;
import Games.Memoria.CuentaRegresiva;
import ImagenFondo.ImagenFondo;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author sarahmanchon
 */
public class vista2 extends JFrame {
    //imagen de fondo  

    private final ImagenFondo modelo1 = new ImagenFondo("/ImagenFondo/FondoAnimado.gif");
    private AudioClip game;
    private final Creditos titulo = new Creditos();
    private final Instrucciones ints = new Instrucciones();
    private final AudioClip fondo;
  
     FondoAnimado fondoAnimado =new FondoAnimado();
    /**
     * Creates new form vista2
     */
       
        Timer Reloj,Reloj2;
        private int delay = 90,delay2=90;
        int cont1 =0,cont2=0;
        String aux,aux2;
        
    public vista2() {
        setUndecorated(true);
        setContentPane(modelo1);
        fondo = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/ambient_red_savannah.wav"));
        fondo.loop();
        fondo.play();
        initComponents();
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        botonCreditos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        setLocationRelativeTo(null);
        disableButton();
        //para quitar el foco que viene por default
        jLabel1.requestFocus();
    }

    public void disableButton() {
        //deshabilita
        btn1.setEnabled(false);
        btn2.setEnabled(false);
    }

    public void enableButton() {
       //habilita
        btn2.setEnabled(true);
    }
    public void enableButton2() {
       //habilita
        btn1.setEnabled(true);
    }
    
    public void conteo(){
       ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                 LabelCredito.removeAll();
                for (int i = 0;i < 9; i++) {
                    if (cont1==i+1) {
                        aux = "/hojas/hoja"+String.valueOf(i+1)+".png";
                       LabelCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource(aux)));
                       
                    }
                    
                }
                 cont1++;
                 if (cont1==9) {
                    cont1=0;
                    Reloj.stop();
                    LabelCredito.removeAll();
                     instrucciones();
                    //credito();
                }
               }
            
             }; // Fin de la declaración del ActionListener.
        
        Reloj = new Timer(delay, taskPerformer);
        Reloj.start(); // Empieza la ejecución del timer.
       }
    public void instrucciones(){
        LabelCredito.removeAll();
        int witdh = LabelCredito.getWidth();
        int height = LabelCredito.getHeight();
        LabelCredito.setLayout(new BorderLayout());
        ints.setPreferredSize(new Dimension(witdh, height));
        LabelCredito.add("Center", ints);
        LabelCredito.updateUI();
        LabelCredito.validate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonCreditos = new javax.swing.JButton();
        Cocodrilo = new javax.swing.JLabel();
        LabelCredito = new javax.swing.JLabel();
        BotonInstrucciones = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        jButton1.setToolTipText("MENU");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Herculanum", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setText("<<<     TITULOS     >>>");

        botonCreditos.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        botonCreditos.setForeground(new java.awt.Color(102, 51, 0));
        botonCreditos.setText("creditos");
        botonCreditos.setToolTipText("JABAKIDS");
        botonCreditos.setBorderPainted(false);
        botonCreditos.setContentAreaFilled(false);
        botonCreditos.setDefaultCapable(false);
        botonCreditos.setFocusPainted(false);
        botonCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCreditosActionPerformed(evt);
            }
        });

        Cocodrilo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoInicial/Imagen-animada-de-Cocodrilo-29.gif"))); // NOI18N
        Cocodrilo.setToolTipText("!!HOLA MI NOMBRE ES COCONILO !! BIENVENIDO A MI HOGAR !!");

        BotonInstrucciones.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        BotonInstrucciones.setForeground(new java.awt.Color(102, 51, 0));
        BotonInstrucciones.setText("instrucciones");
        BotonInstrucciones.setActionCommand(" instrucciones");
        BotonInstrucciones.setAlignmentX(-1.0F);
        BotonInstrucciones.setAlignmentY(0.0F);
        BotonInstrucciones.setBorderPainted(false);
        BotonInstrucciones.setContentAreaFilled(false);
        BotonInstrucciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonInstrucciones.setDefaultCapable(false);
        BotonInstrucciones.setFocusPainted(false);
        BotonInstrucciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BotonInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInstruccionesActionPerformed(evt);
            }
        });

        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/at.png"))); // NOI18N
        btn1.setToolTipText("ATRAS");
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn1.setDefaultCapable(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/at2.png"))); // NOI18N
        btn2.setToolTipText("SIGUIENTE");
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn2.setDefaultCapable(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(59, 59, 59)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 470, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
                .add(44, 44, 44)
                .add(LabelCredito, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 451, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(120, 120, 120)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(BotonInstrucciones)
                    .add(layout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(botonCreditos))))
            .add(layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(Cocodrilo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 233, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(4, 4, 4)
                .add(btn1)
                .add(18, 18, 18)
                .add(btn2)
                .add(187, 187, 187)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1)
                .add(11, 11, 11)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(LabelCredito, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 364, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(30, 30, 30)
                        .add(BotonInstrucciones, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(134, 134, 134)
                        .add(botonCreditos)))
                .add(6, 6, 6)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Cocodrilo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(43, 43, 43)
                        .add(btn1))
                    .add(layout.createSequentialGroup()
                        .add(43, 43, 43)
                        .add(btn2))
                    .add(layout.createSequentialGroup()
                        .add(39, 39, 39)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Speech Sleep.wav"));
        sonido.play();
        fondo.stop();
        vista obj = new vista();// declaro el objeto
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCreditosActionPerformed
      
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Speech Sleep.wav"));
        sonido.play();
        credis();
        
    }//GEN-LAST:event_botonCreditosActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       
        enableButton2();
        AudioClip boton;
        boton = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/bubble.wav"));
        boton.play();
         
    }//GEN-LAST:event_btn2ActionPerformed

    private void BotonInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInstruccionesActionPerformed
        conteo();
        AudioClip boton;
        boton = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Speech Sleep.wav"));
        boton.play();
        remove(this);
         //habilita
        enableButton();
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_BotonInstruccionesActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        LabelCredito.removeAll(); 
        AudioClip boton;
        boton = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/bubble.wav"));
        boton.play();
        
    }//GEN-LAST:event_btn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new vista2().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInstrucciones;
    private javax.swing.JLabel Cocodrilo;
    private javax.swing.JLabel LabelCredito;
    private javax.swing.JButton botonCreditos;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

       
    
         
          public void credito() 
          {
              LabelCredito.removeAll();
              int witdh = LabelCredito.getWidth();
              int height = LabelCredito.getHeight();
              LabelCredito.setLayout(new BorderLayout());
              titulo.setPreferredSize(new Dimension(witdh, height));
              LabelCredito.add("Center", titulo);
              LabelCredito.updateUI();
              LabelCredito.validate();
          }
          public void credis(){
       ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                LabelCredito.removeAll();
                for (int i = 0;i < 9; i++) {
                    if (cont2==i+1) {
                        aux2 = "/hojas/hoja"+String.valueOf(i+1)+".png";
                       LabelCredito.setIcon(new javax.swing.ImageIcon(getClass().getResource(aux2)));
                       
                    }
                    
                }
                 cont2++;
                 if (cont2==9) {
                    cont2=0;
                    Reloj2.stop();
                    LabelCredito.removeAll();
                    credito();
       
                }
               }
            
             }; // Fin de la declaración del ActionListener.
        
        Reloj2 = new Timer(delay2, taskPerformer);
        Reloj2.start(); // Empieza la ejecución del timer.
       }
          
        
}
