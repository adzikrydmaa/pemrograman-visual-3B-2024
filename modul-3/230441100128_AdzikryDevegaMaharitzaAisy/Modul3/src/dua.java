
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author YOSEY
 */
public class dua extends javax.swing.JFrame {

    /**
     * Creates new form dua
     */
    public dua() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane6 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        scrollPane1 = new java.awt.ScrollPane();
        jToolBar2 = new javax.swing.JToolBar();
        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        induk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tagihan = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        januari = new javax.swing.JCheckBox();
        februari = new javax.swing.JCheckBox();
        maret = new javax.swing.JCheckBox();
        april = new javax.swing.JCheckBox();
        mei = new javax.swing.JCheckBox();
        juni = new javax.swing.JCheckBox();
        juli = new javax.swing.JCheckBox();
        agustus = new javax.swing.JCheckBox();
        september = new javax.swing.JCheckBox();
        oktober = new javax.swing.JCheckBox();
        november = new javax.swing.JCheckBox();
        desember = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        batal = new javax.swing.JButton();
        hitung = new javax.swing.JButton();
        keluar = new javax.swing.JButton();
        jumlahspp = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        cek = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable5);

        jToolBar2.setRollover(true);
        scrollPane1.add(jToolBar2);

        jToolBar1.setRollover(true);
        scrollPane1.add(jToolBar1);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        scrollPane1.add(jScrollPane5);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable3);

        scrollPane1.add(jScrollPane4);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        scrollPane1.add(jScrollPane3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        scrollPane1.add(jScrollPane2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("PEMBAYARAN SPP SMPN 2 KRIAN");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nama :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 15, -1, -1));

        jLabel3.setText("No. Induk :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 43, -1, -1));
        jPanel1.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 12, 356, -1));
        jPanel1.add(induk, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 43, 356, -1));

        jLabel6.setText("Tagihan/bulan :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 72, -1, -1));
        jPanel1.add(tagihan, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 69, 356, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 100));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(3, 4));

        januari.setText("JANUARI");
        jPanel3.add(januari);

        februari.setText("FEBRUARI");
        jPanel3.add(februari);

        maret.setText("MARET");
        jPanel3.add(maret);

        april.setText("APRIL");
        jPanel3.add(april);

        mei.setText("MEI");
        jPanel3.add(mei);

        juni.setText("JUNI");
        jPanel3.add(juni);

        juli.setText("JULI");
        jPanel3.add(juli);

        agustus.setText("AGUSTUS");
        jPanel3.add(agustus);

        september.setText("SEPTEMBER");
        jPanel3.add(september);

        oktober.setText("OKTOBER");
        jPanel3.add(oktober);

        november.setText("NOVEMBER");
        jPanel3.add(november);

        desember.setText("DESEMBER");
        jPanel3.add(desember);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 830, 70));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        batal.setBackground(new java.awt.Color(51, 153, 255));
        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        jPanel4.add(batal);

        hitung.setBackground(new java.awt.Color(51, 153, 255));
        hitung.setText("Hitung");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        jPanel4.add(hitung);

        keluar.setBackground(new java.awt.Color(102, 153, 255));
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jPanel4.add(keluar);
        jPanel4.add(jumlahspp);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 353, 830, 70));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("BULAN :");
        jPanel5.add(jLabel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 830, 50));

        jPanel7.setLayout(new java.awt.GridBagLayout());

        cek.setBackground(new java.awt.Color(51, 153, 255));
        cek.setText("Cek");
        cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 9;
        jPanel7.add(cek, gridBagConstraints);

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 830, 30));

        jTable6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "No.Induk", "HUTANG", "STATUS", "JAN", "FEB", "MAR", "APR", "MEI", "JUN", "JUL", "AGS", "SEP", "OKT", "NOV", "DES"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable6);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 830, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Yakin Ingin Keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }// TODO add your handling code here:
    }//GEN-LAST:event_keluarActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        nama.setText("");
        induk.setText("");
        jumlahspp.setText("");
        tagihan.setText("");
        januari.setSelected(false);
        februari.setSelected(false);
        maret.setSelected(false);
        april.setSelected(false);
        mei.setSelected(false);
        juni.setSelected(false);
        juli.setSelected(false);
        agustus.setSelected(false);
        september.setSelected(false);
        oktober.setSelected(false);
        november.setSelected(false);
        desember.setSelected(false);// TODO add your handling code here:
    }//GEN-LAST:event_batalActionPerformed

    private void cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekActionPerformed
        if (nama.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi nama terlebih dahulu!!", "Peringatan !!!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (induk.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isi no induk terlebih dahulu!!", "Peringatan !!!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!januari.isSelected() && !februari.isSelected() && !maret.isSelected() && !april.isSelected()
            && !mei.isSelected() && !juni.isSelected() && !juli.isSelected() && !agustus.isSelected()
            && !september.isSelected() && !oktober.isSelected() && !november.isSelected() && !desember.isSelected()) {
            JOptionPane.showMessageDialog(this, "Pilihlah antara satu bulan atau lebih", "Peringatan!!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (tagihan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Isikan nominal pembayaran SPP terlebih dahulu", "Peringatan!!", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            DefaultTableModel model = (DefaultTableModel) jTable6.getModel();
            String Nama = nama.getText();
            String Status = "MENUNGGAK";
            int bayar = Integer.parseInt(tagihan.getText());

            int Bulan = 0;

            if (januari.isSelected()) {
                Bulan = Bulan + 1;
            }
            if (februari.isSelected()) {
                Bulan = Bulan + 1;
            }
            if (maret.isSelected()) {
                Bulan = Bulan + 1;
            }
            if (april.isSelected()) {
                Bulan = Bulan + 1;
            }
            if (mei.isSelected()) {
                Bulan = Bulan + 1;
            }
            if (juni.isSelected()) {
                Bulan = Bulan + 1;
            }
            if (juli.isSelected()) {
                Bulan = Bulan + 1;
            }
            if (agustus.isSelected()) {
                Bulan = Bulan + 1;
            }
            if (september.isSelected()) {
                Bulan = Bulan + 1;
            }
            if (oktober.isSelected()) {
                Bulan = Bulan + 1;
            }
            if (november.isSelected()) {
                Bulan = Bulan + 1;
            }
            if (desember.isSelected()) {
                Bulan = Bulan + 1;
            }

            if (Bulan == 12) {
                Status = "LUNAS";
            }

            int hutang = bayar * (12 - Bulan);

            Object[] rowData = new Object[16]; //menyimpan data 
            rowData[0] = nama.getText();
            rowData[1] = induk.getText();
            rowData[2] = hutang;
            rowData[3] = Status;
            rowData[4] = januari.isSelected();
            rowData[5] = februari.isSelected();
            rowData[6] = maret.isSelected();
            rowData[7] = april.isSelected();
            rowData[8] = mei.isSelected();
            rowData[9] = juni.isSelected();
            rowData[10] = juli.isSelected();
            rowData[11] = agustus.isSelected();
            rowData[12] = september.isSelected();
            rowData[13] = oktober.isSelected();
            rowData[14] = november.isSelected();
            rowData[15] = desember.isSelected();

            model.addRow(rowData);

            JOptionPane.showMessageDialog(this, "Data Berhasil", "SUKSES", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "FORMAT TIDAK SESUAI", "ERROR!!", JOptionPane.ERROR_MESSAGE);
        }// TODO add your handling code here:
    }//GEN-LAST:event_cekActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        int spp = Integer.parseInt(tagihan.getText());
        int hutang = 0;
        if (!januari.isSelected()) {
            hutang++;
        }
        if (!februari.isSelected()) {
            hutang++;
        }
        if (!maret.isSelected()) {
            hutang++;
        }
        if (!april.isSelected()) {
            hutang++;
        }
        if (!mei.isSelected()) {
            hutang++;
        }
        if (!juni.isSelected()) {
            hutang++;
        }
        if (!juli.isSelected()) {
            hutang++;
        }
        if (!agustus.isSelected()) {
            hutang++;
        }
        if (!september.isSelected()) {
            hutang++;
        }
        if (!oktober.isSelected()) {
            hutang++;
        }
        if (!november.isSelected()) {
            hutang++;
        }
        if (!desember.isSelected()) {
            hutang++;
        }

        jumlahspp.setText(String.valueOf(hutang * spp));
    }//GEN-LAST:event_hitungActionPerformed

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
            java.util.logging.Logger.getLogger(dua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agustus;
    private javax.swing.JCheckBox april;
    private javax.swing.JButton batal;
    private javax.swing.JButton cek;
    private javax.swing.JCheckBox desember;
    private javax.swing.JCheckBox februari;
    private javax.swing.JButton hitung;
    private javax.swing.JTextField induk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JCheckBox januari;
    private javax.swing.JCheckBox juli;
    private javax.swing.JTextField jumlahspp;
    private javax.swing.JCheckBox juni;
    private javax.swing.JButton keluar;
    private javax.swing.JCheckBox maret;
    private javax.swing.JCheckBox mei;
    private javax.swing.JTextField nama;
    private javax.swing.JCheckBox november;
    private javax.swing.JCheckBox oktober;
    private java.awt.ScrollPane scrollPane1;
    private javax.swing.JCheckBox september;
    private javax.swing.JTextField tagihan;
    // End of variables declaration//GEN-END:variables
}
