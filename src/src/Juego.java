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
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author 52552
 */
public class Juego extends javax.swing.JFrame {
    
    private ArrayList<ArrayList<Integer>> lista;
    private ArrayList<Integer> jugador_1, jugador_2;
    private String x = "X", o = "O";
    boolean res = false, res2 = false;
    private int init, turno = 1;
    
    public Juego(int init) {
        this.init = init;
        inicia();
        jugador_1 = new ArrayList<Integer>();
        jugador_2 = new ArrayList<Integer>();
        initComponents();
        if (init == 1) {
            lbmod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fac.png")));
        } else if (init == 2) {
            lbmod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/med.png")));
        } else if (init == 3) {
            lbmod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dif.png")));
        } else {
            lbmod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/multi_2.png")));
        }
//          cursor();
        setLocationRelativeTo(null);
    }
    
    private void cursor() {
        Cursor cursor;
        ImageIcon img = new ImageIcon("/img/cursor.png");        
        Toolkit tool = Toolkit.getDefaultToolkit();
        cursor = tool.createCustomCursor(img.getImage(), new Point(1, 1), "Cursor");
        setCursor(cursor);
    }

    private void verificaMulti() {
        
        lista.forEach(aux -> {
            if (jugador_1.containsAll(aux)) {
                new Aviso(0, 1).setVisible(true);
                reinicia();
            }
        });
        lista.forEach(aux -> {
            if (jugador_2.containsAll(aux)) {
                new Aviso(0, 2).setVisible(true);
                reinicia();
            }
        });
        
        if (jugador_1.size() >= 5 || jugador_2.size() >= 5) {
            new Aviso(0, 3).setVisible(true);
            reinicia();
        }
    }
    
    private void multi(int posicion) {
        if (turno == 1) {
            jugador_1.add(posicion);
            turno = 2;
            switch (posicion) {
                case 1:
                    lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                    verificaMulti();
                    break;
                case 2:
                    lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                    verificaMulti();
                    break;
                case 3:
                    lb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                    verificaMulti();
                    break;
                case 4:
                    lb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                    verificaMulti();
                    break;
                case 5:
                    lb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                    verificaMulti();
                    break;
                case 6:
                    lb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                    verificaMulti();
                    break;
                case 7:
                    lb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                    verificaMulti();
                    break;
                case 8:
                    lb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                    verificaMulti();
                    break;
                case 9:
                    lb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                    verificaMulti();
                    break;
            }
        } else if (turno == 2) {
            jugador_2.add(posicion);
            turno = 1;
            switch (posicion) {
                case 1:
                    lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                    verificaMulti();
                    break;
                case 2:
                    lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                    verificaMulti();
                    break;
                case 3:
                    lb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                    verificaMulti();
                    break;
                case 4:
                    lb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                    verificaMulti();
                    break;
                case 5:
                    lb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                    verificaMulti();
                    break;
                case 6:
                    lb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                    verificaMulti();
                    break;
                case 7:
                    lb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                    verificaMulti();
                    break;
                case 8:
                    lb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                    verificaMulti();
                    break;
                case 9:
                    lb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                    verificaMulti();
                    break;
            }
        }
    }
    
    private void tira_maquina() {
        boolean tira = true;
        while (tira) {
            int i = (int) (Math.random() * 9);
            if (!jugador_1.contains(i) && !jugador_2.contains(i) && i != 0) {
                lbTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png")));
                tira = false;
                jugador_2.add(i);
                switch (i) {
                    case 1:
                        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                        break;
                    case 2:
                        lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                        break;
                    case 3:
                        lb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                        break;
                    case 4:
                        lb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                        break;
                    case 5:
                        lb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                        break;
                    case 6:
                        lb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                        break;
                    case 7:
                        lb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                        break;
                    case 8:
                        lb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                        break;
                    case 9:
                        lb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/oo.png")));
                        break;
                }
            }
        }
    }
    
