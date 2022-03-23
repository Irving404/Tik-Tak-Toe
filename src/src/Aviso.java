/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URI;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 52552
 */
public class Aviso extends javax.swing.JFrame {

    public Aviso(int tipo, int res) {
        initComponents();
        setLocationRelativeTo(null);
//        cursor();
        if (tipo == 0) {
            if (res == 1) {
                respuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/win.png")));
                jugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jug1.png")));
            } else if (res == 2) {
                respuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/win.png")));
                jugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jug2.png")));
            } else {
                respuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empate.png")));
//                jugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jug1.png")));
            }
        } else if (tipo == 1) {
            if (res == 1) {
                respuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/win.png")));
                jugador.setIcon(null);
            } else if (res == 2) {
                respuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lose.png")));
                jugador.setIcon(null);
            } else {
                respuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empate.png")));
                jugador.setIcon(null);
            }
        }
    }

    private void cursor() {
        Cursor cursor;
        ImageIcon img = new ImageIcon("/img/cursor.png");
        Toolkit tool = Toolkit.getDefaultToolkit();
        cursor = tool.createCustomCursor(img.getImage(), new Point(1, 1), "Cursor");
        setCursor(cursor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        respuesta = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jugador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resultados");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        respuesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/win.png"))); // NOI18N
        getContentPane().add(respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 300, 60));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebook_OFF.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebook_ON.png"))); // NOI18N
        jButton7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebook_ON.png"))); // NOI18N
        jButton7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/facebook_ON.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 50, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 40, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 50, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cooltext353107099000628.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play_2.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play_2.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/play_2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, 60));

        jugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jug1.png"))); // NOI18N
        getContentPane().add(jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 280, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/unnamed.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Init().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setState(Init.ICONIFIED);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
//       abrir facebook
        try {
            Desktop.getDesktop().browse(URI.create("https://www.facebook.com/irvingB9c50"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO CONECTAR A LA RED");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jugador;
    private javax.swing.JLabel respuesta;
    // End of variables declaration//GEN-END:variables
}
