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
@Table(name = "Role")
@NamedQuery(name="Role.getAll",query="SELECT a from Role a")

public class Role {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    @Column(name = "Name")
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
