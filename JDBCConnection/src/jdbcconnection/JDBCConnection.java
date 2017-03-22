/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcconnection;
import Contollers.AnswerController;
import Contollers.QuestionController;
import Contollers.QuestionareController;
import Contollers.RoleController;
import Contollers.UserController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

/**
 *
 * @author Алексей
 */
public class JDBCConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.jdbc.Driver");
        
        
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root", "123");
        Contollers.UserController uc= new UserController();
        Contollers.AnswerController ac = new AnswerController();
        Contollers.QuestionController qc = new QuestionController();
        Contollers.RoleController rc = new RoleController();
        Contollers.QuestionareController qec = new QuestionareController();
        uc.setCon(conn);
        ac.setCon(conn);
        rc.setCon(conn);
        qc.setCon(conn);
        qec.setCon(conn);
        rc.Create("Admin");
        rc.Create("User");
        uc.Create("1", "1", 1);
        uc.Create("2", "2", 2);
        List<Models.User> ul = uc.Select();
        for(int i=0;i<ul.size();i++)
            System.out.println(ul.get(i).getID()+" "+ul.get(i).getLogin());
        uc.Update("3", "2", 2, 2);
        Models.User u = uc.Select(2);
        System.out.println(u.getLogin());
        qec.Create("first", 2);
        qc.Create("text1", 1);
        qc.Create("text2", 1);
        ac.Create("answer1", 1);
        ac.Create("answer2", 1);
        ac.Create("answer3", 2);
        ac.Create("answer4", 2);
        List<Models.Answer> al = ac.Select();
        for(int i=0;i<al.size();i++)
            System.out.println(al.get(i).getID()+" "+al.get(i).getText()+" "+al.get(i).getQuestion());
        ac.Update("text3", 1, 1);
        Models.Answer a = ac.Select(1);
        System.out.println(a.getID()+" "+a.getText()+" "+a.getQuestion());
            
                } 
        catch(Exception e) {
        System.out.println("Where is your MySQL JDBC Driver?");
        e.printStackTrace();
        return;
        }   
        
        
        // TODO code application logic here
    }
    
}
