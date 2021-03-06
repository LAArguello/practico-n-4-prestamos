/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico;

/**
 *
 * @author Leonel.Arguello
 */
public class Persona {
    private String nombre;
    private String apellido;
    private TipoDocumento tipo;

    public TipoDocumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumento tipo) {
        this.tipo = tipo;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

   

    @Override
    public String toString() {
        return "nombre y apellido del interesado/a: " + nombre + " "+ apellido + ", DNI:" + tipo ;
    }
    
}

   