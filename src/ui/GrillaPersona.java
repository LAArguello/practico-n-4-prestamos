/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import trabajopractico.Persona;

/**
 *
 * @author Leonel.Arguello
 */
public class GrillaPersona  extends AbstractTableModel {
    
private ArrayList<Persona> listadoPersonas;

    public GrillaPersona(ArrayList<Persona> listadoPersonas) {
        this.listadoPersonas = listadoPersonas;
    }

    GrillaPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String getColumnName(int Column){
        switch(Column){
            case 0: return "Nombre";
            case 1: return "Apellido";
            case 2: return "Tipo Documento";
            default: return "";
        }
        
    }

    @Override
    public int getRowCount() {
        return listadoPersonas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona p = listadoPersonas.get(rowIndex);
        switch(columnIndex){
            case 0: return p.getNombre();
            case 1: return p.getApellido();
            case 2: return p.getTipo();
            default: return "";
        }
    }
    
}
