/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Алексей
 */
public  class UserController extends Controller{
    
       
    public  boolean Create(String Login, String Password, int Role)
    {
        try{
        Statement stmt = con.createStatement();
        String query = "INSERT INTO mydb.User (Login,Password,Role) VALUES('"+Login+"','"+Password+"',"+Role+");";
        System.out.println(query);
        stmt.executeUpdate(query);
            
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    
    public  boolean Update(String Login, String Password, int Role, int ID)
    {
        try{
        Statement stmt = con.createStatement();
        stmt.executeUpdate("UPDATE mydb.User set Login='"+Login+"',Password='"+Password+"',Role="+Role+" WHERE ID="+ID+";");
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    
    public  boolean Delete(int ID)
    {
        try{
        Statement stmt = con.createStatement();
        stmt.executeUpdate("DELETE FROM mydb.User WHERE ID="+ID+";");
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    public  List<Models.User> Select()
    {
        try{
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.User;");
        List <Models.User> u = new ArrayList<Models.User>();
        while(rs.next())
        {
            Models.User uu = new Models.User();
            uu.setID(rs.getInt(1));
            uu.setLogin(rs.getString(2));
            uu.setPassword(rs.getString(3));
            uu.setRole(rs.getInt(4));
            u.add(uu);
        }
            return u;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public  Models.User Select(int ID)
    {
        try{
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.User WHERE ID="+ID+";");
        while(rs.next())
        {
            Models.User uu = new Models.User();
            uu.setID(rs.getInt(1));
            uu.setLogin(rs.getString(2));
            uu.setPassword(rs.getString(3));
            uu.setRole(rs.getInt(4));
            return uu;
        }
            throw new SQLException("Can`t find user with such ID");
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
}
