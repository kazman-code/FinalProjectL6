
package my.system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


public class studentUpdate extends javax.swing.JFrame {
         

    
    public studentUpdate() {
        initComponents();
        loadClassGroupCodes();
        
        try {
            Connection conn = DatabaseConnection.getConnection();
            System.out.println("Connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldSurname = new javax.swing.JTextField();
        jTextFieldAddressLine1 = new javax.swing.JTextField();
        jTextFieldAddressLine2 = new javax.swing.JTextField();
        jTextFieldCounty = new javax.swing.JTextField();
        jTextFieldEircode = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jTextFieldDateOfBirth = new javax.swing.JTextField();
        jTextFieldPPSN = new javax.swing.JTextField();
        jLabelFirstName = new javax.swing.JLabel();
        jButtonDelete = new javax.swing.JButton();
        jLabelSurname = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jLabelAddressLine1 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabelAddressLine2 = new javax.swing.JLabel();
        jLabelCounty = new javax.swing.JLabel();
        jLabelEircode = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jLabelDateOfBirth = new javax.swing.JLabel();
        jLabelPPSN = new javax.swing.JLabel();
        jTextFieldStudentName = new javax.swing.JTextField();
        jLabelStudentName = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jLabelStudentID = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jTextFieldStudentID = new javax.swing.JTextField();
        jComboBoxClassCode = new javax.swing.JComboBox<>();
        jButtonClear = new javax.swing.JButton();
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });


        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelFirstName.setText("First Name");

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabelSurname.setText("Surname");

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabelAddressLine1.setText("Address Line 1");

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabelAddressLine2.setText("Address Line 2");

        jLabelCounty.setText("County");

        jLabelEircode.setText("Eircode");

        jLabelEmail.setText("Email");

        jLabelPhoneNumber.setText("Phone Number");

        jLabelDateOfBirth.setText("Date of Birth");

        jLabelPPSN.setText("PPSN");

        jLabelStudentName.setText("Student Name");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabelStudentID.setText("Student ID");

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jComboBoxClassCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PSD", "ASD" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(24)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabelStudentName)
        					.addGap(36)
        					.addComponent(jTextFieldStudentName, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabelDateOfBirth, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jLabelPPSN, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabelEmail, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabelCounty, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabelFirstName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabelSurname, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabelEircode, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabelStudentID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabelAddressLine1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabelAddressLine2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addComponent(jLabelPhoneNumber)))
        					.addGap(69)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jComboBoxClassCode, 0, 180, Short.MAX_VALUE)
        						.addComponent(jTextFieldStudentID, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        						.addComponent(jTextFieldFirstName)
        						.addComponent(jTextFieldSurname, Alignment.TRAILING)
        						.addComponent(jTextFieldAddressLine1, Alignment.TRAILING)
        						.addComponent(jTextFieldAddressLine2, Alignment.TRAILING)
        						.addComponent(jTextFieldCounty, Alignment.TRAILING)
        						.addComponent(jTextFieldEircode, Alignment.TRAILING)
        						.addComponent(jTextFieldEmail, Alignment.TRAILING)
        						.addComponent(jTextFieldPhoneNumber, Alignment.TRAILING)
        						.addComponent(jTextFieldDateOfBirth, Alignment.TRAILING)
        						.addComponent(jTextFieldPPSN, Alignment.TRAILING))))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButtonSearch)
        							.addGap(102))
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jButtonBack)
        								.addGroup(layout.createParallelGroup(Alignment.LEADING)
        									.addComponent(jButtonAdd)
        									.addComponent(jButtonDelete)
        									.addComponent(jButtonUpdate)))
        							.addGap(85))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(20)
        					.addComponent(jButtonClear, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(35)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldStudentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabelStudentName)
        				.addComponent(jButtonSearch))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(32)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabelStudentID)
        						.addComponent(jTextFieldStudentID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(19)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabelFirstName)
        						.addComponent(jTextFieldFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabelSurname)
        						.addComponent(jTextFieldSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(43)
        					.addComponent(jButtonAdd)
        					.addGap(18)
        					.addComponent(jButtonUpdate)
        					.addGap(14)
        					.addComponent(jButtonClear)
        					.addGap(22)
        					.addComponent(jButtonDelete)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelAddressLine1)
        				.addComponent(jTextFieldAddressLine1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelAddressLine2)
        				.addComponent(jTextFieldAddressLine2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelCounty)
        				.addComponent(jTextFieldCounty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelEircode)
        				.addComponent(jTextFieldEircode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelEmail)
        				.addComponent(jTextFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelPhoneNumber)
        				.addComponent(jTextFieldPhoneNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonBack))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabelDateOfBirth)
        				.addComponent(jTextFieldDateOfBirth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabelPPSN)
        				.addComponent(jTextFieldPPSN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jComboBoxClassCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(17, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        Student st = new Student(jTextFieldStudentName.getText());

        st.setStudent_id(Integer.parseInt(jTextFieldStudentID.getText()));
        st.setFirst_name(jTextFieldFirstName.getText());

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete " + st.getFirst_name()+ " from "
            + "your records");

        if (confirm == 0) {
            System.out.println("confirming delete");
            try {

            	Connection conn = DatabaseConnection.getConnection();

                PreparedStatement prest;

                String sql = "DELETE FROM student WHERE student_id= ?";

                prest = conn.prepareStatement(sql);
                prest.setInt(1, st.getStudent_id());

                int del = prest.executeUpdate();
                System.out.println("Number of deleted records: " + del);
                
                JOptionPane.showMessageDialog(this, "Student deleted successfully.");
                clearForm();

                

                prest.close();

                conn.close();

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {
    	if (!validateFields()) {
    	    return; // Stop Add if validation fails
    	}
        Student st = new Student(jTextFieldStudentName.getText());
        st.setStudent_id(Integer.parseInt(jTextFieldStudentID.getText()));
        st.setFirst_name(jTextFieldFirstName.getText());
        st.setSurname(jTextFieldSurname.getText());
        st.setAddress_line1(jTextFieldAddressLine1.getText());
        st.setAddress_line2(jTextFieldAddressLine2.getText());
        st.setCounty(jTextFieldCounty.getText());
        st.setEircode(jTextFieldEircode.getText());
        st.setEmail(jTextFieldEmail.getText());
        st.setPhone_number(jTextFieldPhoneNumber.getText());
        st.setDate_of_birth(jTextFieldDateOfBirth.getText());
        st.setPPSN(jTextFieldPPSN.getText());
        st.setClass_group_code(((String) jComboBoxClassCode.getSelectedItem()).trim().toUpperCase());

        try {

        	Connection conn = DatabaseConnection.getConnection();

            PreparedStatement prest;

            String sql = "INSERT INTO student "
                    + "(student_id, class_group_code, first_name, surname, address_line1, address_line2, "
                    + "county, eircode, email, phone_number, date_of_birth, ppsn) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";


            prest = conn.prepareStatement(sql);

            prest.setInt(1, st.getStudent_id());
            prest.setString(2, st.getClass_group_code());
            prest.setString(3, st.getFirst_name());
            prest.setString(4, st.getSurname());
            prest.setString(5, st.getAddress_line1());
            prest.setString(6, st.getAddress_line2());
            prest.setString(7, st.getCounty());
            prest.setString(8, st.getEircode());
            prest.setString(9, st.getEmail());
            prest.setString(10, st.getPhone_number());
            prest.setString(11, st.getDate_of_birth());
            prest.setString(12, st.getPPSN());
            

            prest.executeUpdate();

            JOptionPane.showMessageDialog(null, "A new student, "+st.getFirst_name()+ ""
                + ", has been added to the database" );
            clearForm();
            
            prest.close();

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
    	Options opt = new Options();
    	opt.setVisible(true);
    	dispose();
    }

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {
        Student st = new Student(jTextFieldStudentName.getText());

        try {
        	
        	Connection conn = DatabaseConnection.getConnection();

            PreparedStatement prest;

            String sql = "SELECT * FROM student WHERE first_name LIKE  ?";

            prest = conn.prepareStatement(sql);
            prest.setString(1, st.getFirst_name() + "%");

            ResultSet rs = prest.executeQuery();

            String info = "";
            while (rs.next()) {
                System.out.println("");
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
                
                jTextFieldStudentID.setText(Integer.toString(st.getStudent_id()));
                jTextFieldFirstName.setText(st.getFirst_name());
                jTextFieldSurname.setText(st.getSurname());
                jTextFieldAddressLine1.setText(st.getAddress_line1());
                jTextFieldAddressLine2.setText(st.getAddress_line2());
                jTextFieldCounty.setText(st.getCounty());
                jTextFieldEircode.setText(st.getEircode());
                jTextFieldEmail.setText(st.getEmail());
                jTextFieldPhoneNumber.setText(st.getPhone_number());
                jTextFieldDateOfBirth.setText(st.getDate_of_birth());
                jTextFieldPPSN.setText(st.getPPSN());
                jComboBoxClassCode.setSelectedItem(st.getClass_group_code());

            }
            prest.close();
            rs.close();
            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {
    	if (!validateFields()) {
    	    return;
    	}
        Student st = new Student(jTextFieldStudentName.getText());
        st.setStudent_id(Integer.parseInt(jTextFieldStudentID.getText()));
        st.setFirst_name(jTextFieldFirstName.getText());
        st.setSurname(jTextFieldSurname.getText());
        st.setAddress_line1(jTextFieldAddressLine1.getText());
        st.setAddress_line2(jTextFieldAddressLine2.getText());
        st.setCounty(jTextFieldCounty.getText());
        st.setEircode(jTextFieldEircode.getText());
        st.setEmail(jTextFieldEmail.getText());
        st.setPhone_number(jTextFieldPhoneNumber.getText());
        st.setDate_of_birth(jTextFieldDateOfBirth.getText());
        st.setPPSN(jTextFieldPPSN.getText());
        st.setClass_group_code(((String) jComboBoxClassCode.getSelectedItem()).trim());

        try {

        	Connection conn = DatabaseConnection.getConnection();

            PreparedStatement prest;

            String sql= "UPDATE student SET first_name=?, "
            + "surname=?,address_line1=?,"
            + "address_line2=?, county=?,eircode=?,"
            + "email=?,phone_number=?,date_of_birth=?,ppsn=?, class_group_code=? "
            + "WHERE student_id=? ";

            prest = conn.prepareStatement(sql);
            

            prest.setString(1, st.getFirst_name());
            prest.setString(2,st.getSurname());
            prest.setString(3, st.getAddress_line1());
            prest.setString(4, st.getAddress_line2());
            prest.setString(5, st.getCounty());
            prest.setString(6, st.getEircode());
            prest.setString(7, st.getEmail());
            prest.setString(8, st.getPhone_number());
            prest.setString(9, st.getDate_of_birth());
            prest.setString(10, st.getPPSN());
            prest.setString(11, st.getClass_group_code());
            prest.setInt(12, st.getStudent_id());
            

            prest.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student updated successfully.");

            prest.close();

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {                                             
        clearForm();
    }

    
    private void clearForm() {
        jTextFieldStudentID.setText("");
        jTextFieldFirstName.setText("");
        jTextFieldSurname.setText("");
        jTextFieldAddressLine1.setText("");
        jTextFieldAddressLine2.setText("");
        jTextFieldCounty.setText("");
        jTextFieldEircode.setText("");
        jTextFieldEmail.setText("");
        jTextFieldPhoneNumber.setText("");
        jTextFieldDateOfBirth.setText("");
        jTextFieldPPSN.setText("");
        jComboBoxClassCode.setSelectedIndex(0);
    }
    
    private boolean validateFields() {

        // Required fields
        if (jTextFieldStudentID.getText().trim().isEmpty() ||
            jTextFieldFirstName.getText().trim().isEmpty() ||
            jTextFieldSurname.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Student ID, First Name and Surname are required.");
            return false;
        }

        // Student ID must be numeric
        try {
            Integer.parseInt(jTextFieldStudentID.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Student ID must be a number.");
            return false;
        }

        // Email must contain @
        String email = jTextFieldEmail.getText().trim();
        if (!email.isEmpty() && !email.contains("@")) {
            JOptionPane.showMessageDialog(this, "Invalid email address.");
            return false;
        }

        // Phone must be numeric
        String phone = jTextFieldPhoneNumber.getText().trim();
        if (!phone.isEmpty() && !phone.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Phone number must contain only digits.");
            return false;
        }

        // DOB basic check (dd/mm/yy or dd/mm/yyyy)
        String dob = jTextFieldDateOfBirth.getText().trim();
        if (!dob.matches("\\d{2}/\\d{2}/\\d{2,4}")) {
            JOptionPane.showMessageDialog(this, "Date of Birth must be in format DD/MM/YYYY.");
            return false;
        }

        return true; // Everything is valid
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
            java.util.logging.Logger.getLogger(studentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentUpdate().setVisible(true);
            }
        });
    }private void loadClassGroupCodes() {
    try {
        System.out.println("Loading Class Group Codes...");
        Connection conn = DatabaseConnection.getConnection();

        String sql = "SELECT class_group_code FROM class_group";
        PreparedStatement prest = conn.prepareStatement(sql);
        ResultSet rs = prest.executeQuery();

        jComboBoxClassCode.removeAllItems(); // Clear existing items

        while (rs.next()) {
            String classCode = rs.getString("class_group_code");
            jComboBoxClassCode.addItem(classCode); // Add each class group code
        }

        rs.close();
        prest.close();
        conn.close();
    } catch (Exception e) {
        System.out.println("Error loading class group codes: " + e);
    }
}

   
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox<String> jComboBoxClassCode;
    private javax.swing.JLabel jLabelAddressLine1;
    private javax.swing.JLabel jLabelAddressLine2;
    private javax.swing.JLabel jLabelCounty;
    private javax.swing.JLabel jLabelDateOfBirth;
    private javax.swing.JLabel jLabelEircode;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelPPSN;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelStudentID;
    private javax.swing.JLabel jLabelStudentName;
    private javax.swing.JLabel jLabelSurname;
    private javax.swing.JTextField jTextFieldAddressLine1;
    private javax.swing.JTextField jTextFieldAddressLine2;
    private javax.swing.JTextField jTextFieldCounty;
    private javax.swing.JTextField jTextFieldDateOfBirth;
    private javax.swing.JTextField jTextFieldEircode;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldPPSN;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldStudentID;
    private javax.swing.JTextField jTextFieldStudentName;
    private javax.swing.JTextField jTextFieldSurname;
    private javax.swing.JButton jButtonClear;
  
}
