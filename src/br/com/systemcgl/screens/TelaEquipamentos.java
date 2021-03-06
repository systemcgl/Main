/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.systemcgl.screens;

import br.com.systemcgl.Fachada;
import br.com.systemcgl.entidades.Equipamento;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.lang.Object;
import javax.swing.table.DefaultTableModel;
import javax.swing.JDesktopPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author zare
 */
public class TelaEquipamentos extends javax.swing.JInternalFrame {
    Fachada f = new Fachada() ;
    ResultSet rs ;
    Equipamento eq = new Equipamento();
    JDesktopPane jd;
    
    /**
     * Creates new form TelaEquipamentos
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public TelaEquipamentos() throws ClassNotFoundException, SQLException  {
        initComponents();
        
        JTableEquip.setModel(DbUtils.resultSetToTableModel(f.mostraTEquip())); 
        
        
    }

    public TelaEquipamentos (JDesktopPane jd) throws ClassNotFoundException, SQLException{
        this();
        
        this.jd = jd;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTableEquip = new javax.swing.JTable();
        CampoBusca = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();
        Remover = new javax.swing.JButton();
        Cadastrar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Equipamentos");
        setAutoscrolls(true);

        JTableEquip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Marca", "Modelo", "Nº de Serie", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTableEquip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableEquipMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableEquip);

        CampoBusca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CampoBuscaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CampoBuscaKeyReleased(evt);
            }
        });

        jLabel1.setText("Pesquisa:");

        Editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemcgl/icones/Edit-20x20.png"))); // NOI18N
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Remover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemcgl/icones/Delete-Alt-20x20.png"))); // NOI18N
        Remover.setText("Remover");
        Remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverActionPerformed(evt);
            }
        });

        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/systemcgl/icones/Add-Alt-20x20.png"))); // NOI18N
        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(CampoBusca))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Editar)
                        .addGap(18, 18, 18)
                        .addComponent(Remover)
                        .addGap(18, 18, 18)
                        .addComponent(Cadastrar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Editar)
                    .addComponent(Remover)
                    .addComponent(Cadastrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(25, 25, 25))
        );

        getAccessibleContext().setAccessibleDescription("Equipamentos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(this, "Confirmar a exclusão do Equipamento?", "Excluir", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_NO_OPTION) {

            try {
                f.rmEquip(eq);
                JOptionPane.showMessageDialog(rootPane, "Euipamento excluido com Sucesso!!");
                JTableEquip.setModel(DbUtils.resultSetToTableModel(f.mostraTEquip()));
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(TelaEquipamentos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_RemoverActionPerformed

    private void JTableEquipMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableEquipMouseClicked
        // TODO add your handling code here:
        String codTemp ;
        int seleciona = JTableEquip.getSelectedRow();
        codTemp = (JTableEquip.getModel().getValueAt(seleciona, 0).toString());
        String vltemp; 
        eq.setCod(Integer.parseInt(codTemp));
        eq.setNome(JTableEquip.getModel().getValueAt(seleciona, 1).toString());
        eq.setMarca(JTableEquip.getModel().getValueAt(seleciona, 2).toString());
        eq.setModelo(JTableEquip.getModel().getValueAt(seleciona, 3).toString());
        eq.setSerial(JTableEquip.getModel().getValueAt(seleciona, 4).toString());
        vltemp = (JTableEquip.getModel().getValueAt(seleciona, 5).toString());
        eq.setValorLoca(Double.parseDouble(vltemp));
        eq.setDisponivel(JTableEquip.getModel().getValueAt(seleciona, 6).toString());
        System.out.println("selecionou o equipamento de código: "+eq.getCod());
    }//GEN-LAST:event_JTableEquipMouseClicked

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        TelaEditEquip tee;
        try {
            tee = new TelaEditEquip(eq, JTableEquip);
            tee.setVisible(true);
            tee.setLocation(jd.getWidth()/2 - tee.getWidth()/2, jd.getHeight()/2 - tee.getHeight()/2);
            jd.add(tee);
        } catch (NullPointerException e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_EditarActionPerformed

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // TODO add your handling code here:
        TelaCadEquip cadEquip = new TelaCadEquip(JTableEquip);
        cadEquip.setVisible(true);
        cadEquip.setLocation(jd.getWidth()/2 - cadEquip.getWidth()/2, jd.getHeight()/2 - cadEquip.getHeight()/2) ;
        jd.add(cadEquip);
    }//GEN-LAST:event_CadastrarActionPerformed

    private void CampoBuscaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoBuscaKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CampoBuscaKeyPressed

    private void CampoBuscaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoBuscaKeyReleased
        // TODO add your handling code here:
        
        String busca = CampoBusca.getText();
        try {

            JTableEquip.setModel(DbUtils.resultSetToTableModel(f.busca("equip", busca)));
            if (busca.equals("")) {
                JTableEquip.setModel(DbUtils.resultSetToTableModel(f.mostraTEquip()));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaEquipamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CampoBuscaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTextField CampoBusca;
    private javax.swing.JButton Editar;
    private javax.swing.JTable JTableEquip;
    private javax.swing.JButton Remover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
