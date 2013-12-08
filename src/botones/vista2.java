/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * vista2.java
 *
 * Created on 27-sep-2013, 20:01:25
 */
package botones;

import Creditos.Creditos;
import Creditos.Instrucciones;
import ImagenFondo.ImagenFondo;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author sarahmanchon
 */
public class vista2 extends JFrame {
    //imagen de fondo  

    private final ImagenFondo modelo1 = new ImagenFondo("/ImagenFondo/preview2.png");
    private AudioClip game;
    private Creditos titulo = new Creditos();
    private Instrucciones ints = new Instrucciones();

    /**
     * Creates new form vista2
     */
    public vista2() {

        setUndecorated(true);
        setContentPane(modelo1);


        // vista2.add(this);
        initComponents();
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        //move(450, 300);
        setLocationRelativeTo(null);

        disableButton();
      
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
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        credito = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
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

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoInicial/logo1.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setDefaultCapable(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoInicial/Imagen-animada-de-Cocodrilo-29.gif"))); // NOI18N

        jButton3.setFont(new java.awt.Font("Herculanum", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 51, 0));
        jButton3.setText("instrucciones");
        jButton3.setActionCommand(" instrucciones");
        jButton3.setAlignmentX(-1.0F);
        jButton3.setAlignmentY(0.0F);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setDefaultCapable(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusTraversalKeysEnabled(false);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn1.setText("jButton4");

        btn2.setText("jButton5");
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
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(59, 59, 59)
                        .add(credito, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 445, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(29, 29, 29)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 233, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btn1)
                        .add(18, 18, 18)
                        .add(btn2)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 106, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jButton2)
                            .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(16, 16, 16))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .add(layout.createSequentialGroup()
                .add(59, 59, 59)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 470, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(jLabel1)
                .add(12, 12, 12)
                .add(credito, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 333, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 31, Short.MAX_VALUE)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(24, 24, 24))
                    .add(layout.createSequentialGroup()
                        .add(74, 74, 74)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(btn1)
                            .add(btn2))
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .add(layout.createSequentialGroup()
                .add(88, 88, 88)
                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButton2)
                .add(138, 138, 138)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Speech Sleep.wav"));
        sonido.play();
        vista obj = new vista();// declaro el objeto
        obj.setVisible(true);
        this.dispose();
       
       /*  try {finalize();
           // this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Speech Sleep.wav"));
        sonido.play();
        //dimesion de mi panel

        int witdh = credito.getWidth();
        int height = credito.getHeight();
        credito.setLayout(new BorderLayout());
        // llamao a mi calse 
       //  Creditos titulo = new Creditos();
        titulo.setPreferredSize(new Dimension(witdh, height));
        credito.add("Center", titulo);
        credito.updateUI();
        credito.validate();
          //habilita
        enableButton();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
         enableButton2();
    }//GEN-LAST:event_btn2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int witdh = credito.getWidth();
        int height = credito.getHeight();
        credito.setLayout(new BorderLayout());
       // Instrucciones ints = new Instrucciones();
        ints.setPreferredSize(new Dimension(witdh, height));
        credito.add("Center", ints);
        credito.updateUI();
        credito.validate();
        remove(this);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JLabel credito;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
