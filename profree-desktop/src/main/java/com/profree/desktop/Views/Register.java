/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.profree.desktop.Views;

import com.formdev.flatlaf.FlatClientProperties;
import java.beans.PropertyVetoException;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Hanif
 */
public class Register extends javax.swing.JInternalFrame {

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
        
        JenisKelamin.add(LakiLaki);
        JenisKelamin.add(Perempuan);
        
        JenisAkun.add(Freelancer);
        JenisAkun.add(ProjectManager);
        
        try {
            this.setMaximum(true);
            BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
            bi.setNorthPane(null);
            sandi.putClientProperty( FlatClientProperties.STYLE, "showRevealButton: true" );
        } catch (PropertyVetoException e) {}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JenisKelamin = new javax.swing.ButtonGroup();
        JenisAkun = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        sandi = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        masuk = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        LakiLaki = new javax.swing.JRadioButton();
        Perempuan = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        ProjectManager = new javax.swing.JRadioButton();
        Freelancer = new javax.swing.JRadioButton();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel1.setBackground(new java.awt.Color(253, 255, 252));

        jPanel2.setBackground(new java.awt.Color(253, 255, 252));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/illustration.png"))); // NOI18N
        jPanel2.add(jLabel1, new java.awt.GridBagConstraints());

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setBackground(new java.awt.Color(253, 255, 252));
        jPanel4.setPreferredSize(new java.awt.Dimension(280, 415));

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel3.setText("Sandi");

        email.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        sandi.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Masuk");

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel4.setText("Profree");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setText("Sudah punya akun?");

        masuk.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        masuk.setForeground(new java.awt.Color(0, 102, 255));
        masuk.setText("masuk");
        masuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        masuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masukMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel6.setText("Nama");

        nama.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel7.setText("Jenis Akun");

        LakiLaki.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        LakiLaki.setText("Laki - Laki");

        Perempuan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Perempuan.setText("Perempuan");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jLabel8.setText("Jenis Kelamin");

        ProjectManager.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ProjectManager.setText("Project Manager");

        Freelancer.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Freelancer.setText("Freelancer");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(masuk))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Freelancer)
                                .addGap(18, 18, 18)
                                .addComponent(ProjectManager))
                            .addComponent(jLabel7)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(LakiLaki)
                                .addGap(18, 18, 18)
                                .addComponent(Perempuan))
                            .addComponent(jLabel8)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sandi)
                                    .addComponent(nama)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sandi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LakiLaki)
                    .addComponent(Perempuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Freelancer)
                    .addComponent(ProjectManager))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(masuk))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masukMouseClicked
        // TODO add your handling code here:
        Main.konten.removeAll();
        Login login = new Login();
        login.setVisible(true);
        Main.konten.add(login);
    }//GEN-LAST:event_masukMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Freelancer;
    private javax.swing.ButtonGroup JenisAkun;
    private javax.swing.ButtonGroup JenisKelamin;
    private javax.swing.JRadioButton LakiLaki;
    private javax.swing.JRadioButton Perempuan;
    private javax.swing.JRadioButton ProjectManager;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel masuk;
    private javax.swing.JTextField nama;
    private javax.swing.JPasswordField sandi;
    // End of variables declaration//GEN-END:variables
}