/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class Mainpage1 extends javax.swing.JFrame {
    public Mainpage1() {
        initComponents();
   
      try
         {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        PreparedStatement  st=con.prepareStatement("select * from feedbacktable");
        ResultSet    rs=st.executeQuery();
        DefaultTableModel tm=(DefaultTableModel)jTable2.getModel();
        while(rs.next())
        {
            Object ref[]={rs.getString(1)};
            tm.addRow(ref);
        }
        con.close();
         }
         catch(SQLException | ClassNotFoundException ex)
         {
         ex.printStackTrace();
         }     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        canvas1 = new java.awt.Canvas();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dvp\\Desktop\\project\\10th.jpg")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 250, 130));

        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 180, 130));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("C A R E E R     C O U N S E L I N G  ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 530, 50));

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Explore the streams for the respective courses");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 510, 40));

        jRadioButton3.setBackground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Sign Out");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(737, 0, 100, 40));

        jRadioButton1.setBackground(new java.awt.Color(102, 102, 102));
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("After 1oth");
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton1MouseClicked(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(102, 102, 102));
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("After 12th");
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButton2MouseClicked(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, -1, -1));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 100, 250));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 110, 240));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 450));

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("C A R E E R     C O U N S E L I N G  ");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 530, 50));

        jLabel23.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("List of Users Query/Feedback ");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 410, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Feedback"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, 230));
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 830, 440));

        jTabbedPane1.addTab("View Feedback/Query", jPanel5);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Guidance :-");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 110, 40));

        jLabel16.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("C A R E E R     C O U N S E L I N G  ");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 530, 50));

        jLabel20.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Rahul Jain(Director of TechnoSoft)");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 260, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("TEAM :-");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 90, 40));

        jLabel21.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Atishay Jain,Sanjeet Porwal and Tanya Pegwar");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 360, 40));

        jLabel19.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("C A R E E R     C O U N S E L I N G  ");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 530, 50));

        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jTextArea1.setText("Your career development is a lifelong process that, whether you know it or not, actually started when\n you were born! There are a number of factors that influence your career development, including your \ninterests, abilities, values, personality, background, and circumstances. Career Counseling is a \nprocess that will help you to know and understand yourself and the world of work in order to make \ncareer, educational, and life decisions.\n\nCareer development is more than just deciding on a major and what job you want to get when you \ngraduate. It really is a lifelong process, meaning that throughout your life you will change, \nsituations will change, and you will continually have to make career and life decisions. The goal of \nCareer Counseling is to not only help you make the decisions you need to make now, but to give you \nthe knowledge and skills you need to make future career and life decisions.");
        jScrollPane1.setViewportView(jTextArea1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 830, 230));

        jLabel5.setText("jLabel5");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 450));
        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 760, 230));
        jPanel4.add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jTabbedPane1.addTab("About Us", jPanel4);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("For General Info");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("tany.pegwar@gmail.com");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 210, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("atishayjain876@gmail.com");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("sanjeetporwal@gmail.com");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jLabel15.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("C A R E E R     C O U N S E L I N G  ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 530, 50));

        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 450));

        jTabbedPane1.addTab("Contact US", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 850, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButton1MouseClicked

    private void jRadioButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jRadioButton2MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        Admintenth tenth=new Admintenth();
        tenth.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
      
        Admintwelfth twelve=new Admintwelfth();
        twelve.setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:

        Admin home=new Admin();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainpage1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
