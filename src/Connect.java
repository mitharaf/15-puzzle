

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    public static Connection getConnection() {
    String url = "jdbc:sqlite:src/sqlite/Players.db";
    Connection conn = null;
    try {
        conn = DriverManager.getConnection(url);
    } 
    catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return conn;
    }
}