/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars24;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.Toolkit;
import java.security.MessageDigest;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author hruth
 */
public class login extends javax.swing.JFrame {
Toolkit tk = Toolkit.getDefaultToolkit();
int xsize=(int)tk.getScreenSize().getWidth();
int ysize=(int)tk.getScreenSize().getHeight();


    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        jPanel1.setFocusable(true);
        this.setSize(xsize, ysize);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JTextField();
        pno = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        show = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        text.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text.setForeground(new java.awt.Color(102, 102, 102));
        text.setText("   Password");
        text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textMousePressed(evt);
            }
        });
        text.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                textComponentHidden(evt);
            }
        });
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });
        getContentPane().add(text);
        text.setBounds(610, 420, 191, 44);

        pno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pno.setForeground(new java.awt.Color(102, 102, 102));
        pno.setText("   Phone no.");
        pno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pnoFocusLost(evt);
            }
        });
        pno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnoActionPerformed(evt);
            }
        });
        pno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnoKeyPressed(evt);
            }
        });
        getContentPane().add(pno);
        pno.setBounds(610, 350, 191, 48);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(670, 620, 69, 15);

        pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passMousePressed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });
        getContentPane().add(pass);
        pass.setBounds(610, 420, 188, 42);

        show.setText("Show Password");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show);
        show.setBounds(610, 470, 111, 21);

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 530, 201, 41);

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("New User? SignUp");
        jButton2.setAlignmentY(0.0F);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(640, 590, 130, 21);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(660, 240, 92, 44);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars24/1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1610, 880);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1610, 880);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql ="select pno,pass1,fname,email from logintable where pno = ? and pass1 = ?";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginandregister","root","bms@ise");
            PreparedStatement pstmt =conn.prepareStatement(sql);
            pstmt.setString(1,pno.getText());
            pstmt.setString(2,md5(pass.getPassword()));
            
            ResultSet rs = pstmt.executeQuery();
            //ResultSetMetaData rsmd = rs.getMetaData();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"Welcome "+rs.getString(3) ,"sucessful login...",JOptionPane.PLAIN_MESSAGE);
                
                new buysell(rs.getString(3),rs.getString(1),rs.getString(4)).setVisible(true);
                this.setVisible(false);
            }
            else {
                
                JOptionPane.showMessageDialog(null,"invalid user/password","unsucessful login",JOptionPane.ERROR_MESSAGE);
                
            }
            conn.close();
            
        }

        catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_jButton1ActionPerformed
private String md5(char[] c)
        {
            try
            {
                MessageDigest digs=MessageDigest.getInstance("SHA");
                digs.update((new String(c)).getBytes("UTF8"));
                String str=new String(digs.digest());
                return str;
            }
            catch(Exception e)
                    {
                        return "";
                    }
        }
    private void pnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnoActionPerformed

    private void pnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnoFocusLost
        if(pno.getText().trim().equals("") || pno.getText().trim().toLowerCase().equals("phone no.")){
            pno.setText("Phone no.");
            pno.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_pnoFocusLost

    private void pnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnoFocusGained
        if(pno.getText().trim().toLowerCase().equals("phone no."))
        {
            pno.setText("");
            pno.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_pnoFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Signup().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    private void textMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMousePressed
        pass.setVisible(true);
        text.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_textMousePressed

    private void passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMousePressed
        pass.setVisible(true);
        text.setVisible(false);
    }//GEN-LAST:event_passMousePressed

    private void pnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnoKeyPressed
        int key=evt.getKeyCode();
        if(key==10)
        {
            pass.requestFocus();
        }
    }//GEN-LAST:event_pnoKeyPressed

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        text.setVisible(false);
    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
        
    }//GEN-LAST:event_passFocusLost

    private void textComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_textComponentHidden
        pass.requestFocus();
    }//GEN-LAST:event_textComponentHidden

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        int key=evt.getKeyCode();
        if(key==10)
        {
           String sql ="select pno,pass1,fname,email from logintable where pno = ? and pass1 = ?";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginandregister","root","bms@ise");
            PreparedStatement pstmt =conn.prepareStatement(sql);
            pstmt.setString(1,pno.getText());
            pstmt.setString(2,md5(pass.getPassword()));
            
            ResultSet rs = pstmt.executeQuery();
            //ResultSetMetaData rsmd = rs.getMetaData();
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null,"welcome "+rs.getString(3) ,"sucessful login",JOptionPane.PLAIN_MESSAGE);
                new buysell(rs.getString(3),rs.getString(1),rs.getString(4)).setVisible(true);
                this.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(null,"invalid user/password","unsucessful login",JOptionPane.ERROR_MESSAGE);
            }
            conn.close();
            
        }

        catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);

        }
        }
    }//GEN-LAST:event_passKeyPressed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if(show.isSelected())
        {
            pass.setEchoChar((char)0);
        }
        else
        {
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_showActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new homepage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField pno;
    private javax.swing.JCheckBox show;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
 
}