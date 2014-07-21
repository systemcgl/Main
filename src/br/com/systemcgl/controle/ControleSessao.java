/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.controle;
import br.com.systemcgl.entidades.Sessao;
import br.com.systemcgl.entidades.Usuario;

/**
 *
 * @author zare
 */
public class ControleSessao {
    Sessao s = new Sessao();
    ControleUsuario ctu = new ControleUsuario();
    
    public Sessao sessaoId (Usuario usr) throws ClassNotFoundException {
        
        s.setId(usr.getId());
        if (ctu.getTipo(usr.getId()).equals("admin")) {
            s.setAdm(true);
        } else {
            s.setAdm(false);
        }
        if (ControleSenha.comparaSenha(usr)) {
            s.setAuth(true);
        } else {
            s.setAuth(false);
        }
        
        return s;           
    }
    
 
    
}
