/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Алексей
 */
public class User {
    private int ID;
    private String Login;
    private String Password;
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
