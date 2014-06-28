/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemcgl.controle;
import systemcgl.entidades.Sessao;
import systemcgl.entidades.Usuario;

/**
 *
 * @author zare
 */
public class ControleSessao {
    Sessao s;
    
    
    public boolean abrirSessao (Usuario usr) throws ClassNotFoundException{
        
        s = new Sessao(usr, true);
        if (ControleSenha.comparaSenha(usr)) 
            return true;
        else 
            return false;
        
        
    }
    
   public void fecharSessao (){
       Usuario usr = new Usuario();
       
       s = new Sessao(usr, false);
       
       
   } 
}
