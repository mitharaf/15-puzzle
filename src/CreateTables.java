

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {
    
    public static void createNewTable() {
        
        String sql = """
                     CREATE TABLE IF NOT EXISTS PlayerDetails (
                        Name text,
                        Moves integer,
                        Time integer
                     );""";
        
        try{
            Connection conn = Connect.getConnection();
            Statement stmt = conn.createStatement();
            stmt.execute(sql);
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}