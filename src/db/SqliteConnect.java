package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConnect {
    
    private String url = "jdbc:sqlite:E:/workspace_svn/java/dev/MakeTool/test.db";
    private String className = "org.sqlite.JDBC";
    private String user = null;
    private String pwd = null;
    
    public SqliteConnect() throws Exception{
        Class.forName(className);
    }
    
    public void setClassName(String className){
        this.className = className;
    }
    
    public void setUrl(String url){
        this.url = url;
    }
    
    public void setUser(String user){
        this.user = user;
    }
    
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    
    
    public Connection getConnection() throws SQLException{
        Connection c = DriverManager.getConnection(url);
        return c;
    }
    
}
