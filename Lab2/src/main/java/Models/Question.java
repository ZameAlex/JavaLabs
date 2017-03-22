/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
/**
 *
 * @author Алексей
 */
@Entity
@Table(name = "Question")
public class Question {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    @Column(name = "Text")
    private String Text;
    @ManyToOne(fetch = FetchType.EAGER)
    private int Questionare;
    
    public int getID()
    {
        return ID;
    }
    
    public final void setID(int value)
    {
        ID=value;
    }
    
    public int getQuestionare()
    {
        return Questionare;
    }
    
    public final void setQuestionare(int value)
    {
        Questionare=value;
    }
    
    public String getText()
    {
        return Text;
    }
    
    public final void setText(String value)
    {
        Text=value;
    }
    
}
