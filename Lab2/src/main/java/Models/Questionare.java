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
@Table(name = "Questionare")
@NamedQuery(name="Questionare.getAll",query="SELECT a from Questionare a")
public class Questionare {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    @Column(name = "Name")
    private String Name;
    @ManyToOne(fetch = FetchType.EAGER)
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
