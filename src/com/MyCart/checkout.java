/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.MyCart;

import javax.swing.JOptionPane;

/**
 *
 * @author Ibrahim Saputra
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class checkout extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    Connection cn = koneksi.DatabaseMyCart.bukakoneksi();
    public checkout() {
        initComponents();
        username_checkout.setText(register.username);
        alamatfield.setText("");
        tampilbayar();
    }
    
    private void tampilbayar() {
        try {
            st = cn.createStatement();
            String bayar = "SELECT SUM(Harga) FROM cart";
            rs = st.executeQuery(bayar);
            while(rs.next()) {
                 String data = rs.getString("SUM(Harga)");
                   field_bayar.setText(data);
            }
            
        }catch (Exception e) {
        
        }
    }
    
    // variable alamat buat load
    public static String savealamat;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit_cart = new javax.swing.JLabel();
        minimize_cart = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username_checkout = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BackToMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        alamatfield = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Cash = new javax.swing.JButton();
        Gopay = new javax.swing.JButton();
        OVO = new javax.swing.JButton();
        Dana = new javax.swing.JButton();
        warning = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        field_bayar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 510));
        setUndecorated(true);
        setSize(new java.awt.Dimension(730, 510));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        exit_cart.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        exit_cart.setText("X");
        exit_cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_cartMouseClicked(evt);
            }
        });

        minimize_cart.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        minimize_cart.setText("-");
        minimize_cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize_cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_cartMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("Belanja kapan saja, dimana saja");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(546, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(minimize_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit_cart)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimize_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 60);

        username_checkout.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        getContentPane().add(username_checkout);
        username_checkout.setBounds(50, 80, 150, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user (1).png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 60, 40, 60);

        BackToMenu.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        BackToMenu.setText("Back");
        BackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToMenuActionPerformed(evt);
            }
        });
        getContentPane().add(BackToMenu);
        BackToMenu.setBounds(70, 440, 70, 21);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel1.setText("Masukan Alamat :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 140, 180, 30);

        alamatfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        alamatfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatfieldActionPerformed(evt);
            }
        });
        getContentPane().add(alamatfield);
        alamatfield.setBounds(240, 140, 420, 30);

        jPanel2.setBackground(new java.awt.Color(253, 234, 223));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 204), 3, true));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel5.setText("Pembayaran");

        Cash.setText("Cash");
        Cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashActionPerformed(evt);
            }
        });

        Gopay.setText("Gopay");
        Gopay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GopayActionPerformed(evt);
            }
        });

        OVO.setText("OVO");
        OVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OVOActionPerformed(evt);
            }
        });

        Dana.setText("Dana");
        Dana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DanaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(Cash)
                        .addGap(64, 64, 64)
                        .addComponent(Gopay)
                        .addGap(64, 64, 64)
                        .addComponent(OVO)
                        .addGap(64, 64, 64)
                        .addComponent(Dana))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cash)
                    .addComponent(Gopay)
                    .addComponent(OVO)
                    .addComponent(Dana))
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(70, 230, 590, 160);

        warning.setFont(new java.awt.Font("Bahnschrift", 2, 14)); // NOI18N
        warning.setForeground(new java.awt.Color(255, 0, 0));
        warning.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(warning);
        warning.setBounds(240, 180, 290, 20);

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel4.setText("Total :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(500, 440, 60, 30);

        field_bayar.setEditable(false);
        field_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_bayarActionPerformed(evt);
            }
        });
        getContentPane().add(field_bayar);
        field_bayar.setBounds(550, 440, 100, 22);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Picsart_22-07-22_22-59-34-795.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-40, 0, 770, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_cartMouseClicked
        // Exit
        System.exit(0);
    }//GEN-LAST:event_exit_cartMouseClicked

    private void minimize_cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_cartMouseClicked
        // minimize
        this.setState(1);
    }//GEN-LAST:event_minimize_cartMouseClicked

    private void BackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToMenuActionPerformed
        // back to menu
        menu menu = new menu();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(cart.DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_BackToMenuActionPerformed

    private void alamatfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatfieldActionPerformed

    private void CashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashActionPerformed
        // pembayaran pakai cash
        if (alamatfield.getText().equals("")) {
            warning.setText("Isi Alamat Terlebih Dahulu");
        }
        else {
        savealamat = alamatfield.getText();
        int response = JOptionPane.showConfirmDialog(this,"Apakah anda yakin ingin melakukan pembayaran?",
                        "Konfirmasi Pembayaran",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION) {
            
                load ld = new load();
                ld.setVisible(true);
                ld.pack();
                ld.setLocationRelativeTo(null);
                this.dispose();
            }    
        }         
    }//GEN-LAST:event_CashActionPerformed

    private void GopayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GopayActionPerformed
        // pembayaran pakai gopay
        if (alamatfield.getText().equals("")) {
            warning.setText("Isi Alamat Terlebih Dahulu");
        }
        else {
        savealamat = alamatfield.getText();
        int response = JOptionPane.showConfirmDialog(this,"Apakah anda yakin ingin melakukan pembayaran?",
                        "Konfirmasi Pembayaran",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION) {
           
                load ld = new load();
                ld.setVisible(true);
                ld.pack();
                ld.setLocationRelativeTo(null);
                this.dispose();
            }    
        }         
    }//GEN-LAST:event_GopayActionPerformed

    private void OVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OVOActionPerformed
        // pembayaran pakai ovo
        if (alamatfield.getText().equals("")) {
            warning.setText("Isi Alamat Terlebih Dahulu");
        }
        else {
        savealamat = alamatfield.getText();
        int response = JOptionPane.showConfirmDialog(this,"Apakah anda yakin ingin melakukan pembayaran?",
                        "Konfirmasi Pembayaran",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION) {
           
                load ld = new load();
                ld.setVisible(true);
                ld.pack();
                ld.setLocationRelativeTo(null);
                this.dispose();
            }    
        }         
    }//GEN-LAST:event_OVOActionPerformed

    private void DanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DanaActionPerformed
        // pembayaran pakai dana
        if (alamatfield.getText().equals("")) {
            warning.setText("Isi Alamat Terlebih Dahulu");
        }
        else {
        savealamat = alamatfield.getText();
        int response = JOptionPane.showConfirmDialog(this,"Apakah anda yakin ingin melakukan pembayaran?",
                        "Konfirmasi Pembayaran",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION) {
           
                load ld = new load();
                ld.setVisible(true);
                ld.pack();
                ld.setLocationRelativeTo(null);
                this.dispose();
            }    
        }         
    }//GEN-LAST:event_DanaActionPerformed

    private void field_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_field_bayarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToMenu;
    private javax.swing.JButton Cash;
    private javax.swing.JButton Dana;
    private javax.swing.JButton Gopay;
    private javax.swing.JButton OVO;
    private javax.swing.JTextField alamatfield;
    private javax.swing.JLabel exit_cart;
    public javax.swing.JTextField field_bayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel minimize_cart;
    private javax.swing.JLabel username_checkout;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
