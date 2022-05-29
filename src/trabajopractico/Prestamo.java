/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico;

import java.util.ArrayList;

/**
 *
 * @author Leonel.Arguello
 */
public abstract class Prestamo {
    private double monto;
    private Integer cantcuotas;
    private Persona persona;
     private ArrayList <Cuota> cuotas;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Integer getCantcuotas() {
        return cantcuotas;
    }

    public void setCantcuotas(Integer cantcuotas) {
        this.cantcuotas = cantcuotas;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

//cargar el arraylist de cuotas con los datos correspondientes a cada tipo de prestamo
 public abstract ArrayList generarCuotas();
    

 //mostrar el monto de cada cuota del prestamo
 public abstract void mostrarCuotas(ArrayList<Cuota> cuotas);
}
