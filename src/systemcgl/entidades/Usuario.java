/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemcgl.entidades;

/**
 *
 * @author zare
 */
public class Usuario {


    
    private String nome;
    private String id;
    private String senha;

   
    private String tipo;

      public Usuario() {
        
    }
    
    public Usuario(String nome, String id, String senha, String tipo) {
        this.nome = nome;
        this.id = id;
        this.senha = senha;
        this.tipo = tipo;
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


    
    
}
