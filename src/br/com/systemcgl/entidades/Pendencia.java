/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.entidades;

/**
 *
 * @author zaretux
 */
public class Pendencia {

 
    private int codCliente;
    private int codLocacao;
    private int pedencia;
    
       public Pendencia(int codCliente, int codLocacao, int pedencia) {
        this.codCliente = codCliente;
        this.codLocacao = codLocacao;
        this.pedencia = pedencia;
    }

    public int getPedencia() {
        return pedencia;
    }

    public void setPedencia(int pedencia) {
        this.pedencia = pedencia;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getCodLocacao() {
        return codLocacao;
    }

    public void setCodLocacao(int codLocacao) {
        this.codLocacao = codLocacao;
    }
       
       
}
