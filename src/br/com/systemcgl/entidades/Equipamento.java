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
public class Equipamento {

    private int cod;
    private String nome;
    private String marca;
    private String modelo;
    private String serial;
    private Double valorLoca;
    private String disponivel;

    public Equipamento() {

    }

    public Equipamento(String nome, String marca, String modelo, String serial, Double valorLoca) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.valorLoca = valorLoca;
        this.disponivel = "Sim";
        
    }

    public Equipamento(String nome, String marca, String modelo, String serial, Double valorLoca, String disponivel) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.valorLoca = valorLoca;
        this.disponivel = disponivel;
    }

    public Equipamento(int cod, String nome, String marca, String modelo, String serial, Double valorLoca, String disponivel) {
        this.cod = cod;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.valorLoca = valorLoca;
        this.disponivel = disponivel;
    }
    

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Double getValorLoca() {
        return valorLoca;
    }

    public void setValorLoca(Double valorLoca) {
        this.valorLoca = valorLoca;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

}
