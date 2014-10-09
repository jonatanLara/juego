
/*
 * vista.java
 *
 * Created on 20-sep-2013, 15:45:25
 */

package botones;

import Games.Cat.FrameCatGame;
import Games.Memoria.memoria;
import ImagenFondo.ImagenFondo;
import Salir.Salir;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.MouseInfo;
import java.awt.Point;
import javax.swing.JFrame;


public class vista extends JFrame {
    //agrego una Imagen de fondo a la pantalla Principal
   int activa = 0;
   //move
    int x, y;
 private final ImagenFondo modelo = new ImagenFondo("preview.png");
   static AudioClip game;
    
    
    /** Creates new form vista */
    public vista() {
        
        setUndecorated(true); //quitar la barra de titulo
        setContentPane(modelo);
        
        game=java.applet.Applet.newAudioClip(getClass().getResource("/Audio/game.wav"));
        game.loop();
        //game.play();
        
        initComponents();
        jLabel1.requestFocus();
        //cursor
        jButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        PanelMove.setBackground(new Color(0, 0, 0, 10));
        PanelMove.setCursor(new Cursor(Cursor.MOVE_CURSOR));
        setLocationRelativeTo(null);
           

         }

    public void setImage(String nombreimagen) {
        modelo.setImage(nombreimagen);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PanelMove = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bee2.png"))); // NOI18N
        jButton1.setToolTipText("GATO");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(-3);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bee3.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bee1.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rompecabeza2.png"))); // NOI18N
        jButton3.setToolTipText("MEMORAMA");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(0);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rompecabeza3.png"))); // NOI18N
        jButton3.setRequestFocusEnabled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rompecabeza1.png"))); // NOI18N
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/salir2.png"))); // NOI18N
        jButton4.setToolTipText("SALIR");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(0);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/salir3.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/red-32280_150.png"))); // NOI18N
        jButton4.setVerifyInputWhenFocusTarget(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aundio2.png"))); // NOI18N
        jButton2.setToolTipText("AUDIO");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(-3);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/audio3.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/audio1.png"))); // NOI18N
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/2.png"))); // NOI18N
        jButton5.setToolTipText("INSTRUCCIONES");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setIconTextGap(0);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/3.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1.png"))); // NOI18N
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        PanelMove.setBackground(new java.awt.Color(255, 255, 255));
        PanelMove.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelMoveMouseDragged(evt);
            }
        });
        PanelMove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelMoveMousePressed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout PanelMoveLayout = new org.jdesktop.layout.GroupLayout(PanelMove);
        PanelMove.setLayout(PanelMoveLayout);
        PanelMoveLayout.setHorizontalGroup(
            PanelMoveLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        PanelMoveLayout.setVerticalGroup(
            PanelMoveLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 28, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(14, 14, 14)
                .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 156, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(42, 42, 42)
                .add(jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 138, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 35, Short.MAX_VALUE)
                .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jLabel1)
                .add(293, 293, 293))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PanelMove, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(PanelMove, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 248, Short.MAX_VALUE)
                .add(jLabel1)
                .add(187, 187, 187)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jButton5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 101, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido=java.applet.Applet.newAudioClip(getClass().getResource("/Audio/bubble.wav"));
        sonido.play();
        FrameCatGame objeto = new FrameCatGame ();// declaro el objeto
        objeto.setVisible(true);
        dispose();
        jLabel1.requestFocus();
        game.stop();
      //setImage("preview.jpg");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      //agregamos el audio
        jLabel1.requestFocus();
        AudioClip sonido;
        sonido=java.applet.Applet.newAudioClip(getClass().getResource("/Audio/bubble.wav"));
        sonido.play();
        game.stop();
       //conctamos a la vista juego
        memoria objetoVentanaGame = new memoria();// declaro el objeto
        objetoVentanaGame.setVisible(true);
        dispose();// para que se cierre mi Vista Principal*/
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // game.stop();
        jLabel1.requestFocus();
        if (activa==1) {
            System.out.println("Activa");
            game.play();
            activa =0;
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/audio1.png")));
        }else{
            activa =1;
            System.out.println("desactiva");
            game.stop();
            jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/not.png")));
        }
        
         //  */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jLabel1.requestFocus();
        AudioClip sonido;
        sonido=java.applet.Applet.newAudioClip(getClass().getResource("/Audio/bubble.wav"));
        sonido.play();
        game.stop();
        Salir salir =new  Salir();
        salir.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jLabel1.requestFocus();
        AudioClip sonido;
        sonido=java.applet.Applet.newAudioClip(getClass().getResource("/Audio/gemongem2.wav"));
        sonido.play();
        game.stop();
        vista2 obj = new vista2();// declaro el objeto
        obj.setVisible(true);
        dispose();// para que se cierre mi Vista Principal 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void PanelMoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMoveMousePressed
        x =evt.getX();
        y  = evt.getY();
    }//GEN-LAST:event_PanelMoveMousePressed

    private void PanelMoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelMoveMouseDragged
        // TODO add your handling code here:
        Point point = MouseInfo.getPointerInfo().getLocation(); 
         this.setLocation(point.x - x, point.y - y); 
    }//GEN-LAST:event_PanelMoveMouseDragged

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new vista().setVisible(true);
            
                        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMove;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
