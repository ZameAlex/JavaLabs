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
@Table(name = "Answer")
@NamedQuery(name="Answer.getAll",query="SELECT a from Answer a")
public class Answer {
    
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;
    @Column(name = "Text")
    private String Text;
    @ManyToOne(fetch = FetchType.EAGER)
    private int Question;
    
    
  public int getID()
    {
        return ID;
    }
    
    public final void setID(int value)
    {
        ID=value;
    }
    
    public int getQuestion()
    {
        return Question;
    }
    
    public final void setQuestion(int value)
    {
        Question=value;
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
