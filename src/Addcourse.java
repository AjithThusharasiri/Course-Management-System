//compliate
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Addcourse extends javax.swing.JFrame {
    
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    
    public Addcourse() {
        initComponents();
        conn = Dbconnect.connect();
        showTable();
    }
    
    public void showTable() {
        try {
            stmt = conn.createStatement();
            String sql = "SELECT id, Name, Content, Time, Discription FROM courses";
            ResultSet rs = stmt.executeQuery(sql);
            c2.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void tableLoad() {
        int tl = c2.getSelectedRow();
        String cid = c2.getValueAt(tl, 0).toString();
        String cn = c2.getValueAt(tl, 1).toString();
        String con = c2.getValueAt(tl, 2).toString();
        String time = c2.getValueAt(tl, 3).toString();
        String des = c2.getValueAt(tl, 4).toString();
        
        t1.setText(cid);
        t2.setText(cn);
        t3.setText(con);
        t4.setText(time);
        t5.setText(des);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        c2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create a new Course");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Create New Course", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 24), new java.awt.Color(102, 255, 51))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 130, -1));

        c2.setBackground(new java.awt.Color(204, 255, 204));
        c2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Course Name", "Content", "Time", "Discription"
            }
        ));
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2MouseClicked(evt);
            }
        });
        c2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                c2KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(c2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 460, 410));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Id");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, -1, -1));

        t2.setBackground(new java.awt.Color(255, 255, 255));
        t2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 0, 0));
        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 200, 31));

        t3.setBackground(new java.awt.Color(255, 255, 255));
        t3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 0, 0));
        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel2.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 200, 30));

        t4.setBackground(new java.awt.Color(255, 255, 255));
        t4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        t4.setForeground(new java.awt.Color(0, 0, 0));
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 200, 30));

        t5.setBackground(new java.awt.Color(255, 255, 255));
        t5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        t5.setForeground(new java.awt.Color(0, 0, 0));
        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 200, 29));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Content");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Time");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Discription");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(0, 0, 0));
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });
        jPanel2.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 260, 30));

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        t1.setBackground(new java.awt.Color(255, 255, 255));
        t1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 0, 0));
        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t1.setText("Do not enter id for new");
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        jPanel2.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 200, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Course Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Enter course id for search");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 460, 410));

        jPanel3.setBackground(new java.awt.Color(255, 51, 255));

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jButton4.setBackground(new java.awt.Color(51, 0, 255));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 370, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 560));

        setSize(new java.awt.Dimension(972, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Admin ad = new Admin();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void c2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseClicked
        tableLoad();
    }//GEN-LAST:event_c2MouseClicked

    private void c2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2KeyReleased
        tableLoad();
    }//GEN-LAST:event_c2KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            stmt = conn.createStatement();
            
            String ca = t2.getText();
            String con = t3.getText();
            int time = Integer.parseInt(t4.getText());
            String des = t5.getText();
            
            String sql = "INSERT INTO courses(Name, Content, Time,Discription) VALUES('" + ca + "', '" + con + "', '" + time + "', '" + des + "')";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null, "Successfully");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            stmt = conn.createStatement();
            int cID = Integer.parseInt(t1.getText());
            String cname = t2.getText();
            String Con = t3.getText();
            int time = Integer.parseInt(t4.getText());
            String dis = t5.getText();
            
            String sql = "UPDATE courses SET Name='" + cname + "', Content='" + Con + "', Time='" + time + "', Discription='" + dis + "'  WHERE id='" + cID + "'";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null, "Update Successfully");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            stmt = conn.createStatement();
            int cID = Integer.parseInt(t1.getText());
            String sql = "DELETE FROM courses WHERE id='" + cID + "' ";
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null, "Delete Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        showTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        t4.setText(null);
        t5.setText(null);
        search.setText(null);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            stmt = conn.createStatement();
            int cID = Integer.parseInt(search.getText());
            String sql = "SELECT * FROM courses WHERE id= '" + cID + "' ";
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                t1.setText(rs.getString(cID));
                t2.setText(rs.getString("Name"));
                t3.setText(rs.getString("Content"));
                t4.setText(rs.getString("Time"));
                t5.setText(rs.getString("Discription"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Not founed");
                t1.setText(null);
                t2.setText(null);
                t3.setText(null);
                t4.setText(null);
                t5.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyTyped
       char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_t1KeyTyped

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_searchKeyTyped

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
            java.util.logging.Logger.getLogger(Addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addcourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addcourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable c2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
