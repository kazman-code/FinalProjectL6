/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.system;

/**
 *
 * @author 35387
 */
public class Student extends Person {
	//holds information unique to students
    
    private int student_id;

    private String class_group_code;
    
    
     public Student(String first_name){
        this.first_name=first_name;
        
    }
     public Student(int student_id){
        this.student_id=student_id;
        
    }

    /**
     * @return the student_id
     */
    public int getStudent_id() {
        return student_id;
    }

    /**
     * @param student_id the student_id to set
     */
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    /**
     * @return the class_group_code
     */
    public String getClass_group_code() {
        return class_group_code;
    }

    /**
     * @param class_group_code the class_group_code to set
     */
    public void setClass_group_code(String class_group_code) {
        this.class_group_code = class_group_code;
    }

    String getCourse_code() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setCourse_code(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
