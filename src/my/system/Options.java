
package my.system;

public class Options extends javax.swing.JFrame {

    
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
        jLabel1 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Swis721 BlkCn BT", 1, 36)); // NOI18N
        jLabel1.setText("GTI Exam Entry System");

        jLabelGrade.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelGrade.setText("Grade...");

        jButton1.setText("Grade Students");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButtonStaffUpdate)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonStudentUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabelUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButtonStaffSearch)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButtonStudentSearch))
                                .addComponent(jLabelGrade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(96, 96, 96)
                .addComponent(jLabelSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStaffSearch)
                    .addComponent(jButtonStudentSearch))
                .addGap(41, 41, 41)
                .addComponent(jLabelUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonStaffUpdate)
                    .addComponent(jButtonStudentUpdate))
                .addGap(43, 43, 43)
                .addComponent(jLabelGrade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }

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

    
    
       
      
       
    

   
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonStaffSearch;
    private javax.swing.JButton jButtonStaffUpdate;
    private javax.swing.JButton jButtonStudentSearch;
    private javax.swing.JButton jButtonStudentUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGrade;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelUpdate;
   
}
