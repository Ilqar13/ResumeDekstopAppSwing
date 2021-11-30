/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.resume.main;

import com.company.resume.Config;
import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.dao.inter.UserDaoInter;
import com.company.entity1.EmploymentHistory;
import com.company.entity1.User;
import com.company.main.Context;

/**
 *
 * @author ILQAR
 */
public class MainUser extends javax.swing.JFrame {
    
    private UserDaoInter userDao =Context.instanceUserDao();
    private EmploymentHistoryDaoInter employmentHistoryDao=Context.instanceEmploymentHistoryDao();
    public MainUser() {
         User user=(Config.loggedInUser=userDao.getById("6"));
         Config.employmentHistoryAboutUser=employmentHistoryDao.getEmploymentHistoryByUserId(user.getId());
         initComponents();
         fillUserComponents();
         this.detailsPanel.fillUserComponents();
         this.skillsPanel.fillWindow();
         this.employmentHistoryPanel.fillUserComponents();
         this.profilePanel.fillUserComponents();
    }
    
    private void fillUserComponents(){
       User loggedInUser =Config.loggedInUser;
       this.txtName.setText(loggedInUser.getName());
       this.txtSurname.setText(loggedInUser.getSurname());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user1 = new com.company.entity1.User();
        pnlUserInfo = new javax.swing.JPanel();
        txtSurname = new javax.swing.JTextField();
        lblSurname = new javax.swing.JLabel();
        lblName = new java.awt.Label();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        tbPane = new javax.swing.JTabbedPane();
        detailsPanel = new com.company.resume.panel.DetailsPanel();
        profilePanel = new com.company.resume.panel.ProfilePanel();
        skillsPanel = new com.company.resume.panel.SkillsPanel();
        employmentHistoryPanel = new com.company.resume.panel.EmploymentHistoryPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSurname.setToolTipText("txtfld");

        lblSurname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSurname.setText("Surname");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblName.setText("Name");

        txtName.setToolTipText("txtfld");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlUserInfoLayout = new javax.swing.GroupLayout(pnlUserInfo);
        pnlUserInfo.setLayout(pnlUserInfoLayout);
        pnlUserInfoLayout.setHorizontalGroup(
            pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUserInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        pnlUserInfoLayout.setVerticalGroup(
            pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUserInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlUserInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave)
                        .addComponent(lblSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        lblName.getAccessibleContext().setAccessibleName("lbl_name");
        lblName.getAccessibleContext().setAccessibleDescription("");

        tbPane.addTab("tab1", detailsPanel);
        tbPane.addTab("tab2", profilePanel);
        tbPane.addTab("tab3", skillsPanel);
        tbPane.addTab("tab4", employmentHistoryPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnlUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlUserInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbPane, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       try {
       User user =Config.loggedInUser;
       EmploymentHistory employmentHistory=Config.employmentHistoryAboutUser;
       user.setName(txtName.getText());
       user.setSurname(txtSurname.getText());
       this.employmentHistoryDao.updateEmploymentHistory(employmentHistory);
       this.detailsPanel.fillUser(user);
       this.profilePanel.fillUser(user);
       this.employmentHistoryPanel.fillEmploymentHistory(employmentHistory);
       this.employmentHistoryDao.updateEmploymentHistory(employmentHistory);
       this.userDao.updateUser(user);
        } catch (Exception ex) {
            ex.printStackTrace();
           }
    }//GEN-LAST:event_btnSaveActionPerformed

   
      public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUser().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private com.company.resume.panel.DetailsPanel detailsPanel;
    private com.company.resume.panel.EmploymentHistoryPanel employmentHistoryPanel;
    private java.awt.Label lblName;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JPanel pnlUserInfo;
    private com.company.resume.panel.ProfilePanel profilePanel;
    private com.company.resume.panel.SkillsPanel skillsPanel;
    private javax.swing.JTabbedPane tbPane;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSurname;
    private com.company.entity1.User user1;
    // End of variables declaration//GEN-END:variables
}
