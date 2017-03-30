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
public class Questionare {
    private int ID;
    private String Name;
    private int User;
    
    public int getID()
    {
        return ID;
    }
    
    public final void setID(int value)
    {
        ID=value;
    }
    
    public int getUser()
    {
        return User;
    }
    
    public final void setUser(int value)
    {
        User=value;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public final void setName(String value)
    {
        Name=value;
    }
}
