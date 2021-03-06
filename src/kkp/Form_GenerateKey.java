/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kkp;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Form_GenerateKey extends javax.swing.JFrame {
    
    BigInteger g,p,x;
    ImageIcon img;

   
    public Form_GenerateKey() {
        initComponents();
        img = new ImageIcon("src/gambar/logo.jpg");
        setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtP = new javax.swing.JTextField();
        txtG = new javax.swing.JTextField();
        txtX = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSave = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        btngenerate = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Form Generate Key");

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/MAN 12 Jakarta.jpg"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nilai P                  :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 112, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nilai G                  :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nilai X                  :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));
        jPanel3.add(txtP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 323, -1));
        jPanel3.add(txtG, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 323, -1));
        jPanel3.add(txtX, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 321, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tempat Simpan  :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 114, -1));
        jPanel3.add(txtSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 320, -1));

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/save2.png"))); // NOI18N
        btnsave.setText("Simpan");
        btnsave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nama Kunci         :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));
        jPanel3.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 322, -1));

        btngenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/key-icon.png"))); // NOI18N
        btngenerate.setText("Generate");
        btngenerate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btngenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerateActionPerformed(evt);
            }
        });

        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/clear2.png"))); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/cancel-icon2.png"))); // NOI18N
        btnkeluar.setText("Kembali");
        btnkeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(btngenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnhapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (!(txtNama.getText().equals(""))) {
            try {
                JFileChooser savedata = new JFileChooser("D:\\");
                    savedata.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                    int returnVal = savedata.showSaveDialog(null);
                    if (returnVal == JFileChooser.APPROVE_OPTION) {

                        txtSave.setText(savedata.getSelectedFile().toString());
                    }
                } catch (Exception e) {
                }
            } else if(txtG.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Silahkan Isi Form Terlebih Dahulu!", "Attention", JOptionPane.ERROR_MESSAGE);
                 txtG.requestFocus();
            }else if(txtP.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Silahkan Isi Form Terlebih Dahulu!", "Attention", JOptionPane.ERROR_MESSAGE);
                 txtP.requestFocus();
            }else if(txtX.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Silahkan Isi Form Terlebih Dahulu!", "Attention", JOptionPane.ERROR_MESSAGE);
                 txtX.requestFocus();
             }else {
                JOptionPane.showMessageDialog(null, "Silahkan Isi Form Terlebih Dahulu!", "Attention", JOptionPane.ERROR_MESSAGE);
                 txtNama.requestFocus();
            }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
        // TODO add your handling code here:
        MenuUtama menu;
        try {
            menu = new MenuUtama();
            menu.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Form_GenerateKey.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        txtNama.setText("");
        txtP.setText("");
        txtG.setText("");
        txtX.setText("");
        txtSave.setText("");
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btngenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerateActionPerformed
        // TODO add your handling code here:
            
//========= Warning - an kosong =======================================================        
        if(txtNama.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nama Kunci Tidak Boleh Kosong", "Attention", JOptionPane.ERROR_MESSAGE);
                 txtNama.requestFocus();
            }else if(txtG.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nilai G Tidak Boleh Kosong", "Attention", JOptionPane.ERROR_MESSAGE);
                 txtG.requestFocus();
            }else if(txtP.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nilai P Tidak Boleh Kosong", "Attention", JOptionPane.ERROR_MESSAGE);
                 txtP.requestFocus();
            }else if(txtX.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Nilai X Tidak Boleh Kosong", "Attention", JOptionPane.ERROR_MESSAGE);
                 txtX.requestFocus();
             }else if(txtSave.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Pilih Tempat Simpan Terlebih Dahulu", "Attention", JOptionPane.ERROR_MESSAGE);
                 txtSave.requestFocus();
            }else{
        
         g = new BigInteger(txtG.getText());
         x = new BigInteger(txtX.getText());
         p = new BigInteger(txtP.getText()); 
         
           if(p.intValue() < 255){
                JOptionPane.showMessageDialog(null, "Nilai P Harus Lebih Dari 255");
                txtP.requestFocus();
            }else if(p.intValue() %2 == 0 || p.intValue() % 3==0){
                JOptionPane.showMessageDialog(null, "Nilai P Harus Bilangan Prima", "Attention", JOptionPane.ERROR_MESSAGE);
                txtP.requestFocus();
            }else if(g.intValue() <= 1){
                JOptionPane.showMessageDialog(null, "Nilai G Harus Lebih Dari 1");
                txtG.requestFocus();
            }else if(g.intValue() > p.intValue() - 1){
                JOptionPane.showMessageDialog(null, "Nilai G Harus Kurang Dari Nilai P");
                txtG.requestFocus();
            }else if(x.intValue() < 1 || x.intValue() > p.intValue()- 2){
                JOptionPane.showMessageDialog(null, "Nilai X Harus Kurang Dari Nilai P - 1");
                txtX.requestFocus();
            }else  {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                      
                Hitung_Kunci keyGen = new Hitung_Kunci();
                keyGen.setId(txtNama.getText());
                keyGen.setDir(txtSave.getText() + "\\"); 
                String totalWaktu;
                long start, end;
                 try {   
                     txtG.setEnabled(false);
                     txtNama.setEnabled(false);
                     txtP.setEnabled(false);
                     txtSave.setEnabled(false);
                     txtX.setEnabled(false);
                     btngenerate.setEnabled(false);
                     btnhapus.setEnabled(false);
                     btnkeluar.setEnabled(false);
                     btnsave.setEnabled(false);
                      start = System.currentTimeMillis();
                      keyGen.createpublic(p, g, x);
                      keyGen.createprivate(p, x);
                      end = System.currentTimeMillis();
                      totalWaktu = String.valueOf((end-start)/10000.0);
                      JOptionPane.showMessageDialog(null, "Proses Generate Key Sudah Selesai Dengan Waktu "+totalWaktu+" Detik" 
                                , "PESAN", JOptionPane.INFORMATION_MESSAGE);
                      clear();
                      txtG.setEnabled(true);
                     txtNama.setEnabled(true);
                     txtP.setEnabled(true);
                     txtSave.setEnabled(true);
                     txtX.setEnabled(true);
                     btngenerate.setEnabled(true);
                     btnhapus.setEnabled(true);
                     btnkeluar.setEnabled(true);
                     btnsave.setEnabled(true);
                 } catch (Exception ex) {
                     JOptionPane.showMessageDialog(null, "Proses Gagal", "Attention", JOptionPane.ERROR_MESSAGE);
                     clear();
                      }
                            
                    }
                });
        
                thread.start();
            }}
    }//GEN-LAST:event_btngenerateActionPerformed

    public void clear(){
        txtNama.setText("");
        txtSave.setText("");
        txtP.setText("");
        txtG.setText("");
        txtX.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(Form_GenerateKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_GenerateKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_GenerateKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_GenerateKey.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_GenerateKey().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngenerate;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtG;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtP;
    private javax.swing.JTextField txtSave;
    private javax.swing.JTextField txtX;
    // End of variables declaration//GEN-END:variables
}
