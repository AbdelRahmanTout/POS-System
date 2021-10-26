package TechnicalServices.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

//cette class contient 2 methods 
//1-getConnection(pour faire une connection au database)
//2-closeConnection(pour fermer la connection)

public class Datasource {

    private static Connection con = null;

    public static Connection getConnection() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/sys";
            String usr = "root";
            String pass = "rootroot";

            try {
                con = DriverManager.getConnection(url, usr, pass);
            } catch (SQLException ex) {
                Logger.getLogger(Datasource.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        return con;
    }

    public static void closeConnection() {
        if (con != null) {
            try {
                con.close();
                con = null;
                DriverManager.getConnection("jdbc:mysql://localhost:3306/sys;shutdown=true");
            } catch (SQLException ex) {
                //Logger.getLogger(Datasource.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


    
