/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcconnection;
import Controllers.AnswerController;
import Controllers.QuestionController;
import Controllers.QuestionareController;
import Controllers.RoleController;
import Controllers.UserController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

/**
 *
 * @author Алексей
 */
public class JDBCConnection {

    static Connection conn;
    public static Connection getConn() {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        
        if(conn!=null)
            return conn;
        else
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "123");
        return conn;
        }
        catch(Exception e) {
        //System.out.println("Where is your MySQL JDBC Driver?");
        e.printStackTrace();
        return null;
        }   
        
        
        // TODO code application logic here
    }
    
}
