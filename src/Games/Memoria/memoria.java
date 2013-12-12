/*
 * Memorama.java
 *
 * Created on 28-sep-2013, 18:43:14
 */
package Games.Memoria;

import ImagenFondo.ImagenFondo;
import botones.*;
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class memoria extends javax.swing.JFrame {

    //imagen de fondo
    private final ImagenFondo modelo = new ImagenFondo("/ImagenFondo/preview.png");

    private AudioClip fondo;

    public memoria() {
        setUndecorated(true);
        setContentPane(modelo);
        fondo = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/ambient_red_savannah.wav"));
        fondo.loop();
        fondo.play();
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        principal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/facil2.png"))); // NOI18N
        jButton2.setText(" Nivel Facil");
        jButton2.setActionCommand("   Facil");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/facil3.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/facil.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/medio2.png"))); // NOI18N
        jButton3.setText("Nivel Medio");
        jButton3.setActionCommand("       Medio");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/medio3.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/medio.png"))); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu2.png"))); // NOI18N
        jButton1.setToolTipText("MENU");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        jButton1.setSelected(true);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(principal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(38, 38, 38)
                        .add(jButton2)
                        .add(30, 30, 30)
                        .add(jButton3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 316, Short.MAX_VALUE)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(9, 9, 9)
                .add(principal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jButton1))
                .add(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AudioClip boton;
        boton = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Speech Sleep.wav"));
        boton.play();
        fondo.stop();
        vista obj = new vista();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    //    BOTON FACIL
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        principal.removeAll();
        //dimesion de mi panel
        int witdh = principal.getWidth();
        int height = principal.getHeight();
        principal.setLayout(new BorderLayout());
        // llamao a mi calse 
        GameMemory game = new GameMemory();
        game.setPreferredSize(new Dimension(witdh, height));
        principal.add("Center", game);
        principal.updateUI();
        principal.validate();
        //    AUDIO    
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/bubble.wav"));
        sonido.play();
    }//GEN-LAST:event_jButton2ActionPerformed
    //   BOTON MEDIO 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        principal.removeAll();
        int witdh = principal.getWidth();
        int height = principal.getHeight();
        principal.setLayout(new BorderLayout());
        GameMemory2 game = new GameMemory2();
        game.setPreferredSize(new Dimension(witdh, height));
        principal.add("Center", game);
        principal.updateUI();
        principal.validate();
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/bubble.wav"));
        sonido.play();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new memoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel principal;
    // End of variables declaration//GEN-END:variables

}
