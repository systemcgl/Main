/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.entidades;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author zare
 */
public class Locacao {

    
    private Date dataLocacao;
    private int qtd_dias; 
    private Double valor;
    //situação da operação, se for true = entregue, se for false = pendente
    private String situacao;
    //lista dos equipamentos a serem locados. Recebe a id do equipamento
    private ArrayList<Integer> equips[];

    private int codCliente;
    private Date dataEntrega;
    
    //Contrutor
    public Locacao(Date dataLocacao, int codCliente, ArrayList<Integer> equips, Date dataEntrega, double valor, String situacao) {
        this.dataLocacao = dataLocacao;
        this.valor = valor;
        this.situacao = situacao;
        this.codCliente = codCliente;
        this.dataEntrega = dataEntrega;
    }



    //Getters e Setters
    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public int getQtd_dias() {
        return qtd_dias;
    }

    public void setQtd_dias(int qtd_dias) {
        this.qtd_dias = qtd_dias;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }


    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

   
    
    
}
