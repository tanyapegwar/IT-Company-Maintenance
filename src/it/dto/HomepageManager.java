package it.dto;
import est.connect.ConnectionFactory;
import hib.dto.User;
import hib.dto.Useracc;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HomepageManager extends javax.swing.JFrame {
    
    public HomepageManager() 
    {
       initComponents();
        getContentPane().setBackground(Color.white); 
        SessionFactory sf=ConnectionFactory.getEmergencyConnection();
        Session session=sf.openSession();
        Transaction  transaction=session.beginTransaction();
        
        
        Criteria crit=session.createCriteria(Login.class);
        List<Login> data=crit.list();
        DefaultTableModel tm=(DefaultTableModel)jTable1.getModel();
        for(Login ob:data)
        {
    String  ob1 =ob.getManagerUsername();
    String  ob2 =ob.getManagerPassword();
    String  ob3 =ob.getOperatorUsername();
    String  ob4 =ob.getOperatorPassword();
    String  ob5 =ob.getAccountantUsername();
    String  ob6 =ob.getAccountantPassword();
        
        Object obj[]={ob1,ob2,ob3,ob4,ob5,ob6};
        tm.addRow(obj);
        }
        
        Criteria criteria=session.createCriteria(User.class);
        List <User> infos=criteria.list();
        DefaultTableModel tmi=(DefaultTableModel)jTable2.getModel();
        for(User obt:infos)
        {
        String obt1=obt.getUsername();
        String obt2=obt.getDepartment();
        String obt3=obt.getEmail();
        long obt4=obt.getContactno();
        String obt5=obt.getCity();
        String obt6=obt.getGender();
        String obt7=obt.getPassword();    
        Object obi[]={obt1,obt2,obt3,obt5,obt6,obt7};
        tmi.addRow(obi);
        }
        
       Criteria ct=session.createCriteria(Useracc.class);
        List <Useracc> information=ct.list();
        DefaultTableModel tmo=(DefaultTableModel)jTable3.getModel();
        for(Useracc o:information)
        {
        Object object[]={o.getUsername(),o.getEmail(),o.getContactno(),o.getCity(),o.getGender(),o.getWorkexperience(),o.getPassword()};
        tmo.addRow(object);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Manager Username", "Manager Password", "Operator Username", "Operator Password", "Accountant Username", "Accountant Password"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 810, 390));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it/dto/Technology-Wallpapers-6_980x613.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 920, 460));

        jTabbedPane1.addTab("Login ", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Department", "E-Mail", "Conatact No.", "City", "Gender", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 720, 350));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it/dto/Technology-Wallpapers-6_980x613.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 925, 460));

        jTabbedPane1.addTab("Operator info", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "E-Mail", "Contact No.", "City", "Gender", "Work Experience", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 720, 350));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it/dto/Technology-Wallpapers-6_980x613.jpg"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 460));

        jTabbedPane1.addTab("Accountant Info", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 930, 470));

        jRadioButton1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jRadioButton1.setText("Sign out");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/it/dto/Technology-Wallpapers-6_980x613.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -6, 930, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        LoginAccountant la=new LoginAccountant();
        la.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HomepageManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomepageManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomepageManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomepageManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomepageManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
    
}
