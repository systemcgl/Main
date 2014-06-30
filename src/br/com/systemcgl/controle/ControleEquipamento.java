/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.controle;

import br.com.systemcgl.entidades.Equipamento;
import br.com.systemcgl.repositorio.RepositorioEquipamento;

/**
 *
 * @author zaretux
 */
public class ControleEquipamento {
  
    
    public void addEquip (Equipamento eq) throws ClassNotFoundException {
        
        String nome = eq.getNome();
        String marca = eq.getMarca();
        String modelo = eq.getModelo();
        String serial = eq.getSerial();
        double valor = eq.getValorLoca();
        boolean dispo = true;
        RepositorioEquipamento re = new RepositorioEquipamento();
        
        re.svEquipDB(nome, marca, modelo, serial, valor, dispo);
        
        
        
        
        
        
    }
    
}
