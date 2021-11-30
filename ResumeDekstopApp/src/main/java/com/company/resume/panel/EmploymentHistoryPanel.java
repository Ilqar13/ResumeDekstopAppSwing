/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.resume.panel;

import com.company.dao.inter.EmploymentHistoryDaoInter;
import com.company.entity1.EmploymentHistory;
import com.company.entity1.User;
import com.company.main.Context;
import java.sql.Date;
import java.time.LocalDate;
import com.company.resume.Config;
import static com.company.resume.Config.loggedInUser;

/**
 *
 * @author ILQAR
 */
public class EmploymentHistoryPanel extends javax.swing.JPanel {

private EmploymentHistoryDaoInter employmentHistoryDao =Context.instanceEmploymentHistoryDao();
private EmploymentHistory emloymentHistory=null;
        
    public EmploymentHistoryPanel() {
      initComponents();
      
    }
    
     public void fillUserComponents(){
       EmploymentHistory employmentHistory =employmentHistoryDao.getEmploymentHistoryByUserId(Config.loggedInUser.getId());
       this.txtHeader.setText(employmentHistory.getHeader());
       this.txtBeginDate.setText(employmentHistory.getBeginDate().toString());
       this.txtEndDate.setText(employmentHistory.getEndDate().toString());
       this.txtJobDescription.setText(employmentHistory.getJobDescription());
          }
  public void fillEmploymentHistory(EmploymentHistory employmentHistory){
      employmentHistory.setHeader(this.txtHeader.getText());
      employmentHistory.setBeginDate(Date.valueOf(this.txtBeginDate.getText()));
      employmentHistory.setEndDate(Date.valueOf(this.txtEndDate.getText()));
      employmentHistory.setJobDescription(this.txtJobDescription.getText());
      }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        pnlEmployementHistory = new javax.swing.JPanel();
        txtBeginDate = new javax.swing.JTextField();
        txtHeader = new javax.swing.JTextField();
        txtEndDate = new javax.swing.JTextField();
        txtJobDescription = new javax.swing.JTextField();
        lblHeader = new javax.swing.JLabel();
        lblJobDescription = new javax.swing.JLabel();
        lblEndDate = new javax.swing.JLabel();
        lblBeginDate = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        txtBeginDate.setText("jTextField1");

        txtHeader.setText("jTextField1");

        txtEndDate.setText("jTextField1");

        txtJobDescription.setText("jTextField1");

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHeader.setText("Header");

        lblJobDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblJobDescription.setText("Job Description");

        lblEndDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEndDate.setText("End Date");

        lblBeginDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblBeginDate.setText("Begin Date");

        javax.swing.GroupLayout pnlEmployementHistoryLayout = new javax.swing.GroupLayout(pnlEmployementHistory);
        pnlEmployementHistory.setLayout(pnlEmployementHistoryLayout);
        pnlEmployementHistoryLayout.setHorizontalGroup(
            pnlEmployementHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployementHistoryLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlEmployementHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEmployementHistoryLayout.createSequentialGroup()
                        .addGroup(pnlEmployementHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblJobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(pnlEmployementHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtJobDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addComponent(txtEndDate)))
                    .addGroup(pnlEmployementHistoryLayout.createSequentialGroup()
                        .addGroup(pnlEmployementHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBeginDate, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(pnlEmployementHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBeginDate)
                            .addComponent(txtHeader))))
                .addContainerGap())
        );
        pnlEmployementHistoryLayout.setVerticalGroup(
            pnlEmployementHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployementHistoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEmployementHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEmployementHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBeginDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBeginDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEmployementHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEmployementHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJobDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(lblJobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlEmployementHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(pnlEmployementHistory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblBeginDate;
    private javax.swing.JLabel lblEndDate;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblJobDescription;
    private javax.swing.JPanel pnlEmployementHistory;
    private javax.swing.JTextField txtBeginDate;
    private javax.swing.JTextField txtEndDate;
    private javax.swing.JTextField txtHeader;
    private javax.swing.JTextField txtJobDescription;
    // End of variables declaration//GEN-END:variables
}
