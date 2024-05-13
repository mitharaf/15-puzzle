

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {
    public static void insert(String name, int moves, int time) {
        String sql = "INSERT INTO PlayerDetails(Name, Moves, Time) VALUES(?,?,?)";
        try{
            Connection conn = Connect.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setInt(2, moves);
            pstmt.setInt(3, time);
            pstmt.executeUpdate();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
