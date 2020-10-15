/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author GOS
 */
public class EDatos {
    //Atributos de la clase
    private int codigo;
    private String nombre;
    private String materia;
    
    // constructor
    public EDatos() {
    }
    
    public EDatos(int codigo, String nombre, String materia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.materia = materia;
    }
    
    // Get and set

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
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
    
}
