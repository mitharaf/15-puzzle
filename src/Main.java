
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
//        
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);

        CreateDB.createNewDatabase("Players.db");
       CreateTables.createNewTable();
        
      //  InsertData.insert("Kiyara", 242, 126);
//       //String sql1 = "SELECT * FROM PlayerDetails";
//String sql1 = "SELECT Name, Time, Moves FROM PlayerDetails ORDER BY Time ASC LIMIT 10";
////String sql1 = "DROP TABLE  PlayerDetails";
//////        
//        try {
//            Connection conn = Connect.getConnection();
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery(sql1);
//            
//            while (rs.next()) {
//                System.out.println(
//                        rs.getString("Name") + "\t\t" +
//                        rs.getInt("Moves") + "\t\t" +
//                        rs.getInt("Time")
//                                
//                );
//            }
//        } 
//        catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        
//        
//           

    }
}
