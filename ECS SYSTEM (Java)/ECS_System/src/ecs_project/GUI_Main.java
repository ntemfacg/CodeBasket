package ecs_project;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class GUI_Main extends javax.swing.JFrame {

    //All the GUI panels are initialized to handle navigation of the user interfaces.
    CourseworkController control = new CourseworkController();
    GUI_Update u = new GUI_Update();
    GUI_Remove r = new GUI_Remove();
    GUI_Add a = new GUI_Add();
    GUI_Generate g = new GUI_Generate();

    public GUI_Main() {
        initComponents();
        TextArea.setEnabled(false);
        //All the existing coursework objects are displayed on a text area for users to see.
        for (int i = 0; i < control.getCourseworkList().size(); i++) {
            TextArea.append(control.getCourseworkList().get(i).toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UpdateBtn = new javax.swing.JButton();
        RemoveBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        GenerateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        UpdateBtn.setBackground(new java.awt.Color(102, 102, 255));
        UpdateBtn.setText("Update Coursework");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        RemoveBtn.setBackground(new java.awt.Color(102, 102, 255));
        RemoveBtn.setText("Remove Coursework");
        RemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveBtnActionPerformed(evt);
            }
        });

        AddBtn.setBackground(new java.awt.Color(102, 102, 255));
        AddBtn.setText("Add Coursework");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        TextArea.setBackground(new java.awt.Color(243, 229, 243));
        TextArea.setColumns(20);
        TextArea.setRows(5);
        TextArea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(TextArea);

        GenerateBtn.setBackground(new java.awt.Color(102, 102, 255));
        GenerateBtn.setText("Generate Coversheet");
        GenerateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RemoveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GenerateBtn)
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AddBtn, RemoveBtn, UpdateBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(RemoveBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(GenerateBtn))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AddBtn, RemoveBtn, UpdateBtn});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        //if the update button is pressed, the current GUI_MAIN gets closed and opens the GUI_UPDATE.
        setVisible(false);
        u.setVisible(true);
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void RemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveBtnActionPerformed
        //if the remove button is pressed, the current GUI_MAIN gets closed and opens the GUI_REMOVE. 
        setVisible(false);
        r.setVisible(true);
    }//GEN-LAST:event_RemoveBtnActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        //if the add button is pressed, the current GUI_MAIN gets closed and opens the GUI_ADD.
        setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_AddBtnActionPerformed

    private void GenerateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateBtnActionPerformed
        //if the generate button is pressed, the current GUI_MAIN gets closed and opens the GUI_GENERATE.
        setVisible(false);
        g.setVisible(true);
    }//GEN-LAST:event_GenerateBtnActionPerformed
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
            java.util.logging.Logger.getLogger(GUI_Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton GenerateBtn;
    private javax.swing.JButton RemoveBtn;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
   private void close() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }
}