    private void verifica_j1() {
        if (jugador_1.size() < 5) {
            lista.forEach((aux) -> {
                if (jugador_1.containsAll(aux)) {
                    res = true;
                }
            });
            if (!res) {
                tira_maquina();
                lista.forEach((aux) -> {
                    if (jugador_2.containsAll(aux)) {
                        res2 = true;
                    }
                });
                if (res2) {
                    //Perdio
                    new Aviso(1, 2).setVisible(true);
                    reinicia();
                }
            } else {
                //jugador 1
                new Aviso(1, 1).setVisible(true);
                reinicia();
            }
        } else {
            //Empate
            new Aviso(1, 3).setVisible(true);
            reinicia();
        }
    }
    
    private void reinicia() {
        this.setVisible(false);
        if (turno == 2) {
            turno = 1;
        } else {
            turno = 2;
        }
        res = res2 = false;
        lb1.setText("");
        lb1.setIcon(null);
        lb2.setIcon(null);
        lb3.setIcon(null);
        lb4.setIcon(null);
        lb5.setIcon(null);
        lb6.setIcon(null);
        lb7.setIcon(null);
        lb8.setIcon(null);
        lb9.setIcon(null);
        jugador_1 = new ArrayList<>();
        jugador_2 = new ArrayList<>();
    }
    
    private void espera() {
        
    }
    
