/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.dto;
import est.connect.ConnectionFactory;
import hib.dto.Useracc;
import java.awt.Color;
import java.awt.Container;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;


public class LoginAccountant extends javax.swing.JFrame {

   static String username;
    public LoginAccountant() 
    {
        initComponents();
        Container c=getContentPane();
        c.setBackground(Color.white);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        createAccount = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ACCOUNTANT'S SIGN IN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 100, 20));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 130, -1));

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 130, -1));

        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, -1));

        createAccount.setText("Create new account");
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountMouseClicked(evt);
            }
        });
        createAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountActionPerformed(evt);
            }
        });
        getContentPane().add(createAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 70, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it/dto/graph_explaination_PA_500_clr_31301.gif"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 480, 280));

        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IT MAINTENANCE COMPANY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 400, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 260, 130));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 290, 120));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it/dto/123.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 100, 100));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it/dto/Technology-Wallpapers-6_980x613.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel7MouseDragged(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
       username=jTextField1.getText();
        char ch[]=jPasswordField1.getPassword();
        String password=new String(ch);
     
        SessionFactory sf= ConnectionFactory.getEmergencyConnection();
        Session sess=sf.openSession();
        Transaction tran=sess.beginTransaction();
        Criteria crit=sess.createCriteria(Useracc.class);
        crit.add(Restrictions.and(Restrictions.eq("username",username),Restrictions.eq("password",password)));
        List<Useracc> list=crit.list();
        if(list.isEmpty())
        {
        //JOptionPane.showMessageDialog(this,"invalid id.password");
        jLabel8.setText("INVALID USERNAME/PASSWORD");
        jTextField1.setText("");
        jPasswordField1.setText("");
        }
        else
        {
          //JOptionPane.showMessageDialog(this,"Welcome");
        HomepageAccountant ha =new HomepageAccountant();
          ha.setVisible(true);
          this.dispose();
        }           
    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
      
        
      
    }//GEN-LAST:event_loginMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseDragged

    private void createAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountActionPerformed
        // TODO add your handling code here:
        
    SignupAccountant suo =new SignupAccountant();
    suo.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_createAccountActionPerformed

    private void createAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_createAccountMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

       FlashWindow home=new FlashWindow();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAccountant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
