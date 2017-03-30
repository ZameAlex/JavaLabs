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
public class Question {
    private int ID;
    private String Text;
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
