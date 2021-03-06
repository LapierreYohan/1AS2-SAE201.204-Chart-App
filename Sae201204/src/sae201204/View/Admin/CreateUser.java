package sae201204.View.Admin;

import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sae201204.DataBase.DBConnection;
import sae201204.View.ViewConnection;

/**
 * Cette classe permet de créer des utilisateur avec un mot de passe, un pseudo et un rôle
 */
public class CreateUser extends javax.swing.JFrame {

    /**
     * Ce constructeur permet d'initialiser la fenètre de création d'utilisateur
     */
    public CreateUser() {
        this.setLocationRelativeTo(null);
        this.setTitle("Gestion et Administration");
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * Cette méthode permet d'initialiser les différents composants de la fenetre
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Pseudo :");

        jLabel2.setText("Mot de passe :");

        jLabel3.setText("Role :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visiteur", "Moderateur", "Admin" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Créer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Veuillez insérer un pseudo unique");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1)
                    .addComponent(jPasswordField1)
                    .addComponent(jComboBox1, 0, 157, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    /**
     * Cette méthode permet de gérer l'evennement du bouton de confirmation afin de
     * respecter les contraintes de connexions utilisateurs
     * @param evt Event
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (ViewConnection.selectedPlateforme != 2) {
                if (jTextField1.getText().equals(new String()) ) {
                    JOptionPane.showMessageDialog(new JFrame(),"Veuillez indiquer un pseudo !","Erreur",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (jTextField1.getText().length() > 19 ) {
                    JOptionPane.showMessageDialog(new JFrame(),"Votre pseudo doit contenir moins de 20 caractère","Erreur",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (jTextField1.getText().length() < 3 ) {
                    JOptionPane.showMessageDialog(new JFrame(),"Votre pseudo doit contenir au moins 3 caractères","Erreur",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                try {
                    ResultSet rs= DBConnection.getConnectionBD().get("SELECT * FROM UserData WHERE pseudo=\'"+jTextField1.getText()+"\'");
                    if (rs.next()){
                        JOptionPane.showMessageDialog(new JFrame(),"Votre pseudo est déjà utilisé","Erreur",JOptionPane.ERROR_MESSAGE);
                        return;
                    }  
                    rs.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                    return;
                } 
                
                String password = new String(jPasswordField1.getPassword());
                
                if (password.equals(new String())) {
                    JOptionPane.showMessageDialog(new JFrame(),"Veuillez indiquer un mot de passe !","Erreur",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (password.length() > 19 ) {
                    JOptionPane.showMessageDialog(new JFrame(),"Votre mot de passe doit contenir moins de 20 caractère","Erreur",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                
                try {
                    DBConnection.getConnectionBD().update("CREATE TABLE IF NOT EXISTS UserData (id  INT AUTO_INCREMENT, pseudo varchar(20), mdp varchar(20), roles varchar(20), CONSTRAINT pk_User PRIMARY KEY (id))");
                    DBConnection.getConnectionBD().update("INSERT INTO UserData VALUES (0,\'"+jTextField1.getText()+"\',\'"+password+"\', \'"+jComboBox1.getSelectedItem().toString()+"\')");
                    if (ViewConnection.selectedPlateforme == 1) {
                        new sae201204.DataBase.CreateUser(jTextField1.getText(), password, jComboBox1.getSelectedItem().toString());
                    }
                    
                } catch (Exception ex) {
                        return;
                }
                
                JOptionPane.showMessageDialog(new JFrame(),"Utilisateur créé","Success",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
