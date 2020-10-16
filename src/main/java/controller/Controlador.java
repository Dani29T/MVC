/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.EDatos;
import view.JFrameInicio;

/**
 *
 * @author GOS
 */
public class Controlador implements ActionListener {
    // Instanciar
    EDatos persona = new EDatos();
    JFrameInicio vista = new JFrameInicio();
    DefaultTableModel modelo = new DefaultTableModel();
    
    // contructor
    public Controlador (JFrameInicio v){
        this.vista = v;
        this.vista.btnGuardar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void visualizar(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        
    }
            
}