    private void inicia() {
        lista = new ArrayList<>();
        ArrayList<Integer> listaAux = new ArrayList<>();
        listaAux.add(1);
        listaAux.add(2);
        listaAux.add(3);
        lista.add(listaAux);
        listaAux = new ArrayList<>();
        listaAux.add(4);
        listaAux.add(5);
        listaAux.add(6);
        lista.add(listaAux);
        listaAux = new ArrayList<>();
        listaAux.add(7);
        listaAux.add(8);
        listaAux.add(9);
        lista.add(listaAux);
        listaAux = new ArrayList<>();
        listaAux.add(1);
        listaAux.add(4);
        listaAux.add(7);
        lista.add(listaAux);
        listaAux = new ArrayList<>();
        listaAux.add(8);
        listaAux.add(5);
        listaAux.add(2);
        lista.add(listaAux);
        listaAux = new ArrayList<>();
        listaAux.add(3);
        listaAux.add(6);
        listaAux.add(9);
        lista.add(listaAux);
        listaAux = new ArrayList<>();
        listaAux.add(7);
        listaAux.add(5);
        listaAux.add(3);
        lista.add(listaAux);
        listaAux = new ArrayList<>();
        listaAux.add(1);
        listaAux.add(5);
        listaAux.add(9);
        lista.add(listaAux);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lb8 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbTurno = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbmod = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb9.setForeground(new java.awt.Color(240, 240, 240));
        lb9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lb9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb9MouseClicked(evt);
            }
        });
        getContentPane().add(lb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 110, 126));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png"))); // NOI18N
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

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
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 40, 50));

        lb8.setForeground(new java.awt.Color(240, 240, 240));
        lb8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lb8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb8MouseClicked(evt);
            }
        });
        getContentPane().add(lb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 110, 126));

        lb7.setForeground(new java.awt.Color(240, 240, 240));
        lb7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lb7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb7MouseClicked(evt);
            }
        });
        getContentPane().add(lb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 110, 126));

        lb4.setForeground(new java.awt.Color(240, 240, 240));
        lb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lb4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb4MouseClicked(evt);
            }
        });
        getContentPane().add(lb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 110, 126));

        lb5.setForeground(new java.awt.Color(240, 240, 240));
        lb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lb5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb5MouseClicked(evt);
            }
        });
        getContentPane().add(lb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 110, 126));

        lb6.setForeground(new java.awt.Color(240, 240, 240));
        lb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lb6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb6MouseClicked(evt);
            }
        });
        getContentPane().add(lb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 110, 126));

        lb3.setForeground(new java.awt.Color(240, 240, 240));
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lb3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb3MouseClicked(evt);
            }
        });
        getContentPane().add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 110, 126));

        lb2.setForeground(new java.awt.Color(240, 240, 240));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lb2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb2MouseClicked(evt);
            }
        });
        getContentPane().add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 110, 126));

        lb1.setForeground(new java.awt.Color(240, 240, 240));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lb1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb1MouseClicked(evt);
            }
        });
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 110, 126));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cooltext353155636500230.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 40));

        lbTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png"))); // NOI18N
        getContentPane().add(lbTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 50, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cooltext353156428755744.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 210, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cooltext353165479036759.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, 60));

        lbmod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbmod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/med.png"))); // NOI18N
        getContentPane().add(lbmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 60));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cooltext353106914923664.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 240, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ladrillo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MouseClicked
        // 1
        if (init == 0) {
            if (lb1.getIcon() == null) {
                multi(1);
            }
        } else {
            if (lb1.getIcon() == null) {
                lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                lbTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
                jugador_1.add(1);
                verifica_j1();
            }
        }
        

    }//GEN-LAST:event_lb1MouseClicked

    private void lb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2MouseClicked
        // 2
        if (init == 0) {
            if (lb2.getIcon() == null) {
                multi(2);
            }
        } else {
            if (lb2.getIcon() == null) {
                lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                lbTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
                jugador_1.add(2);
                verifica_j1();
            }
        }
    }//GEN-LAST:event_lb2MouseClicked

    private void lb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb3MouseClicked
        // 3
        if (init == 0) {
            if (lb3.getIcon() == null) {
                multi(3);
            }
        } else {
            if (lb3.getIcon() == null) {
                lb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                lbTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
                jugador_1.add(3);
                verifica_j1();
            }
        }
    }//GEN-LAST:event_lb3MouseClicked

    private void lb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb4MouseClicked
        // 4
        if (init == 0) {
            if (lb4.getIcon() == null) {
                multi(4);
            }
        } else {
            if (lb4.getIcon() == null) {
                lb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                lbTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
                jugador_1.add(4);
                verifica_j1();
            }
        }
    }//GEN-LAST:event_lb4MouseClicked

    private void lb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb5MouseClicked
        // 5
        if (init == 0) {
            if (lb5.getIcon() == null) {
                multi(5);
            }
        } else {
            if (lb5.getIcon() == null) {
                lb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                lbTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
                jugador_1.add(5);
                verifica_j1();
            }
        }
    }//GEN-LAST:event_lb5MouseClicked

    private void lb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb6MouseClicked
        // 6
        if (init == 0) {
            if (lb6.getIcon() == null) {
                multi(6);
            }
        } else {
            if (lb6.getIcon() == null) {
                lb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                lbTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
                jugador_1.add(6);
                verifica_j1();
            }
        }
    }//GEN-LAST:event_lb6MouseClicked

    private void lb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb7MouseClicked
        // 7
        if (init == 0) {
            if (lb7.getIcon() == null) {
                multi(7);
            }
        } else {
            if (lb7.getIcon() == null) {
                lb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                lbTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
                jugador_1.add(7);
                verifica_j1();
            }
        }

    }//GEN-LAST:event_lb7MouseClicked

    private void lb8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb8MouseClicked
        // 8
        if (init == 0) {
            if (lb8.getIcon() == null) {
                multi(8);
            }
        } else {
            if (lb8.getIcon() == null) {
                lb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                lbTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
                jugador_1.add(8);
                verifica_j1();
            }
        }
    }//GEN-LAST:event_lb8MouseClicked

    private void lb9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb9MouseClicked
        // 9
        if (init == 0) {
            if (lb9.getIcon() == null) {
                multi(9);
            }
        } else {
            if (lb9.getIcon() == null) {
                lb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/xx.png")));
                lbTurno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/o.png")));
                jugador_1.add(9);
                verifica_j1();
            }
        }
    }//GEN-LAST:event_lb9MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setState(Init.ICONIFIED);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //       abrir facebook
        try {
            Desktop.getDesktop().browse(URI.create("https://www.facebook.com/irvingB9c50"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO CONECTAR A LA RED");
        }
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel lbTurno;
    private javax.swing.JLabel lbmod;
    // End of variables declaration//GEN-END:variables
}
