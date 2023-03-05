package fifavm_russia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Charlie
 */
public class MatchConnection {
       private final Connection connection = DBConnection.createConnection();
    
    public ArrayList getMatch(String country){
        ArrayList<Match> list=new ArrayList<Match>();
         Statement statement;
         String sql = "SELECT * FROM `matches` WHERE `Match` LIKE '%"+country+"%'";
         
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            while(rs.next()) {
                   Match match = new Match(
                        rs.getString("match"));
                list.add(match); 
            }
            //System.out.println(list);
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(MatchConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
