/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package systemcgl.controle;

import systemcgl.entidades.Equipamento;
import systemcgl.repositorio.RepositorioEquipamento;

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
        
        RepositorioEquipamento re = new RepositorioEquipamento();
        
        re.svEquipDB(nome, marca, modelo, serial, valor);
        
        
        
        
        
        
    }
    
}
