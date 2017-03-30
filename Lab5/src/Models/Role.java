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
public class Role {
    private int ID;
    private String Name;
    
    public int getID()
    {
        return ID;
    }
    
    public final void setID(int value)
    {
        ID=value;
    }
    
    public String getName()
    {
        return Name;
    }
    
    public final void setName(String value)
    {
        Name = value;
    }
}
