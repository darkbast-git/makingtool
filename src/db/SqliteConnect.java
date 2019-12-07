package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConnect {
    
    private String url = "jdbc:sqlite:C:/temp/test.db";
    private String className = "org.sqlite.JDBC";
    
    public SqliteConnect() throws Exception{
        Class.forName(className);
    }
    
    
    public Connection getConnection() throws SQLException{
        Connection c = DriverManager.getConnection(url);
        return c;
    }
    
}
