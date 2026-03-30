# FinalProjectL6
This project is a desktop-based Student and Staff Management System built using Java Swing and MySQL.
The project allows users to:
-Add, update, delete and search Student records
-Add, update, delete and search Student records
-Search for Staff by name or ID
-Display and Edit details like address, contact information, and PPSN
-Uses a form based GUI for data entry

   Technologies
- Java 17
- Java Swing (GUI)
- Eclipse IDE
- MySQL (Database)
- JDBC (Database Connection)
- Github and Git

  How to Run the Project
  1.Clone this repository
  git clone https://github.com/kazman-code/FinalProjectL6.git

 2.Import the project into Eclipse
    Open Eclipse
    File --> Import --> Existing Projects into Workspace
    Select project folder

  3.Set up the Database
  CREATE DATABASE finalproject;
  USE finalproject;

  Create a staff table
  CREATE TABLE staff (
    staff_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    surname VARCHAR(50),
    address_line1 VARCHAR(100),
    address_line2 VARCHAR(100),
    county VARCHAR(50),
    eircode VARCHAR(10),
    email VARCHAR(100),
    phone_number VARCHAR(20),
    date_of_birth VARCHAR(20),
    ppsn VARCHAR(20)
  );

  Create a student table
  CREATE TABLE student (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    surname VARCHAR(50),
    address_line1 VARCHAR(100),
    address_line2 VARCHAR(100),
    county VARCHAR(50),
    eircode VARCHAR(10),
    email VARCHAR(100),
    phone_number VARCHAR(20),
    date_of_birth VARCHAR(20),
    ppsn VARCHAR(20)
);

  4. Update DatabaseConnection.java
  I put in generic data for the username and password, you will have to replace them with your own credentials
  private static final String USERNAME = "root";
  private static final String PASSWORD = "yourpassword";

  5. Run the application
  Launch any of the main GUI screens, like StaffSearchFrame.java or studentSearchFrame.java

## AI Acknowledgment
- **Copilot**: Used for debugging Java Swing Logic, and identifying an issue in an update method and improving ID search 
- No other AI tools were used during the development

- All suggestions were reviewed and tested before implementation.
 


    
