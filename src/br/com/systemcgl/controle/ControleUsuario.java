/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.controle;


import br.com.systemcgl.repositorio.RepositorioUsuario;
import br.com.systemcgl.entidades.Usuario;
import br.com.systemcgl.entidades.Administrador;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author zare
 */
public class ControleUsuario {
 
 RepositorioUsuario ru = new RepositorioUsuario();  
   
   

//Metodos    
  public boolean salvarUsuario(String nome, String id, String senha) throws ClassNotFoundException {
      
      
      //validar
      if (nome.length() != 0 && id.length() != 0 && senha.length() != 0) {
       
          //Criptografar Senha
          
          senha = ControleSenha.criptoSenha(senha);
          
          //Enviar os dados para serem salvos  

          if (nome.equals("Administrador")) {
              Administrador user = new Administrador(nome, id, senha);
              System.out.println("Obj user criado ");
              
              ru.svUsr(user);
          } else {
              Usuario user = new Usuario(nome, id, senha);
              System.out.println("Obj user criado");
              
              ru.svUsr(user);
          }
          
          return true;
      
      }else return false;

      
  }
    
  public ResultSet listarUsuarios() throws ClassNotFoundException {
      
      
      
      
      
      return ru.getTDados();
      
      
  }
  
  
  public boolean rmUser ( Usuario usr) throws ClassNotFoundException{
      
      
     
     
     ru.removeUsrDB(usr.getId());
     
     
     return true; 
      
  }
          
          
   public String getTipo(String id) throws ClassNotFoundException{
       
       return ru.selectTipo(id);
   }       
  
}
