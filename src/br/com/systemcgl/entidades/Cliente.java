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
public class Cliente {


    private int    cod;
    private String nome;
    private String rg;
    private String cpf;
    private String endereco;
    private String estado;
    private String cidade;
    private String telefone;
    private String pendencias; //Sinaliza se o cliente possui ou não pendencias
    
    public Cliente(int cod, String nome, String rg, String cpf, String endereco, String cidade, String estado, String telefone, String pendencias) {
        this.cod = cod;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.estado = estado;
        this.cidade = cidade;
        this.telefone = telefone;
        this.pendencias = pendencias;
    }

    public Cliente(String nome, String rg, String cpf, String endereco, String cidade, String estado, String telefone) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        
    }
     public Cliente(int cod, String nome, String rg, String cpf, String endereco, String cidade, String estado, String telefone) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.cod = cod;
    }

    public int getCod() {
        return cod;
    }

    public void setId(int cod) {
        this.cod = cod;
    }
    
 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
       public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getPendencias() {
        return pendencias;
    }

    public void setPendencias(String pendencias) {
        this.pendencias = pendencias;
    }
}
