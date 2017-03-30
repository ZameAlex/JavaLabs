/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.sql.Connection;

/**
 *
 * @author Алексей
 */
public class Controller {
    protected Connection con;
    
    public final void setCon(Connection value)
    {
        con = value;
    }
    
}
