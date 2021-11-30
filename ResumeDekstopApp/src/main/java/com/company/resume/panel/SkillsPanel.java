/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.resume.panel;

import com.company.dao.inter.SkillDaoInter;
import com.company.dao.inter.UserSkillDaoInter;
import com.company.entity1.Skill;
import com.company.entity1.UserSkill;
import com.company.main.Context;
import com.company.resume.Config;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ILQAR
 */
public class SkillsPanel extends javax.swing.JPanel {

  private SkillDaoInter skillDao =Context.instanceSkillDao();
  private UserSkillDaoInter userSkillDao=Context.instanceUserSkillDao();
  private DefaultTableModel model;
  private List<UserSkill> list;
    public SkillsPanel() {
        initComponents();
    }
    
    public void fillWindow(){
    List<Skill> skills=skillDao.getAllSkill();
       for (Skill s: skills) {
           System.out.println(s.getId());
           this.cbSkill.addItem(s);
       }
       fillTable();
   }
    
     private void fillTable() {
         this.list=userSkillDao.getAllSkillByUserId(Config.loggedInUser.getId());
         Vector<Vector> rows=new Vector<>();
         for(UserSkill l: list){
             Vector<Object> row=new Vector<>();
             row.add(l.getSkill());
             row.add(l.getPower());
             rows.add(row);
         }
          Vector<String> columns=new Vector<>();
          columns.add("Skill");
          columns.add("Power");
         tblSkills.setModel(this.model=new DefaultTableModel(rows,columns));
        }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSkills = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblSkills = new javax.swing.JLabel();
        lblPower = new javax.swing.JLabel();
        sldrPower = new javax.swing.JSlider();
        cbSkill = new javax.swing.JComboBox<>();
        txtSkillName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAddSkill = new javax.swing.JButton();

        tblSkills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblSkills);

        lblSkills.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblSkills.setText("skill:");

        lblPower.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPower.setText("power:");

        sldrPower.setValue(1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NewSkill:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPower)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sldrPower, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSkillName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSkills, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbSkill)
                        .addComponent(lblPower))
                    .addComponent(sldrPower, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSkillName)
                        .addComponent(jLabel1))))
        );

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("-");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAddSkill.setText("Add Skill");
        btnAddSkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSkillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(btnAddSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddSkill, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
     Skill skill=(Skill) tblSkills.getValueAt(this.tblSkills.getSelectedRow(),this.tblSkills.getSelectedColumn());
     userSkillDao.removeUserSkill(new UserSkill(0,Config.loggedInUser,skill,0));
     this.model.removeRow(this.tblSkills.getSelectedRow());
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Skill selectedSkill=(Skill) this.cbSkill.getSelectedItem();
        if(this.userSkillDao.checkUserSkill(Config.loggedInUser.getId(),selectedSkill.getId())){
            userSkillDao.insertUserSkill(new UserSkill(0,Config.loggedInUser,selectedSkill,this.sldrPower.getValue()));
            model.addRow(new <String>Vector(Arrays.asList(selectedSkill.getName(),String.valueOf(sldrPower.getValue()))));
        }else{
            userSkillDao.updateUserPower(this.sldrPower.getValue(),Config.loggedInUser.getId(),selectedSkill.getId());
             fillTable();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnAddSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSkillActionPerformed
        int id=skillDao.countSkill();
        if(!txtSkillName.getText().isEmpty()){
           while(true){
               if(skillDao.checkId(id))
                   break;
               else
                   id++;
           }
               Skill newSkill= new Skill(id,this.txtSkillName.getText());
               skillDao.insertSkill(newSkill);
               this.cbSkill.addItem(newSkill);
            }
    }//GEN-LAST:event_btnAddSkillActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddSkill;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox<Skill> cbSkill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPower;
    private javax.swing.JLabel lblSkills;
    private javax.swing.JSlider sldrPower;
    private javax.swing.JTable tblSkills;
    private javax.swing.JTextField txtSkillName;
    // End of variables declaration//GEN-END:variables

   
}
