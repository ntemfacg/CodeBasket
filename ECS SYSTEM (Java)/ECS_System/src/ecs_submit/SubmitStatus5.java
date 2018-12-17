package ecs_submit;

import ecs_system.welcomeTemp;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SubmitStatus5 extends javax.swing.JFrame {
    
    SubmitRepoImpl s = new SubmitRepoImpl();
            
    String connectionURL = "jdbc:derby://localhost:1527/COURSEWORK";
    String uName = "jey";
    String uPass = "123";
    String content1 = "";
    int ref = 0;


    public SubmitStatus5() {
        initComponents();
    }

    public SubmitStatus5(String content, int ref) {
        initComponents();
        content1 = content;
        this.ref = ref;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SIDnum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        duedate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        duedate1 = new javax.swing.JTextField();
        duedate2 = new javax.swing.JTextField();
        duedate3 = new javax.swing.JTextField();
        duedate4 = new javax.swing.JTextField();
        duedate5 = new javax.swing.JTextField();
        duedate6 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        duedate7 = new javax.swing.JTextField();
        download = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        viewRef = new javax.swing.JButton();

        SIDnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIDnumActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coursework Submission");
        setLocation(new java.awt.Point(350, 130));

        jLabel3.setText("Submission status:");

        jLabel4.setText("Grading status:");

        jLabel5.setText("Last modified:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Assignment submission");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("   Refer to assignment brief for detailed requiements ");
        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Due date :");

        duedate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        duedate.setText("2016-12-15");
        duedate.setBorder(null);
        duedate.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        duedate.setEnabled(false);
        duedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duedateActionPerformed(evt);
            }
        });

        jLabel10.setText("Time remaining :");

        jLabel11.setText("Attempt number:");

        jLabel12.setText("Submission comments:");

        duedate1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        duedate1.setText("This is attempt 1.");
        duedate1.setBorder(null);
        duedate1.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        duedate1.setEnabled(false);
        duedate1.setOpaque(false);
        duedate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duedate1ActionPerformed(evt);
            }
        });

        duedate2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        duedate2.setText("Submitted for grading");
        duedate2.setBorder(null);
        duedate2.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        duedate2.setEnabled(false);
        duedate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duedate2ActionPerformed(evt);
            }
        });

        duedate3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        duedate3.setText("Not graded");
        duedate3.setBorder(null);
        duedate3.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        duedate3.setEnabled(false);
        duedate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duedate3ActionPerformed(evt);
            }
        });

        duedate4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        duedate4.setText("25-11-2016_16:56:49");
        duedate4.setBorder(null);
        duedate4.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        duedate4.setEnabled(false);
        duedate4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duedate4ActionPerformed(evt);
            }
        });

        duedate5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        duedate5.setForeground(new java.awt.Color(0, 204, 255));
        duedate5.setText("Comments (0)");
        duedate5.setBorder(null);
        duedate5.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        duedate5.setEnabled(false);
        duedate5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duedate5ActionPerformed(evt);
            }
        });

        duedate6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        duedate6.setText("0 Days, 0 hours ");
        duedate6.setBorder(null);
        duedate6.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        duedate6.setEnabled(false);
        duedate6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duedate6ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Submission status");

        jLabel8.setText("File Submission:");

        duedate7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        duedate7.setText("Coursework.doc");
        duedate7.setBorder(null);
        duedate7.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        duedate7.setEnabled(false);
        duedate7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duedate7ActionPerformed(evt);
            }
        });

        download.setBackground(new java.awt.Color(153, 183, 181));
        download.setText("Download Submission");
        download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 183, 181));
        jButton3.setText("Return");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        viewRef.setBackground(new java.awt.Color(153, 183, 181));
        viewRef.setText("View Ref Num");
        viewRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(duedate6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(duedate2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(duedate3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(duedate, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(duedate4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(duedate7, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(duedate1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(download)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(viewRef)))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(42, 42, 42)
                                .addComponent(duedate5, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(317, 317, 317)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(duedate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(duedate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(duedate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(duedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(duedate6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(duedate4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(duedate7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(download, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewRef, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(duedate5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void duedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duedateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duedateActionPerformed

    private void duedate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duedate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duedate1ActionPerformed

    private void duedate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duedate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duedate2ActionPerformed

    private void duedate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duedate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duedate3ActionPerformed

    private void duedate4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duedate4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duedate4ActionPerformed

    private void duedate5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duedate5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duedate5ActionPerformed

    private void duedate6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duedate6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duedate6ActionPerformed

    private void SIDnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIDnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SIDnumActionPerformed

    private void duedate7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duedate7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_duedate7ActionPerformed

    private void downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadActionPerformed
        StudentController s = new StudentController();
        s.downloadCoversheet(content1);
        JOptionPane.showMessageDialog(null, "Coursework downloaded successfully!!", "Downloaded", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_downloadActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JFrame Window7 = new welcomeTemp();
        Window7.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void viewRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRefActionPerformed

        DigitalReceipt z = new DigitalReceipt(ref);
        z.setVisible(true);
    }//GEN-LAST:event_viewRefActionPerformed

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
            java.util.logging.Logger.getLogger(SubmitStatus5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubmitStatus5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubmitStatus5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubmitStatus5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubmitStatus5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SIDnum;
    private javax.swing.JButton download;
    private javax.swing.JTextField duedate;
    private javax.swing.JTextField duedate1;
    private javax.swing.JTextField duedate2;
    private javax.swing.JTextField duedate3;
    private javax.swing.JTextField duedate4;
    private javax.swing.JTextField duedate5;
    private javax.swing.JTextField duedate6;
    private javax.swing.JTextField duedate7;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton viewRef;
    // End of variables declaration//GEN-END:variables
}
