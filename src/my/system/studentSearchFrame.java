
package my.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class studentSearchFrame extends javax.swing.JFrame {

    public studentSearchFrame() {
        initComponents();
        
        try {
            Connection conn = DatabaseConnection.getConnection();
            System.out.println("Connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jTextFieldStudentName = new javax.swing.JTextField();
        jLabelStudentName = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jLabelSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInfo = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStudentNameActionPerformed(evt);
            }
        });

        jLabelStudentName.setText("Student Name");

        jLabelInfo.setText("Information on Student");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabelSearch.setFont(new java.awt.Font("Segoe UI", 0, 36)); 
        jLabelSearch.setText("Student Search");

        jTextAreaInfo.setEditable(false);
        jTextAreaInfo.setColumns(20);
        jTextAreaInfo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInfo);

        jButton1.setText("Assignments");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabelSearch)
        					.addGap(0, 201, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jTextFieldStudentName, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabelStudentName)
        						.addComponent(jButtonSearch)
        						.addComponent(jButton1)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(11)
        							.addComponent(jButton2)))
        					.addPreferredGap(ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabelInfo))))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabelSearch)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(14)
        					.addComponent(jLabelInfo)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(38)
        					.addComponent(jLabelStudentName)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jTextFieldStudentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
        					.addComponent(jButton1)
        					.addGap(18)
        					.addComponent(jButtonSearch)
        					.addGap(34)
        					.addComponent(jButton2)))
        			.addContainerGap(60, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jTextFieldStudentNameActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {
         Student st = new Student(jTextFieldStudentName.getText());

      

        try {
           
        	Connection conn = DatabaseConnection.getConnection();

             PreparedStatement prest;

            String sql = "SELECT * FROM student WHERE first_name LIKE  ?";
            prest = conn.prepareStatement(sql);
            prest.setString(1, st.getFirst_name()+"%" );
            ResultSet rs = prest.executeQuery();

            String info = "";
            while (rs.next()) {
            	st.setStudent_id(rs.getInt(1));
            	st.setClass_group_code(rs.getString(2));
            	st.setFirst_name(rs.getString(3));
            	st.setSurname(rs.getString(4));
            	st.setAddress_line1(rs.getString(5));
            	st.setAddress_line2(rs.getString(6));
            	st.setCounty(rs.getString(7));
            	st.setEircode(rs.getString(8));
            	st.setEmail(rs.getString(9));
            	st.setPhone_number(rs.getString(10));
            	st.setDate_of_birth(rs.getString(11));
            	st.setPPSN(rs.getString(12));

                info += "Student ID: " + st.getStudent_id()
                    + "\nFirst Name: " + st.getFirst_name()
                    + "\nSurname: " + st.getSurname()
                    + "\nAddress Line 1: " + st.getAddress_line1()
                    + "\nAddress Line 2: " + st.getAddress_line2()
                    + "\nCounty: " + st.getCounty()
                    + "\nEircode: " + st.getEircode()
                    + "\nEmail: " + st.getEmail()
                    + "\nPhone Number: " + st.getPhone_number()
                    + "\nDate of Birth: " + st.getDate_of_birth()
                    + "\nPPSN: " + st.getPPSN()
                    + "\nClass Group Code: " + st.getClass_group_code();
            }
            prest.close();
            rs.close();
            conn.close();
            jTextAreaInfo.setText(info);
        } catch (Exception e) {
            
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    		ExamEntry f0 = new ExamEntry();
    	    f0.setVisible(true);
    	    this.dispose();
      
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
    	Options options = new Options();
        options.setVisible(true);
        this.dispose();

    }

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(studentSearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentSearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentSearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentSearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentSearchFrame().setVisible(true);
            }
        });
    }

  
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelSearch;
    private javax.swing.JLabel jLabelStudentName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInfo;
    private javax.swing.JTextField jTextFieldStudentName;
}
