package fifavm_russia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Charlie
 */
public class DBConnection {
     final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost/fifavm";
    final static String username = "root";
    final static String password = "root";

    /**
     * This method makes the connection to the database.
     * @return an Connection
     */
    public static Connection createConnection() {

        Connection connection;
        try {
            Class.forName(DBConnection.JDBC_DRIVER); //This code is forcing the code to load and initialize
            
            /*  Attemps to establish a connection to the given database URL. The DriverManager attempts to 
                select an appropiate driver from the set of registered JDBC drivers
            */
            connection = DriverManager.getConnection(DBConnection.DB_URL, DBConnection.username, DBConnection.password);
            return connection;

        } catch (ClassNotFoundException | SQLException e) { // If no connection made, then it catch an ClassNotFoundException or SQLException.
            System.err.println(e);
            return null;
        }
       
    } 
}
