/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.entidades;

/**
 *
 * @author zare
 */
public class Usuario {


    
    protected String nome;
    protected String id;
    protected String senha;

    

   

   
    protected  String tipo = "usuario";

      public Usuario() {
        
    }
   
   
      
    public Usuario(String nome, String id, String senha) {
        this.nome = nome;
        this.id = id;
        this.senha = senha;
        
    }
    
    public Usuario(String id, String senha) {
        
        this.id = id;
        this.senha = senha;
        
    }
    
        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

 public String getTipo() {
        return tipo;
    }
    
   public void setTipo(String tipo) {
        this.tipo = tipo;
    } 
}
