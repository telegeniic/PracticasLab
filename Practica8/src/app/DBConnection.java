package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public Connection dbConnection() throws ClassNotFoundException, SQLException{
        Connection conect;
        String myDriver = "com.mysql.jdbc.Driver";
        String myUrl = "jdbc:mysql://localhost/test";
        String usr = "root";
        String pass = "1838264";
        Class.forName(myDriver);
        conect = DriverManager.getConnection(myUrl, usr, pass);
        return conect;
    }
}