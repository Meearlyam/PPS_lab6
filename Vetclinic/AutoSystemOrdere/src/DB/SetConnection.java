package DB;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class SetConnection {
    public Connection setConnectDB(String pathToDB){

        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            String dbPath = "jdbc:sqlite:C:\\Users\\Asus\\IdeaProjects\\Vetclinic\\AutoSystemOrdere\\VetDB.db";
            connection = DriverManager.getConnection(dbPath);
            //Context ctx = new InitialContext();
            //DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/sqlite");

            //connection = ds.getConnection();
        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }

        return connection;
    }

    public void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

