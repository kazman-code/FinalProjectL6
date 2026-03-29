
package my.system;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Login extends javax.swing.JFrame {
	private int attempts = 0;


   
    public Login() {
        initComponents();
        //centres window 
        setLocationRelativeTo(null);
        setupShowPassword();

    }

    
    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        jButtonLogin = new javax.swing.JButton();
        jLabelExamEntry = new javax.swing.JLabel();
        jLabelSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jLabelExamEntry.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        jLabelExamEntry.setText("GTI Exam Entry System");

        jLabelSearch.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelSearch.setText("Login...");
        
        jPasswordField1 = new JPasswordField();
        
        jCheckBoxShowPassword = new JCheckBox("Show Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabelExamEntry))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(jLabelSearch, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(115)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jPasswordField1, Alignment.TRAILING)
        						.addComponent(jButtonLogin, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
        					.addGap(18)
        					.addComponent(jCheckBoxShowPassword, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabelExamEntry)
        			.addGap(40)
        			.addComponent(jLabelSearch)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jCheckBoxShowPassword))
        			.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
        			.addComponent(jButtonLogin)
        			.addGap(85))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {

        String login = new String(jPasswordField1.getPassword()).trim();

        if (login.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password cannot be empty");
            return;
        }

        if (login.equals("root")) {
            Options f = new Options();
            f.setVisible(true);
            this.dispose();   // closes login window
            return;
        }

        attempts++;
        JOptionPane.showMessageDialog(null, "Incorrect Password (" + attempts + "/3)");
        jPasswordField1.setText("");

        if (attempts >= 3) {
            JOptionPane.showMessageDialog(null, "Too many failed attempts. Exiting.");
            System.exit(0);
        }
    }

    
    private void setupShowPassword() {
    	jCheckBoxShowPassword.addActionListener(e -> {
            if (jCheckBoxShowPassword.isSelected()) {
                jPasswordField1.setEchoChar((char) 0); // show
            } else {
                jPasswordField1.setEchoChar('*'); // hide
            }
        });
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
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabelExamEntry;
    private javax.swing.JLabel jLabelSearch;
    private JPasswordField jPasswordField1;
    private javax.swing.JCheckBox jCheckBoxShowPassword;
}
