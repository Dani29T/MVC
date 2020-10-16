/*
 * Clase donde se accede a la informacion y tambien actualiza su estado
 */
package model;

import controller.Controlador;
import java.awt.SystemColor;
import java.util.ArrayList;
import view.JFrameInicio;

/**
 * @author Erika Moreno
 * @author Daniela Rodriguez
 * @since 16/10/2020
 * @version 1.0
 */
public class EDatos {
    //Atributos de la clase
    private String codigo;
    private String nombre;
    private String materia;
    JFrameInicio vista = new JFrameInicio();

    // constructor
    public EDatos() {
    }
    /**
     * 
     * @param codigo
     * @param nombre
     * @param materia 
     */
    public EDatos(String codigo, String nombre, String materia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.materia = materia;
    }
    
    // Get and set

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }  
    //Muestra los datos ingresados por el usuario
    public void mostrar(){
        ArrayList<EDatos> lista= new ArrayList<EDatos>();
        String matrix[][]= new String [lista.size()][3];
        
        for (int i = 0; i < lista.size(); i++) {
            matrix[i][0]= lista.get(i).getCodigo();
            matrix[i][1]= lista.get(i).getNombre();
            matrix[i][2]= lista.get(i).getMateria();
        }
        vista.jTVisualizar.setModel(new javax.swing.table.DefaultTableModel(
           matrix,
           new String []{
               "Codigo", "Nombre", "Materia"
           }
        
        ));
    }

}
