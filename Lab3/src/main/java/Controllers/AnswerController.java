/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Алексей
 */
public class AnswerController  extends Controller{
    
       
    public  boolean Create(String Text, int Question)
    {
        try{
        Statement stmt = con.createStatement();
        String query = "INSERT INTO mydb.Answer (Text,Question) VALUES('"+Text+"',"+Question+");";
        System.out.println(query);
        stmt.executeUpdate(query);
            
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    
    public  boolean Update(String Text,  int Question, int ID)
    {
        try{
        Statement stmt = con.createStatement();
        stmt.executeUpdate("UPDATE mydb.Answer set Text='"+Text+"',Question="+Question+" WHERE ID="+ID+";");
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
        stmt.executeUpdate("DELETE FROM mydb.Answer WHERE ID="+ID+";");
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    public  List<Models.Answer> Select()
    {
        try{
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.Answer;");
        List <Models.Answer> u = new ArrayList<Models.Answer>();
        while(rs.next())
        {
            Models.Answer uu = new Models.Answer();
            uu.setID(rs.getInt(1));
            uu.setText(rs.getString(2));
            uu.setQuestion(rs.getInt(3));
            u.add(uu);
        }
            return u;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public  Models.Answer Select(int ID)
    {
        try{
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.Answer WHERE ID="+ID+";");
        while(rs.next())
        {
            Models.Answer uu = new Models.Answer();
            uu.setID(rs.getInt(1));
            uu.setText(rs.getString(2));
            uu.setQuestion(rs.getInt(3));
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
