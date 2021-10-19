package controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Query {
    Connection conn;
    PreparedStatement preparedStatement;
    public Query() throws Exception {
        conn = DBconnection.getMSSQLConnection();
    }
    public void addRequest(String firstname, String lastname,String Requester, String Equip_repair, String Reason_repair,String Request_At,String Requestatus,String Approver,String Approve_At) throws Exception{
        try{
            String query = String.format("INSERT INTO dbo.Requests (firstname, lastname,Requester, Equip_repair, Reason_repair,Request_At,Requestatus,Approver,Approve_At) VALUES ('%s', '%s', '%s', '%s', '%s','%s','%s','%s','%s')", firstname, lastname,Requester, Equip_repair, Reason_repair,Request_At,Requestatus,Approver,Approve_At);
            System.out.println(query);
            preparedStatement = conn.prepareStatement(query);
            preparedStatement.execute();
        }
        catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

}
