/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainProject;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Karuro
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    String passuser;
     String type;
    public Login() {
        setTitle("Cold Cone");
        initComponents();
        initialize();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(Login.EXIT_ON_CLOSE);
    }
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    private static String DRIVERCLASS_DBCONNECTION = "com.mysql.jdbc.Driver";
    private static String URL_DBCONNECTION = "jdbc:mysql://localhost:3306/coldcone";
    private static String USERNAME_DBCONNECTION = "root";
    private static String PASSWORD_DBCONNECTION = "asdfjklh";
    public String userID = null;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserNameTF = new javax.swing.JTextField();
        PasswordPF = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 710));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(740, 170, 90, 17);

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(740, 260, 90, 17);

        UserNameTF.setBackground(new java.awt.Color(6, 209, 246));
        UserNameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UserNameTF.setForeground(new java.awt.Color(255, 255, 255));
        UserNameTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserNameTF.setBorder(null);
        UserNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameTFActionPerformed(evt);
            }
        });
        jPanel1.add(UserNameTF);
        UserNameTF.setBounds(510, 120, 544, 50);

        PasswordPF.setBackground(new java.awt.Color(57, 168, 246));
        PasswordPF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PasswordPF.setForeground(new java.awt.Color(255, 255, 255));
        PasswordPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PasswordPF.setBorder(null);
        jPanel1.add(PasswordPF);
        PasswordPF.setBounds(510, 210, 544, 50);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(510, 310, 370, 60);

        jButton1.setBackground(new java.awt.Color(255, 102, 255));
        jButton1.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SIGN-UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(900, 310, 150, 60);

        jLabel4.setFont(new java.awt.Font("STCaiyun", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cold Cone");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(660, 40, 250, 50);

        jSeparator1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(510, 170, 540, 10);

        jSeparator2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(510, 260, 540, 10);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arevalo\\Desktop\\icecream.png")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1500, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Frame icon
     private void initialize() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("CCL.png")));
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String user = UserNameTF.getText();
        String pass = PasswordPF.getText();
        Date date = java.sql.Date.valueOf(LocalDate.now());
        Time time = java.sql.Time.valueOf(LocalTime.now());
        LoginMethod lm = new LoginMethod(user,pass);
        String userCheck = "SELECT * FROM users WHERE UserName = '"+lm.getUserName()+"'";
        String passwordCheck = "SELECT * FROM users WHERE PassWord = '"+lm.getPassWord()+"'";
        String sql = "SELECT * FROM users WHERE UserName = '"+lm.getUserName()+"' and PassWord = '"+lm.getPassWord()+"'";
        String insert = "INSERT INTO logs (username, date, time) VALUES ('"+lm.getUserName()+"', '"+date.toString()+"', '"+time.toString()+"')";
        try {
            
        conn = DriverManager.getConnection(URL_DBCONNECTION, USERNAME_DBCONNECTION, PASSWORD_DBCONNECTION);
            pst = conn.prepareStatement(userCheck);
            rs = pst.executeQuery();
            if(rs.next()){
                
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect USERNAME");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        try {
            
        conn = DriverManager.getConnection(URL_DBCONNECTION, USERNAME_DBCONNECTION, PASSWORD_DBCONNECTION);
            pst = conn.prepareStatement(passwordCheck);
            rs = pst.executeQuery();
            if(rs.next()){
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect PASSWORD");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        try {
            
        conn = DriverManager.getConnection(URL_DBCONNECTION, USERNAME_DBCONNECTION, PASSWORD_DBCONNECTION);
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                this.type = rs.getString("Type");
                this.userID = rs.getString("UserName");
                System.out.println("yehey");
                if (this.type.equals("ADMIN")){
                    pass();
                }else{
                    pass();
                }
            }else{
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        try{
            
        conn = DriverManager.getConnection(URL_DBCONNECTION, USERNAME_DBCONNECTION, PASSWORD_DBCONNECTION);
            pst = conn.prepareStatement(insert);
            pst.executeUpdate();
                this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UserNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        signup sign = new signup();
        sign.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void pass(){
        mainframe mf = new mainframe();
        mf.jLabel4.setText(type);
        mf.sup = type;
        mf.setVisible(true);
        mf.updateTableone();
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordPF;
    private javax.swing.JTextField UserNameTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
