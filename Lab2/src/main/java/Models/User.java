/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import javax.persistence.*;
/**
 *
 * @author Алексей
 */
@Entity
@Table(name = "User")
@NamedQuery(name="User.getAll",query="SELECT a from User a")
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    @Column(name = "Login")
    private String Login;
    @Column(name = "Password")
    private String Password;
    @ManyToOne(fetch = FetchType.EAGER)
    private int Role;
    
    public int getID()
    {
        return ID;
    }
    
    public final void setID(int value)
    {
        ID=value;
    }
    
    public int getRole()
    {
        return Role;
    }
    
    public final void setRole(int value)
    {
        Role=value;
    }  
    
    
    public String getLogin()
    {
        return Login;
    }
    
    public final void setLogin(String value)
    {
        Login=value;
    }
    
     public String getPassword()
    {
        return Password;
    }
    
    public final void setPassword(String value)
    {
        Password=value;
    }
    
}
