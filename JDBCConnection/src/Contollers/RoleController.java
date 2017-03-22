/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contollers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Алексей
 */
public class RoleController extends Controller{
    

    public  boolean Create(String Name)
    {
        try{
        Statement stmt = con.createStatement();
        String query = "INSERT INTO mydb.Roles (Name) VALUES('"+Name+"');";
        System.out.println(query);
        stmt.executeUpdate(query);
            
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    
    public  boolean Update(String Name, int ID)
    {
        try{
        Statement stmt = con.createStatement();
        stmt.executeUpdate("UPDATE mydb.Roles set Name='"+Name+"' WHERE ID="+ID+";");
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
        stmt.executeUpdate("DELETE FROM mydb.Roles WHERE ID="+ID+";");
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    public  List<Models.Role> Select()
    {
        try{
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.Roles;");
        List <Models.Role> u = new ArrayList<Models.Role>();
        while(rs.next())
        {
            Models.Role uu = new Models.Role();
            uu.setID(rs.getInt(1));
            uu.setName(rs.getString(2));
            u.add(uu);
        }
            return u;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public  Models.Role Select(int ID)
    {
         try{
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.Roles;");
        while(rs.next())
        {
            Models.Role uu = new Models.Role();
            uu.setID(rs.getInt(1));
            uu.setName(rs.getString(2));
            return uu;
        }
            throw new SQLException("Can`t find role with such ID");
        }
        catch(SQLException e)
        {
            return null;
        }
    }
}
