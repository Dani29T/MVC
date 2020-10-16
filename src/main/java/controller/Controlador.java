/*
 * Responsable de las acciones que solicita la aplicacion 
 * en este caso guardar y visualizar en Jtable.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.EDatos;
import view.JFrameInicio;

/**
 * @author Erika Moreno
 * @author Daniela Rodriguez
 * @since 16/10/2020
 * @version 1.0
 */
public class Controlador implements ActionListener {
    // Instanciar
    EDatos persona = new EDatos();
    JFrameInicio vista = new JFrameInicio();
    DefaultTableModel modelo = new DefaultTableModel();
    
    //Constructor de la clase
    public Controlador() {
    }
    /**
     * 
     * @param evento 
     */
    @Override
    public void actionPerformed(ActionEvent evento) {   
        persona.setCodigo(vista.txtCodigo.getText());
        persona.setMateria(vista.txtMateria.getText());
        persona.setNombre(vista.txtNombre.getText());
        Controlador c = null;
        persona.mostrar();
     
    }
    
    public void visualizar(JTable tabla){
        modelo = (DefaultTableModel)tabla.getModel();
        
    }
   
}
