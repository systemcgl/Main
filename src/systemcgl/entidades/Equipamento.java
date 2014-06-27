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
public class Equipamento {

    
    private String nome;
    private String marca;
    private String modelo;
    private String serial;
    private Double valorLoca;
    
     public Equipamento (){
        
    }
    public Equipamento(String nome, String marca, String modelo, String serial, Double valorLoca) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.valorLoca = valorLoca;
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
    
    
}
