
package DBLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
     private final String URL = "jdbc:mysql://localhost:3306/supplier";
private final String uname = "root";
    private final String password = "";
    private static DatabaseConnection instance; // bcz we dont wanna expose this class many times and if it is not private we can create unlimited connection to the database
    // And this is where the database will be initiated
    private Connection con; // this is to connect with database

    private DatabaseConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // this is to load driver to communicate with database
            con = DriverManager.getConnection(URL, uname, password);
            System.out.println("Connection Succesfull");
        } catch (SQLException ex) {
            System.out.println("Database connection error" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Class error" + ex.getMessage());
        }
    }

    public static DatabaseConnection getSingleInstance() {  // returns only one instance if we allow multiple objects to create it will be overloaded

        try {
            if (instance == null) {
                instance = new DatabaseConnection();
            } else if (instance.con.isClosed()) {
                instance = new DatabaseConnection();
            } else {
                return instance;
            }
            return instance;
        } catch (SQLException ex) {
            System.out.println("Database Connection Error" + ex.getMessage());
            return null;
        }

    }

    public boolean EecuteQuery(String sqlQ) {
        try {
            Statement st = con.createStatement();
            int result = st.executeUpdate(sqlQ);
            return result > 0;
        } catch (SQLException ex) {
            System.out.println("Database Connection Error" + ex.getMessage());
            return false;

        }
    }
}
