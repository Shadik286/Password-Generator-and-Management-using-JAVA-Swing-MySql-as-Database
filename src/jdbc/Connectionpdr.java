package jdbc;
import java.sql.*;

/**
 *
 * @author NR's ZONE
 */
public class Connectionpdr {
    public static Connection getCon() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost: 3306/server", "root", "");
            return connection;
        }       
        catch(Exception e) {
            return null;
        }
    }
    
}