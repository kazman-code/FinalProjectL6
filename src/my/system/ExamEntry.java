
package my.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ExamEntry extends javax.swing.JFrame {
private Student currentStudent;

    public ExamEntry() {
        initComponents();
        //Database connection code
        try {
            Connection conn = DatabaseConnection.getConnection();
            System.out.println("Connected!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

   
    @SuppressWarnings("unchecked")
  
    private void initComponents() {
    	//initialises components
        jComboBoxModule = new javax.swing.JComboBox<>();
        jTextFieldAssignment1 = new javax.swing.JTextField();
        jTextFieldAssignment2 = new javax.swing.JTextField();
        jTextFieldExam = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInfo = new javax.swing.JTextArea();
        jButtonAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldStudentName = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        
        //closes window when moving to another window
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldAssignment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAssignment1ActionPerformed(evt);
            }
        });

        jTextFieldExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldExamActionPerformed(evt);
            }
        });

        jTextAreaInfo.setEditable(false);
        jTextAreaInfo.setColumns(20);
        jTextAreaInfo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInfo);

        jButtonAdd.setText("Submit Results");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Assessment 1");

        jLabel2.setText("Assessment 2");

        jLabel3.setText("Exam");

        jTextFieldStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStudentNameActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabel4.setText("Select Module");

        jToggleButton1.setText("Back");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        
        jButtonClear = new javax.swing.JButton();
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(29)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        										.addGroup(layout.createParallelGroup(Alignment.LEADING)
        											.addGroup(layout.createSequentialGroup()
        												.addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        												.addGap(51)
        												.addComponent(jTextFieldExam, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
        											.addGroup(layout.createSequentialGroup()
        												.addGap(105)
        												.addComponent(jTextFieldStudentName, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
        										.addComponent(jComboBoxModule, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
        									.addGap(0, 4, Short.MAX_VALUE))
        								.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        									.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        									.addPreferredGap(ComponentPlacement.UNRELATED)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(jTextFieldAssignment1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
        										.addComponent(jTextFieldAssignment2, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
        									.addGap(41))))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(23)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(jLabel1)
        								.addComponent(jLabel4))
        							.addGap(18)
        							.addComponent(jButtonAdd)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(jButtonClear)))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(41)
        							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jButtonSearch)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(98)
        					.addComponent(jToggleButton1, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(16)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jTextFieldStudentName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jButtonSearch))
        			.addGap(39)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jComboBoxModule, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(131)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1)
        						.addComponent(jTextFieldAssignment1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel2)
        						.addComponent(jTextFieldAssignment2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(15)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jTextFieldExam, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel3))
        					.addGap(62)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jButtonAdd)
        						.addComponent(jButtonClear)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
        			.addComponent(jToggleButton1)
        			.addGap(31))
        );
        getContentPane().setLayout(layout);
        pack();
    }

    private void jTextFieldAssignment1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {                                           

        //validation

        //Student is selected
        if (currentStudent == null || currentStudent.getStudent_id() == 0) {
            JOptionPane.showMessageDialog(this, "Please search for a student first.");
            return;
        }

        //Module is selected
        if (jComboBoxModule.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a module.");
            return;
        }

        //Fields must not be empty
        if (jTextFieldAssignment1.getText().trim().isEmpty() ||
            jTextFieldAssignment2.getText().trim().isEmpty() ||
            jTextFieldExam.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please fill in all assessment fields.");
            return;
        }

        //Fields must be numeric
        double assignment_1, assignment_2, exam;

        try {
            assignment_1 = Double.parseDouble(jTextFieldAssignment1.getText().trim());
            assignment_2 = Double.parseDouble(jTextFieldAssignment2.getText().trim());
            exam = Double.parseDouble(jTextFieldExam.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Assessment fields must be numbers only.");
            return;
        }

        // 5. Range validation
        if (assignment_1 < 0 || assignment_1 > 20) {
            JOptionPane.showMessageDialog(this, "Assignment 1 must be between 0 and 20.");
            return;
        }

        if (assignment_2 < 0 || assignment_2 > 20) {
            JOptionPane.showMessageDialog(this, "Assignment 2 must be between 0 and 20.");
            return;
        }

        if (exam < 0 || exam > 60) {
            JOptionPane.showMessageDialog(this, "Exam must be between 0 and 60.");
            return;
        }

        //end of validation


        // Calculate overall result
        double overall = assignment_1 + assignment_2 + exam;
        String moduleName = (String) jComboBoxModule.getSelectedItem();

        try {
            Connection conn = DatabaseConnection.getConnection();

            // Check if assessment already exists
            String checkSql = "SELECT * FROM assessment WHERE student_id = ? AND module_name = ?";
            PreparedStatement checkPrest = conn.prepareStatement(checkSql);
            checkPrest.setInt(1, currentStudent.getStudent_id());
            checkPrest.setString(2, moduleName);

            ResultSet checkRs = checkPrest.executeQuery();

            if (checkRs.next()) {
                //update existing record
                String updateSql = "UPDATE assessment SET assignment_1 = ?, assignment_2 = ?, exam = ?, result = ? "
                        + "WHERE student_id = ? AND module_name = ?";

                PreparedStatement updatePrest = conn.prepareStatement(updateSql);
                updatePrest.setDouble(1, assignment_1);
                updatePrest.setDouble(2, assignment_2);
                updatePrest.setDouble(3, exam);
                updatePrest.setDouble(4, overall);
                updatePrest.setInt(5, currentStudent.getStudent_id());
                updatePrest.setString(6, moduleName);

                updatePrest.executeUpdate();
                JOptionPane.showMessageDialog(this, "Assessment updated successfully for " + currentStudent.getFirst_name());

                updatePrest.close();

            } else {
                // insert new record
                String insertSql = "INSERT INTO assessment (assignment_1, assignment_2, exam, result, module_name, student_id) "
                        + "VALUES (?, ?, ?, ?, ?, ?)";

                PreparedStatement insertPrest = conn.prepareStatement(insertSql);
                insertPrest.setDouble(1, assignment_1);
                insertPrest.setDouble(2, assignment_2);
                insertPrest.setDouble(3, exam);
                insertPrest.setDouble(4, overall);
                insertPrest.setString(5, moduleName);
                insertPrest.setInt(6, currentStudent.getStudent_id());

                insertPrest.executeUpdate();
                JOptionPane.showMessageDialog(this, "Assessment added successfully for " + currentStudent.getFirst_name());

                insertPrest.close();
            }

            checkRs.close();
            checkPrest.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error saving assessment.");
        }

        //Refresh the student info panel
        jButtonSearchActionPerformed(null);
    }
    private void jTextFieldStudentNameActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {
        currentStudent = new Student(jTextFieldStudentName.getText());

        try {
        	Connection conn = DatabaseConnection.getConnection();


            PreparedStatement prest;

            String sql = "SELECT student.student_id, student.first_name, student.surname, class_group.course_code "
                    + "FROM student "
                    + "INNER JOIN class_group ON student.class_group_code = class_group.class_group_code "
                    + "WHERE student.first_name LIKE ?";

            prest = conn.prepareStatement(sql);
            prest.setString(1, currentStudent.getFirst_name() + "%");
            ResultSet rs = prest.executeQuery();

            String info = "";
            String course_code = "";

            if (rs.next()) {

                currentStudent.setStudent_id(rs.getInt("student_id"));
                currentStudent.setFirst_name(rs.getString("first_name"));
                currentStudent.setSurname(rs.getString("surname"));
                course_code = rs.getString("course_code");

                System.out.println("Course Code: " + course_code);

                info += "ID: " + currentStudent.getStudent_id() + "\n";
                info += "First Name: " + currentStudent.getFirst_name() + "\n";
                info += "Surname: " + currentStudent.getSurname() + "\n";
                info += "Course Code: " + course_code + "\n";
                
                 String marksSql = "SELECT assignment_1, assignment_2, exam FROM assessment WHERE student_id = ?";
            PreparedStatement marksPrest = conn.prepareStatement(marksSql);
            marksPrest.setInt(1, currentStudent.getStudent_id());
            ResultSet marksRs = marksPrest.executeQuery();
             if (marksRs.next()) {
                double assignment1 = marksRs.getDouble("assignment_1");
                double assignment2 = marksRs.getDouble("assignment_2");
                double exam = marksRs.getDouble("exam");

                info += "\nAssignment 1: " + assignment1;
                info += "\nAssignment 2: " + assignment2;
                info += "\nExam: " + exam;
            } else {
                info += "\nNo assessment records found.";
            }
              marksRs.close();
            marksPrest.close();

            

                jTextAreaInfo.setText(info);
            } else {
                JOptionPane.showMessageDialog(null, "No student found");
                jTextAreaInfo.setText("");
                jComboBoxModule.removeAllItems();
            }

            prest.close();
            rs.close();

            if (!course_code.isEmpty()) {
                String moduleSql = "SELECT module_name FROM module WHERE course_code = ?";
                PreparedStatement modulePrest = conn.prepareStatement(moduleSql);
                modulePrest.setString(1, course_code);

                ResultSet moduleRs = modulePrest.executeQuery();

                jComboBoxModule.removeAllItems();

                boolean foundModules = false;
                while (moduleRs.next()) {
                    String module_name = moduleRs.getString("module_name");
                    jComboBoxModule.addItem(module_name);
                    foundModules = true;
                }

                if (!foundModules) {
                    jComboBoxModule.addItem("No modules found");
                }

                modulePrest.close();
                moduleRs.close();
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jTextFieldExamActionPerformed(java.awt.event.ActionEvent evt) {
      
    }

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(ExamEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamEntry().setVisible(true);
            }
        });
    }
    
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {                                            
        clearForm();
    }
    
    private void clearForm() {
        jTextFieldAssignment1.setText("");
        jTextFieldAssignment2.setText("");
        jTextFieldExam.setText("");
        jTextAreaInfo.setText("");
        jComboBoxModule.setSelectedIndex(-1);
    }

    //variables declaration
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxModule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInfo;
    private javax.swing.JTextField jTextFieldAssignment1;
    private javax.swing.JTextField jTextFieldAssignment2;
    private javax.swing.JTextField jTextFieldExam;
    private javax.swing.JTextField jTextFieldStudentName;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jButtonClear;
 
}
