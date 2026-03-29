package my.system;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/universityproject";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}