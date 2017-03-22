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
public class QuestionareController extends Controller{
    
       
    public  boolean Create(String Name, int User)
    {
        try{
        Statement stmt = con.createStatement();
        String query = "INSERT INTO mydb.Questionare (Name,User) VALUES('"+Name+"',"+User+");";
        System.out.println(query);
        stmt.executeUpdate(query);
            
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    
    public  boolean Update(String Name,  int User, int ID)
    {
        try{
        Statement stmt = con.createStatement();
        stmt.executeUpdate("UPDATE mydb.Questionare set Name='"+Name+"',User="+User+" WHERE ID="+ID+";");
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
        stmt.executeUpdate("DELETE FROM mydb.Questionare WHERE ID="+ID+";");
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    public  List<Models.Questionare> Select()
    {
        try{
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.Questionare;");
        List <Models.Questionare> u = new ArrayList<Models.Questionare>();
        while(rs.next())
        {
            Models.Questionare uu = new Models.Questionare();
            uu.setID(rs.getInt(1));
            uu.setName(rs.getString(2));
            uu.setUser(rs.getInt(3));
            u.add(uu);
        }
            return u;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public  Models.Questionare Select(int ID)
    {
        try{
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.Questionare WHERE ID="+ID+";");
        while(rs.next())
        {
            Models.Questionare uu = new Models.Questionare();
            uu.setID(rs.getInt(1));
            uu.setName(rs.getString(2));
            uu.setUser(rs.getInt(3));
            return uu;
        }
            throw new SQLException("Can`t find answer with such ID");
        }
        catch(SQLException e)
        {
            return null;
        }
    }
}
