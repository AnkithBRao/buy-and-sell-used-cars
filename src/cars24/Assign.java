/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cars24;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author hruth
 */
public class Assign extends javax.swing.JFrame {
Toolkit tk = Toolkit.getDefaultToolkit();
int xsize=(int)tk.getScreenSize().getWidth();
int ysize=(int)tk.getScreenSize().getHeight();


    @Override
    public void setSize(int width, int height) {
        super.setSize(width, height); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Creates new form admin
     */
    public Assign() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        regno = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Assign Price ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(620, 210, 206, 48);

        regno.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        regno.setForeground(new java.awt.Color(102, 102, 102));
        regno.setText("Reg no.");
        regno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                regnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                regnoFocusLost(evt);
            }
        });
        regno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regnoActionPerformed(evt);
            }
        });
        regno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regnoKeyPressed(evt);
            }
        });
        jPanel1.add(regno);
        regno.setBounds(620, 300, 224, 56);

        price.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        price.setForeground(new java.awt.Color(102, 102, 102));
        price.setText("Assign Price");
        price.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                priceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                priceFocusLost(evt);
            }
        });
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceKeyPressed(evt);
            }
        });
        jPanel1.add(price);
        price.setBounds(620, 380, 224, 57);

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Assign");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(650, 470, 155, 49);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(690, 540, 69, 15);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cars24/1.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1540, 860);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1540, 870);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sql ="update cardatabase set assigned=? where regno=?";
        String sql1 ="update selleractivity set price=? where regno=?";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginandregister","root","bms@ise");
            PreparedStatement pstmt =conn.prepareStatement(sql);
            pstmt.setString(2,regno.getText());
            pstmt.setString(1,price.getText());
            PreparedStatement pstmt1 =conn.prepareStatement(sql1);
            pstmt1.setString(2,regno.getText());
            pstmt1.setInt(1, (int) ((Integer.parseInt(price.getText()))*0.98));
            pstmt1.executeUpdate();
            pstmt.executeUpdate();
            
                JOptionPane.showMessageDialog(null,"Price is Updated");
            
            
            
            conn.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regnoFocusGained
        if(regno.getText().trim().toLowerCase().equals("reg no."))
        {
            regno.setText("");
            regno.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_regnoFocusGained

    private void regnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_regnoFocusLost
        if(regno.getText().trim().equals("") || regno.getText().trim().toLowerCase().equals("reg no.")){
            regno.setText("reg no.");
            regno.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_regnoFocusLost

    private void priceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceFocusGained
        if(price.getText().trim().toLowerCase().equals("assign price"))
        {
            price.setText("");
            price.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_priceFocusGained

    private void priceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_priceFocusLost
        if(price.getText().trim().equals("") || price.getText().trim().toLowerCase().equals("assign price")){
            price.setText("Assign price");
            price.setForeground(new Color(102,102,102));
        }
    }//GEN-LAST:event_priceFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new assignsell().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void regnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regnoKeyPressed
        int key=evt.getKeyCode();
        if(key==10)
        {
            price.requestFocus();
        }
    }//GEN-LAST:event_regnoKeyPressed

    private void priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyPressed
        int key=evt.getKeyCode();
        if(key==10)
        {
            String sql ="update cardatabase set assigned=? where regno=?";
        String sql1 ="update selleractivity set price=? where regno=?";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginandregister","root","bms@ise");
            PreparedStatement pstmt =conn.prepareStatement(sql);
            pstmt.setString(2,regno.getText());
            pstmt.setString(1,price.getText());
            PreparedStatement pstmt1 =conn.prepareStatement(sql1);
            pstmt1.setString(2,regno.getText());
            pstmt1.setInt(1, (int) ((Integer.parseInt(price.getText()))*0.98));
            pstmt1.executeUpdate();
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Price is assigned");
            
            
            
            conn.close();
        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);

        }
        }
    }//GEN-LAST:event_priceKeyPressed

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
            java.util.logging.Logger.getLogger(Assign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField regno;
    // End of variables declaration//GEN-END:variables
}