
package my.system;
import java.awt.event.ActionEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Options extends javax.swing.JFrame {
	
	private javax.swing.JPanel headerPanel;
	private javax.swing.JLabel headerLabel;
	private javax.swing.JLabel welcomeLabel;

    
    public Options() {
        initComponents();
        //this line of code centres the window
        setLocationRelativeTo(null);

    }

    
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        jLabelSearch = new javax.swing.JLabel();
        jButtonStaffSearch = new javax.swing.JButton();
        jButtonStudentSearch = new javax.swing.JButton();
        jLabelUpdate = new javax.swing.JLabel();
        jButtonStaffUpdate = new javax.swing.JButton();
        jButtonStudentUpdate = new javax.swing.JButton();        
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        headerPanel.setBackground(new java.awt.Color(30, 144, 255)); // DodgerBlue
        headerLabel.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36));
        headerLabel.setForeground(java.awt.Color.WHITE);
        headerLabel.setText("GTI Exam Entry System");
        
        welcomeLabel = new javax.swing.JLabel();
        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18));
        welcomeLabel.setForeground(java.awt.Color.WHITE);
        welcomeLabel.setText("Welcome, Administrator");

        headerPanel.setLayout(new java.awt.BorderLayout());
        headerPanel.add(headerLabel, java.awt.BorderLayout.CENTER);
        headerPanel.add(welcomeLabel, java.awt.BorderLayout.SOUTH);


       
        jLabelGrade = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSearch.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelSearch.setText("Search...");

        jButtonStaffSearch.setText("Staff Search");
        jButtonStaffSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStaffSearchActionPerformed(evt);
            }
        });

        jButtonStudentSearch.setText("Student Search");
        jButtonStudentSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStudentSearchActionPerformed(evt);
            }
        });

        jLabelUpdate.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelUpdate.setText("Update...");

        jButtonStaffUpdate.setText("Staff Update");
        jButtonStaffUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStaffUpdateActionPerformed(evt);
            }
        });

        jButtonStudentUpdate.setText("Student Update");
        jButtonStudentUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStudentUpdateActionPerformed(evt);
            }
        });

       

        jLabelGrade.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelGrade.setText("Grade...");

        jButton1.setText("Grade Students");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        JButton jButtonLogout = new JButton("Logout");
        jButtonLogout.addActionListener(e -> jButtonLogoutActionPerformed(e));

        headerPanel.add(jButtonLogout, java.awt.BorderLayout.EAST);
        
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	    layout.createParallelGroup(Alignment.LEADING)
        	        .addComponent(headerPanel, GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
        	        .addGroup(layout.createSequentialGroup()
        	            .addGap(125)
        	            .addGroup(layout.createParallelGroup(Alignment.LEADING)
        	                .addComponent(jLabelSearch, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
        	                .addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        	                    .addGroup(layout.createSequentialGroup()
        	                        .addComponent(jButtonStaffUpdate)
        	                        .addGap(18)
        	                        .addComponent(jButtonStudentUpdate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        	                    .addComponent(jLabelUpdate, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        	                    .addGroup(layout.createSequentialGroup()
        	                        .addComponent(jButtonStaffSearch)
        	                        .addPreferredGap(ComponentPlacement.UNRELATED)
        	                        .addComponent(jButtonStudentSearch))
        	                    .addComponent(jLabelGrade, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        	                .addComponent(jButton1))
        	            .addContainerGap(133, Short.MAX_VALUE))
        	);
        
        layout.setVerticalGroup(
        	    layout.createParallelGroup(Alignment.LEADING)
        	        .addGroup(layout.createSequentialGroup()
        	            .addComponent(headerPanel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
        	            .addGap(40)
        	            .addComponent(jLabelSearch)
        	            .addPreferredGap(ComponentPlacement.RELATED)
        	            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
        	                .addComponent(jButtonStaffSearch)
        	                .addComponent(jButtonStudentSearch))
        	            .addGap(41)
        	            .addComponent(jLabelUpdate)
        	            .addPreferredGap(ComponentPlacement.RELATED)
        	            .addGroup(layout.createParallelGroup(Alignment.BASELINE)
        	                .addComponent(jButtonStaffUpdate)
        	                .addComponent(jButtonStudentUpdate))
        	            .addGap(43)
        	            .addComponent(jLabelGrade)
        	            .addPreferredGap(ComponentPlacement.RELATED)
        	            .addComponent(jButton1)
        	            .addContainerGap(50, Short.MAX_VALUE))
        	);
        getContentPane().setLayout(layout);

        pack();
    }
    //Options to open search pages, update pages, and exam entry page
    private void jButtonStaffSearchActionPerformed(java.awt.event.ActionEvent evt) {
        StaffSearchFrame f0 = new StaffSearchFrame();
        f0.setVisible(true);
        this.dispose();
    }

    private void jButtonStudentSearchActionPerformed(java.awt.event.ActionEvent evt) {
        studentSearchFrame f0 = new studentSearchFrame();
        f0.setVisible(true);
        this.dispose();
    }

    private void jButtonStaffUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        staffUpdate f0 = new staffUpdate();
        f0.setVisible(true);
        this.dispose();
    }

    private void jButtonStudentUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        studentUpdate f0 = new studentUpdate();
        f0.setVisible(true);
        this.dispose();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        ExamEntry f0 = new ExamEntry();
        f0.setVisible(true);
        this.dispose();
    }
    private void jButtonLogoutActionPerformed(ActionEvent evt) {
        new Login().setVisible(true);
        this.dispose();
    }
  
    //Variables Declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonStaffSearch;
    private javax.swing.JButton jButtonStaffUpdate;
    private javax.swing.JButton jButtonStudentSearch;
    private javax.swing.JButton jButtonStudentUpdate;    
    private javax.swing.JLabel jLabelGrade;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelUpdate;
}
