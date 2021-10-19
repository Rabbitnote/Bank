package controller;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBconnection {
    public static Connection getMSSQLConnection() throws Exception{
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String database = "db62130500209";
            String host = "202.44.9.117";
            String user = "db62130500209";
            String password = "EzyI9296";
            String url = String.format("jdbc:sqlserver://%s;databaseName=%s;user=%s;password=%s", host, database, user, password);
            Connection conn = DriverManager.getConnection(url);
            return conn;
        }
        catch(Exception e){
            e.printStackTrace();
            throw e;
        }
    }
}
