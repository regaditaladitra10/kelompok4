package kelompok4;
import com.sun.glass.ui.View;
import java.awt.Dialog;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

public class view extends javax.swing.JFrame {

    
    public view() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        matkul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jam = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        searchData = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(600, 400));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 402));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Mata Kuliah", "Jam Mata Kuliah", "Kelas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setMaxWidth(20);
            Table.getColumnModel().getColumn(0).setHeaderValue("ID");
            Table.getColumnModel().getColumn(1).setHeaderValue("Nama Mata Kuliah");
            Table.getColumnModel().getColumn(2).setHeaderValue("Jam Mata Kuliah");
            Table.getColumnModel().getColumn(3).setHeaderValue("Kelas");
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("JADWAL MATA KULIAH UNIKU");

        jLabel2.setText("Nama Mata Kuliah");

        matkul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matkulActionPerformed(evt);
            }
        });

        jLabel3.setText("Jam Mata Kuliah");

        jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamActionPerformed(evt);
            }
        });

        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
            }
        });

        jLabel4.setText("Ruang Kelas");

        submit.setText("Create");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        searchData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDataActionPerformed(evt);
            }
        });

        search.setText("Find");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel5.setText("Search By ID");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(submit)
                                .addGap(18, 18, 18)
                                .addComponent(Update)
                                .addGap(18, 18, 18)
                                .addComponent(delete))
                            .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(search)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Clear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(print)
                                .addGap(18, 18, 18)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(matkul, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(matkul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back)
                    .addComponent(print))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void matkulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matkulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matkulActionPerformed

    private void jamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jamActionPerformed

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasActionPerformed
     public void loadData() throws SQLException{
         try {
         Class.forName("com.mysql.jdbc.Driver");
          
          String url = "jdbc:mysql://localhost:3306/java_users_db";
          String user = "root";  
          String password = "";  
          
          
          Connection con = DriverManager.getConnection(url, user, password);
          Statement st = con.createStatement();
     DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Nama Mata Matkul","Jam Mata Kuliah","Kelas"}, 0);
             
      Table.setModel(model);
      String sql = "SELECT `id`, `mata_kuliah`, `jam_mata_kuliah`, `kelas` FROM `java_users_db`.`mata_kuliah`";
      ResultSet rs = st.executeQuery(sql);
      String i, m, j, k;
      while(rs.next()) {
      i = rs.getString("id");
      m = rs.getString("mata_kuliah");
      j = rs.getString("jam_mata_kuliah");
      k = rs.getString("kelas");
      model.addRow(new Object[]{i, m, j, k});
      }
      con.close();
       }
      catch(Exception e){
      System.out.println("Error" + e.getMessage());
      }
     }
    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
         String Matkul, Jam, Kelas, query;
  
    try {
        Class.forName("com.mysql.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/java_users_db";
        String user = "root";  
        String password = "";  
        
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        
        if ("".equals(matkul.getText())) { 
            JOptionPane.showMessageDialog(new JFrame(), "Nama Mata Kuliah is Required", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(jam.getText())) { 
            JOptionPane.showMessageDialog(new JFrame(), "Jam Mata Kuliah is Required", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else if("".equals(kelas.getText())) { 
            JOptionPane.showMessageDialog(new JFrame(), "Kelas is Required", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else {
            Matkul = matkul.getText();
            Jam = jam.getText(); // Menggunakan format waktu
            Kelas = kelas.getText();
            
            query = "INSERT INTO mata_kuliah (mata_kuliah, jam_mata_kuliah, kelas) VALUES ('" + Matkul + "','" + Jam + "','" + Kelas + "')";
            System.out.println("Matkul: " + Matkul + ", Jam: " + Jam + ", Kelas: " + Kelas);
            
            st.executeUpdate(query);
            matkul.setText("");
            jam.setText("");
            kelas.setText("");
            
            JOptionPane.showMessageDialog(null, "Register Successfully processed.");
            loadData(); // Memanggil metode loadData() untuk memperbarui tabel
            con.close();
        }
    } catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }//GEN-LAST:event_submitActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // button edit/update data
        String id, Matkul, Jam, Kelas;
    Connection con = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/java_users_db";
        String user = "root";  
        String password = "";  
        
        con = DriverManager.getConnection(url, user, password);
        id = searchData.getText();
        Matkul = matkul.getText();
        Jam = jam.getText();
        Kelas = kelas.getText();
        
        if ("".equals(id)) { 
            JOptionPane.showMessageDialog(new JFrame(), "ID diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(Matkul)) { 
            JOptionPane.showMessageDialog(new JFrame(), "Nama Mata Kuliah diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(Jam)) { 
            JOptionPane.showMessageDialog(new JFrame(), "Jam Mata Kuliah diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else if ("".equals(Kelas)) { 
            JOptionPane.showMessageDialog(new JFrame(), "Kelas diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else {
            String sql = "UPDATE `mata_kuliah` SET `mata_kuliah` = ?, `jam_mata_kuliah` = ?, `kelas` = ? WHERE `id` = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Matkul);
            pst.setString(2, Jam);
            pst.setString(3, Kelas);
            pst.setString(4, id);
            int rowsUpdated = pst.executeUpdate();
            
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Data berhasil diperbarui", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                loadData(); // Memanggil metode loadData() untuk memperbarui tabel
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Data tidak ditemukan", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
    }//GEN-LAST:event_UpdateActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // untuk button clear
        matkul.setText("");
            jam.setText("");
            kelas.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
     String id;
    int notFound = 0;
    Connection con = null;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/java_users_db";
        String user = "root";  
        String password = "";  
        
        con = DriverManager.getConnection(url, user, password);
        String sql = "SELECT `mata_kuliah`, `jam_mata_kuliah`, `kelas` FROM `mata_kuliah` WHERE `id` = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        id = searchData.getText();
        if ("".equals(id)) { 
            JOptionPane.showMessageDialog(new JFrame(), "ID diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else {
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                notFound = 1;
            } 
            if (notFound == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "Data tidak ditemukan", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Jika data ditemukan, hapus data tersebut
                String deleteSql = "DELETE FROM `mata_kuliah` WHERE `id` = ?";
                PreparedStatement deletePst = con.prepareStatement(deleteSql);
                deletePst.setString(1, id);
                deletePst.executeUpdate();
                JOptionPane.showMessageDialog(new JFrame(), "Data berhasil dihapus", "Dialog", JOptionPane.INFORMATION_MESSAGE);
                
                // Memanggil metode loadData() untuk memperbarui tabel
                loadData();
            }
        }
    } catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
         String id;
    try {
        Class.forName("com.mysql.jdbc.Driver");
        
        String url = "jdbc:mysql://localhost:3306/java_users_db";
        String user = "root";  
        String password = "";  
        
        Connection con = DriverManager.getConnection(url, user, password);
        String sql = "SELECT `mata_kuliah`, `jam_mata_kuliah`, `kelas` FROM `mata_kuliah` WHERE `id` = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        id = searchData.getText();
        if ("".equals(id)) { 
            JOptionPane.showMessageDialog(new JFrame(), "ID diperlukan", "Dialog", JOptionPane.ERROR_MESSAGE);
        } else {
            pst.setString(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                matkul.setText(rs.getString("mata_kuliah"));
                jam.setText(rs.getString("jam_mata_kuliah"));
                kelas.setText(rs.getString("kelas"));
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Data tidak ditemukan", "Dialog", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    } catch(Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
                 
    }//GEN-LAST:event_searchActionPerformed

    private void searchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchDataActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
                    new Navigasi().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // script use Ireport
        GenerateReport generatereport = new GenerateReport(); 
        generatereport.generateReport();
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               view x = new view();
                try {
                    x.loadData();
                } catch (SQLException ex) {
                    Logger.getLogger(view.class.getName()).log(Level.SEVERE, null, ex);
                }
               x.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JTable Table;
    private javax.swing.JButton Update;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jam;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField matkul;
    private javax.swing.JButton print;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchData;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables

    
}
