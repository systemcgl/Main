
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl;
import br.com.systemcgl.screens.TelaLogin;
import java.sql.*;


/**
 *
 * @author zare
 */
public class Systemcgl {

     
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
 
       
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        
    // MenuPrincipal inicial = new MenuPrincipal();
     //inicial.setVisible(true);
        
    }
    
}
