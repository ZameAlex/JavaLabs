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
public class QuestionController extends Controller{
    
       
    public  boolean Create(String Text, int Questionare)
    {
        try{
        Statement stmt = con.createStatement();
        String query = "INSERT INTO mydb.Question (Text,Questionare) VALUES('"+Text+"',"+Questionare+");";
        System.out.println(query);
        stmt.executeUpdate(query);
            
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    
    public  boolean Update(String Text,  int Questionare, int ID)
    {
        try{
        Statement stmt = con.createStatement();
        stmt.executeUpdate("UPDATE mydb.Question set Text='"+Text+"',Questionare="+Questionare+" WHERE ID="+ID+";");
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
        stmt.executeUpdate("DELETE FROM mydb.Question WHERE ID="+ID+";");
        return true;
        }
        catch(SQLException e)
        {
            return false;
        }
    }
    public  List<Models.Question> Select()
    {
        try{
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.Question;");
        List <Models.Question> u = new ArrayList<Models.Question>();
        while(rs.next())
        {
            Models.Question uu = new Models.Question();
            uu.setID(rs.getInt(1));
            uu.setText(rs.getString(2));
            uu.setQuestionare(rs.getInt(3));
            u.add(uu);
        }
            return u;
        }
        catch(SQLException e)
        {
            return null;
        }
    }
    
    public  Models.Question Select(int ID)
    {
        try{
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM mydb.Question WHERE ID="+ID+";");
        while(rs.next())
        {
            Models.Question uu = new Models.Question();
            uu.setID(rs.getInt(1));
            uu.setText(rs.getString(2));
            uu.setQuestionare(rs.getInt(3));
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
