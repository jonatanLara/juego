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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Timer;

public class memoria extends javax.swing.JFrame {

    //imagen de fondo
    private final ImagenFondo modelo = new ImagenFondo("/ImagenFondo/preview.png");
    
    GameMemory game = new GameMemory();
    private AudioClip fondo;
    //contador    
        
        Timer Reloj;
        int segundos;
        int copiaSegundos;// Para recordar los segundos en caso de reiniciar la cuenta regresiva.
        int delay = 1000; // Cada cúantos milisegundos nuestro Timer hará una acción,
      //GameMemory inicioConteo = new GameMemory();
    
    public memoria() {
        
        setUndecorated(true);
        setContentPane(modelo);
        fondo = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/ambient_red_savannah.wav"));
        fondo.loop();//loop hace que si se acaba la cancion empiese de nuevo
       // fondo.play();
        initComponents();
        setLocationRelativeTo(null);
        principal.requestFocus();
        
        
        }
    
   /* public void iniciar(){
         segundos =60;
         copiaSegundos=segundos; // Para recordar cuántos segundos introducimos.
             ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                lblTime.setFont(new Font("HERCULANUM", Font.BOLD, 40));
                lblTime.setForeground(new Color(102, 51, 0));
                lblTime.setText( String.valueOf(segundos)); 
                if(segundos<=0) 
                {
                   Toolkit.getDefaultToolkit().beep(); // Emite sonido.
                    Reloj.stop(); // Detiene el timer y se deja de ejecutar ésto.
                //    System.out.println(" puuto0oo!!");
                   
                   
                 }
                segundos--; // Reduce la cantidad de segundos.
            }
        }; // Fin de la declaración del ActionListener.
        Reloj = new Timer(delay, taskPerformer);
        Reloj.start(); // Empieza la ejecución del timer.
           
    }   */


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonNivelFacil = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        principal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbPuntos = new javax.swing.JLabel();
        lbBonus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbpBonus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonNivelFacil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/facil2.png"))); // NOI18N
        BotonNivelFacil.setText(" Nivel Facil");
        BotonNivelFacil.setActionCommand("   Facil");
        BotonNivelFacil.setBorder(null);
        BotonNivelFacil.setBorderPainted(false);
        BotonNivelFacil.setContentAreaFilled(false);
        BotonNivelFacil.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BotonNivelFacil.setFocusable(false);
        BotonNivelFacil.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/facil3.png"))); // NOI18N
        BotonNivelFacil.setRequestFocusEnabled(false);
        BotonNivelFacil.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/facil.png"))); // NOI18N
        BotonNivelFacil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BotonNivelFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNivelFacilActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/medio2.png"))); // NOI18N
        jButton3.setText("Nivel Medio");
        jButton3.setActionCommand("       Medio");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/medio3.png"))); // NOI18N
        jButton3.setRequestFocusEnabled(false);
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
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        jButton1.setSelected(true);
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setOpaque(false);

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/1318964434_cairo-clock.png"))); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(15, 15, 15)
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(lblTime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .add(lblTime, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lbPuntos.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lbPuntos.setForeground(new java.awt.Color(102, 51, 0));
        lbPuntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPuntos.setText("0");

        lbBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bon.png"))); // NOI18N
        lbBonus.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("Tiempo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 51, 0));
        jLabel3.setText("Puntos");

        lbpBonus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbpBonus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(principal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(38, 38, 38)
                        .add(BotonNivelFacil)
                        .add(30, 30, 30)
                        .add(jButton3)
                        .add(29, 29, 29)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 103, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)))
                .add(52, 52, 52)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lbpBonus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lbBonus))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 50, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(lbPuntos, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 88, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(108, 108, 108))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .add(principal, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 445, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 32, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(BotonNivelFacil, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 89, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                .add(jButton1)
                                .add(org.jdesktop.layout.GroupLayout.LEADING, lbPuntos, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(layout.createSequentialGroup()
                        .add(lbBonus)
                        .add(18, 18, 18)
                        .add(lbpBonus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AudioClip boton;
        boton = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/Speech Sleep.wav"));
        boton.play();
        fondo.stop();
        principal.requestFocus();
        vista obj = new vista();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    //    BOTON FACIL
    private void BotonNivelFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNivelFacilActionPerformed
       CuentaRegresiva cuenta = new CuentaRegresiva(this, true);
       cuenta.setVisible(true);
       //para que incie el conteo al mismo tiempo que el Dialogo.
       
      
       game.conteo();//llamo a conteo

      // inicioConteo.checkWin();
       // GameMemory game = new GameMemory();
        principal.removeAll();
        principal.requestFocus();
        //dimesion de mi panel
        int witdh = principal.getWidth();
        int height = principal.getHeight();
        principal.setLayout(new BorderLayout());
        // llamao a mi calse 
        //GameMemory game = new GameMemory();
        game.setPreferredSize(new Dimension(witdh, height));
        principal.add("Center", game);
        principal.updateUI();
        principal.validate();
        //    AUDIO    
        AudioClip sonido;
        sonido = java.applet.Applet.newAudioClip(getClass().getResource("/Audio/bubble.wav"));
        sonido.play();
        
        
       /* timer corer = new timer();
        corer.start();*/
        
       
      //  timer.start();
    }//GEN-LAST:event_BotonNivelFacilActionPerformed
    //   BOTON MEDIO 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        principal.removeAll();
        principal.requestFocus();
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
    private javax.swing.JButton BotonNivelFacil;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lbBonus;
    public static javax.swing.JLabel lbPuntos;
    public static javax.swing.JLabel lblTime;
    public static javax.swing.JLabel lbpBonus;
    private javax.swing.JLabel principal;
    // End of variables declaration//GEN-END:variables

}
