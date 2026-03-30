
package my.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;


public class staffUpdate extends javax.swing.JFrame {



    public staffUpdate() {
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

        jTextFieldStaffName = new javax.swing.JTextField();
        jLabelStaffName = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jLabelStaffID = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelSurname = new javax.swing.JLabel();
        jLabelAddressLine1 = new javax.swing.JLabel();
        jLabelAddressLine2 = new javax.swing.JLabel();
        jLabelCounty = new javax.swing.JLabel();
        jLabelEircode = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPhoneNumber = new javax.swing.JLabel();
        jLabelDateOfBirth = new javax.swing.JLabel();
        jLabelPPSN = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        jTextFieldStaffID = new javax.swing.JTextField();
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
        jButtonDelete = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });


        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelStaffName.setText("Staff Name");

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabelStaffID.setText("Staff ID");

        jLabelFirstName.setText("First Name");

        jLabelSurname.setText("Surname");

        jLabelAddressLine1.setText("Address Line 1");

        jLabelAddressLine2.setText("Address Line 2");

        jLabelCounty.setText("County");

        jLabelEircode.setText("Eircode");

        jLabelEmail.setText("Email");

        jLabelPhoneNumber.setText("Phone Number");

        jLabelDateOfBirth.setText("Date of Birth");

        jLabelPPSN.setText("PPSN");

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(24)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabelStaffName)
        					.addGap(36)
        					.addComponent(jTextFieldStaffName, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabelDateOfBirth, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jLabelPPSN, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabelEmail, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabelFirstName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabelSurname, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabelEircode, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
        								.addComponent(jLabelStaffID, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabelAddressLine1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabelAddressLine2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jLabelCounty, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
        							.addComponent(jLabelPhoneNumber)))
        					.addGap(69)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(jTextFieldStaffID, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        						.addComponent(jTextFieldFirstName, Alignment.LEADING)
        						.addComponent(jTextFieldSurname)
        						.addComponent(jTextFieldAddressLine1)
        						.addComponent(jTextFieldAddressLine2)
        						.addComponent(jTextFieldCounty)
        						.addComponent(jTextFieldEircode)
        						.addComponent(jTextFieldEmail)
        						.addComponent(jTextFieldPhoneNumber)
        						.addComponent(jTextFieldDateOfBirth)
        						.addComponent(jTextFieldPPSN))))
        			.addPreferredGap(ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
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
        							.addComponent(jButtonUpdate)
        							.addComponent(jButtonClear)))
        					.addGap(28))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(35)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelStaffName)
        				.addComponent(jTextFieldStaffName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonSearch))
        			.addGap(32)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelStaffID)
        				.addComponent(jTextFieldStaffID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonAdd))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelFirstName)
        				.addComponent(jTextFieldFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonUpdate))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelSurname)
        				.addComponent(jTextFieldSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonClear))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelAddressLine1)
        				.addComponent(jTextFieldAddressLine1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonDelete))
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
        				.addComponent(jTextFieldEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonBack))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelPhoneNumber)
        				.addComponent(jTextFieldPhoneNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelDateOfBirth)
        				.addComponent(jTextFieldDateOfBirth, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabelPPSN)
        				.addComponent(jTextFieldPPSN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(17, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {
        Staff s = new Staff(jTextFieldStaffName.getText());
        
        try {
            
        	Connection conn = DatabaseConnection.getConnection();

            PreparedStatement prest;

            String sql = "SELECT * FROM staff WHERE first_name LIKE  ?";

            prest = conn.prepareStatement(sql);
            prest.setString(1, s.getFirst_name() + "%");

            ResultSet rs = prest.executeQuery();

            String info = "";
            while (rs.next()) {
                System.out.println("");
                s.setStaff_id(rs.getInt(1));
                s.setFirst_name(rs.getString(2));
                s.setSurname(rs.getString(3));
                s.setAddress_line1(rs.getString(4));
                s.setAddress_line2(rs.getString(5));
                s.setCounty(rs.getString(6));
                s.setEircode(rs.getString(7));
                s.setEmail(rs.getString(8));
                s.setPhone_number(rs.getString(9));
                s.setDate_of_birth(rs.getString(10));
                s.setPPSN(rs.getString(11));
                jTextFieldStaffID.setText(Integer.toString(s.getStaff_id()));
                jTextFieldFirstName.setText(s.getFirst_name());
                jTextFieldSurname.setText(s.getSurname());
                jTextFieldAddressLine1.setText(s.getAddress_line1());
                jTextFieldAddressLine2.setText(s.getAddress_line2());
                jTextFieldCounty.setText(s.getCounty());
                jTextFieldEircode.setText(s.getEircode());
                jTextFieldEmail.setText(s.getEmail());
                jTextFieldPhoneNumber.setText(s.getPhone_number());
                jTextFieldDateOfBirth.setText(s.getDate_of_birth());
                jTextFieldPPSN.setText(s.getPPSN());

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

         Staff s = new Staff(jTextFieldStaffName.getText());

    s.setStaff_id(Integer.parseInt(jTextFieldStaffID.getText()));
    s.setFirst_name(jTextFieldFirstName.getText());
    s.setSurname(jTextFieldSurname.getText());
    s.setAddress_line1(jTextFieldAddressLine1.getText());
    s.setAddress_line2(jTextFieldAddressLine2.getText());
    s.setCounty(jTextFieldCounty.getText());
    s.setEircode(jTextFieldEircode.getText());
    s.setEmail(jTextFieldEmail.getText());
    s.setPhone_number(jTextFieldPhoneNumber.getText());
    s.setDate_of_birth(jTextFieldDateOfBirth.getText());
    s.setPPSN(jTextFieldPPSN.getText());

    try {
    	Connection conn = DatabaseConnection.getConnection();

        String sql = "UPDATE staff SET first_name=?, surname=?, address_line1=?, "
                   + "address_line2=?, county=?, eircode=?, email=?, phone_number=?, "
                   + "date_of_birth=?, ppsn=? WHERE staff_id=?";

        PreparedStatement prest = conn.prepareStatement(sql);
        prest.setString(1, s.getFirst_name());
        prest.setString(2, s.getSurname());
        prest.setString(3, s.getAddress_line1());
        prest.setString(4, s.getAddress_line2()); 
        prest.setString(5, s.getCounty());
        prest.setString(6, s.getEircode());
        prest.setString(7, s.getEmail());
        prest.setString(8, s.getPhone_number());
        prest.setString(9, s.getDate_of_birth());
        prest.setString(10, s.getPPSN());
        prest.setInt(11, s.getStaff_id()); 

        prest.executeUpdate();
        JOptionPane.showMessageDialog(this, "Staff updated successfully.");


        prest.close();
        conn.close();
        

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        
    
        }               
        
        
    }

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        Staff s = new Staff(jTextFieldStaffName.getText());
        
        s.setStaff_id(Integer.parseInt(jTextFieldStaffID.getText()));
        s.setFirst_name(jTextFieldFirstName.getText());
        
          int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete " + s.getFirst_name()+ " from "
                + "your records");

        if (confirm == 0) {
            System.out.println("confirming delete");
             try {
            
            	 Connection conn = DatabaseConnection.getConnection();

            PreparedStatement prest;

            String sql = "DELETE FROM staff WHERE staff_id= ?";
                    

            prest = conn.prepareStatement(sql);
            prest.setInt(1, s.getStaff_id());
            
            int del = prest.executeUpdate();
            JOptionPane.showMessageDialog(this, "Staff deleted successfully.");
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
    	    return;
    	}

         Staff s = new Staff(jTextFieldStaffName.getText());
        s.setStaff_id(Integer.parseInt(jTextFieldStaffID.getText()));
        s.setFirst_name(jTextFieldFirstName.getText());
        s.setSurname(jTextFieldSurname.getText());
        s.setAddress_line1(jTextFieldAddressLine1.getText());
        s.setAddress_line2(jTextFieldAddressLine2.getText());
        s.setCounty(jTextFieldCounty.getText());
        s.setEircode(jTextFieldEircode.getText());
        s.setEmail(jTextFieldEmail.getText());
        s.setPhone_number(jTextFieldPhoneNumber.getText());
        s.setDate_of_birth(jTextFieldDateOfBirth.getText());
        s.setPPSN(jTextFieldPPSN.getText());
       
        
         try {
            
        	 Connection conn = DatabaseConnection.getConnection();

            PreparedStatement prest;

            String sql= "INSERT INTO staff " +
"                           (staff_id,first_name,surname,address_line1,address_line2,county,eircode,email,phone_number,date_of_birth,ppsn)" +
"                           VALUES (?,?,?,?,?,?,?,?,?,?,?)";
                    

            prest = conn.prepareStatement(sql);
            
            prest.setInt(1, s.getStaff_id());
            prest.setString(2, s.getFirst_name());
            prest.setString(3, s.getSurname());
            prest.setString(4, s.getAddress_line1());
            prest.setString(5, s.getAddress_line2());
            prest.setString(6, s.getCounty());
            prest.setString(7, s.getEircode());
            prest.setString(8, s.getEmail());
            prest.setString(9, s.getPhone_number());
            prest.setString(10, s.getDate_of_birth());
            prest.setString(11, s.getPPSN());
          


                 prest.executeUpdate();
                 
                  JOptionPane.showMessageDialog(null, "A new staff member, "+s.getFirst_name()+ ""
                    + ", has been added to the database" );
                  clearForm();
            conn.close();
            prest.close();           
           

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
    	Options opt = new Options();
    	opt.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(staffUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffUpdate().setVisible(true);
            }
        });
    }
    
    private void clearForm() {
        jTextFieldStaffID.setText("");
        jTextFieldStaffName.setText("");
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
    }
    
    private boolean validateFields() {

        if (jTextFieldStaffID.getText().trim().isEmpty() ||
            jTextFieldFirstName.getText().trim().isEmpty() ||
            jTextFieldSurname.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Staff ID, First Name and Surname are required.");
            return false;
        }

        try {
            Integer.parseInt(jTextFieldStaffID.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Staff ID must be a number.");
            return false;
        }

        String email = jTextFieldEmail.getText().trim();
        if (!email.isEmpty() && !email.contains("@")) {
            JOptionPane.showMessageDialog(this, "Invalid email address.");
            return false;
        }

        String phone = jTextFieldPhoneNumber.getText().trim();
        if (!phone.isEmpty() && !phone.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Phone number must contain only digits.");
            return false;
        }

        String dob = jTextFieldDateOfBirth.getText().trim();
        if (!dob.matches("\\d{2}/\\d{2}/\\d{2,4}")) {
            JOptionPane.showMessageDialog(this, "Date of Birth must be in format DD/MM/YYYY.");
            return false;
        }

        return true;
    }
    
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {                                             
        clearForm();
    }

   
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelAddressLine1;
    private javax.swing.JLabel jLabelAddressLine2;
    private javax.swing.JLabel jLabelCounty;
    private javax.swing.JLabel jLabelDateOfBirth;
    private javax.swing.JLabel jLabelEircode;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelPPSN;
    private javax.swing.JLabel jLabelPhoneNumber;
    private javax.swing.JLabel jLabelStaffID;
    private javax.swing.JLabel jLabelStaffName;
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
    private javax.swing.JTextField jTextFieldStaffID;
    private javax.swing.JTextField jTextFieldStaffName;
    private javax.swing.JTextField jTextFieldSurname;
    private javax.swing.JButton jButtonClear;
}
