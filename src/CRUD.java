// Exception Hadaling

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class CRUD extends javax.swing.JFrame {
    
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public CRUD() {
        initComponents();
        conn = Dbconnect.connect();
        showYable();
    }
    
    public void showYable() {
        try {
            stmt = conn.createStatement();
            String sql = "SELECT id,sname,sreg,sphone,syear,spassword FROM student";
            ResultSet rs = stmt.executeQuery(sql);
            editt.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void tableLoad() {
        int tl = editt.getSelectedRow();
        String Id = editt.getValueAt(tl, 0).toString();
        String name = editt.getValueAt(tl, 1).toString();
        String regnum = editt.getValueAt(tl, 2).toString();
        String phone = editt.getValueAt(tl, 3).toString();
        String year = editt.getValueAt(tl, 4).toString();
        String password = editt.getValueAt(tl, 5).toString();
        id.setText(Id);
        t1.setText(name);
        t2.setText(regnum);
        t3.setText(phone);
        t4.setText(year);
        t5.setText(password);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editt = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" Student ]CRUD");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null), "Student change", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editt.setBackground(new java.awt.Color(255, 51, 255));
        editt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "Registed Number", "phone", "year", "password"
            }
        ));
        editt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edittMouseClicked(evt);
            }
        });
        editt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edittKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edittKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(editt);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 450, 340));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 450, 110, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t1.setBackground(new java.awt.Color(255, 255, 255));
        t1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 0, 0));
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 160, 32));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Enter your name for search");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Registed number");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, 20));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Phone");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        t4.setBackground(new java.awt.Color(255, 255, 255));
        t4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        t4.setForeground(new java.awt.Color(0, 0, 0));
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t4KeyTyped(evt);
            }
        });
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 160, 31));

        t5.setBackground(new java.awt.Color(255, 255, 255));
        t5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 160, 29));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Year");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 300, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Id");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 30));

        t2.setBackground(new java.awt.Color(255, 255, 255));
        t2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 0, 0));
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t2KeyTyped(evt);
            }
        });
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 160, 30));

        t3.setBackground(new java.awt.Color(255, 255, 255));
        t3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t3KeyTyped(evt);
            }
        });
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 160, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 430, 340));

        jPanel3.setBackground(new java.awt.Color(255, 0, 255));

        jButton1.setBackground(new java.awt.Color(204, 255, 51));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);

        jButton5.setBackground(new java.awt.Color(102, 255, 0));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 51, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 400, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 540));

        setSize(new java.awt.Dimension(1006, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edittMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edittMouseClicked
        tableLoad();
    }//GEN-LAST:event_edittMouseClicked

    private void edittKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edittKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_edittKeyPressed

    private void edittKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edittKeyReleased
        tableLoad();
    }//GEN-LAST:event_edittKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Admin ad = new Admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            stmt = conn.createStatement();
            String Sname = t1.getText();
            int reg = Integer.parseInt(t2.getText());
            int phone = Integer.parseInt(t3.getText());
            int year = Integer.parseInt(t4.getText());
            String pass = t5.getText();
            
            String sql = "INSERT INTO student(sname, sreg, sphone, syear, spassword) VALUES('" + Sname + "', '" + reg + "', '" + phone + "', '" + year + "', '" + pass + "')";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null, "Successfully");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showYable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            stmt = conn.createStatement();
            int sID =Integer.parseInt(id.getText());
            String Sname = t1.getText();
            int reg = Integer.parseInt(t2.getText());
            int phone = Integer.parseInt(t3.getText());
            int year = Integer.parseInt(t4.getText());
            String pass = t5.getText();
            int Id  = Integer.parseInt(id.getText());
            String sql = "UPDATE student SET sname='" + Sname + "', sreg='" + reg + "', sphone='" + phone + "', syear='" + year + "', spassword='" + pass + "'  WHERE id='"+sID+"'";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null, "Update Successfully");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showYable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            stmt = conn.createStatement();
            String Sname = t1.getText();
            String sql = "DELETE FROM student WHERE sname='" + Sname + "' ";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null, "Delete Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showYable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        id.setText(null);
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        t4.setText(null);
        t5.setText(null);
        search.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            stmt = conn.createStatement();
            String Sname = search.getText();
            String sql = "SELECT * FROM student WHERE sname= '" + Sname + "' ";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                t1.setText(rs.getString("sname"));
                t2.setText(rs.getString("sreg"));
                t3.setText(rs.getString("sphone"));
                t4.setText(rs.getString("syear"));
                t5.setText(rs.getString("spassword"));
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Not founed");
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void t2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_t2KeyTyped

    private void t3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_t3KeyTyped

    private void t4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t4KeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_t4KeyTyped

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
       char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_idKeyTyped

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
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable editt;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JPasswordField t5;
    // End of variables declaration//GEN-END:variables
}
