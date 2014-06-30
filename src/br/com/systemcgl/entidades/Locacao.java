/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.entidades;

import java.text.DateFormat;

/**
 *
 * @author zare
 */
public class Locacao {

    
    private DateFormat dataLocacao;
    private int qtd_dias; 
    private Double valor;
    //situação da operação, se for true = entregue, se for false = pendente
    private boolean situacao;
    //lista dos equipamentos a serem locados. Recebe a id do equipamento
    private EquipsLocacao equips;

    private int id_cliente;
    private DateFormat dataEntrega;
    
    //Contrutor
    public Locacao(DateFormat dataLocacao, int qtd_dias, double valor, boolean situacao, EquipsLocacao equips, int id_cliente, DateFormat dataEntrega) {
        this.dataLocacao = dataLocacao;
        this.qtd_dias = qtd_dias;
        this.valor = valor;
        this.situacao = situacao;
        this.equips = equips;
        this.id_cliente = id_cliente;
        this.dataEntrega = dataEntrega;
    }


    //Getters e Setters
    public DateFormat getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(DateFormat dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public DateFormat getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(DateFormat dataLocacao) {
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

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }
    public EquipsLocacao getEquips() {
        return equips;
    }

    public void setEquips(EquipsLocacao equips) {
        this.equips = equips;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
}
