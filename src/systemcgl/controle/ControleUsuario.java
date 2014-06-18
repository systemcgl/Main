/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemcgl.controle;


import systemcgl.entidades.*;

/**
 *
 * @author zare
 */
public class ControleUsuario {
    

//Metodos    
  public boolean salvarDados(String nome, String id, String senha){
      
      boolean valid = false;
      //validar
      if (nome.length() != 0 && id.length() != 0 && senha.length() != 0) {
          valid = true;
        //Enviar os dados para serem salvos  
          
      }
      return valid;
  }
    
}
