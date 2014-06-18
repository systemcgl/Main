/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemcgl;

import systemcgl.controle.*;
import systemcgl.entidades.*;
/**
 *
 * @author zare
 */
public class Fachada {
    private Usuario usuario = new Usuario();
    private ControleUsuario controleUsuario = new ControleUsuario();
    private ControleSenha controleSenha = new ControleSenha();

 

   
    
    
    public boolean criarUsuario (String nome, String id, String senha){
      
       boolean n = controleUsuario.salvarDados(nome, id, senha);
       
       
       
           
       
       
        return n;
    }
}
