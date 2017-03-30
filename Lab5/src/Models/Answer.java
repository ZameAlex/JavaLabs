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
public class Answer {
    
    private int ID;
    private String Text;
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
