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
public class PrestamoFijo extends Prestamo {

    @Override
    public ArrayList generarCuotas() {
        
        int i=0;
     //obtengo la cantidad de cuotas seleccionadas
           double cuotas=this.getCantcuotas();
          //ejemplo con un 78% de interes
           double interes=0.78;
        double monto= this.getMonto();
        double capital;
        double capitalProvisorio=0;
       ArrayList<Cuota> listcuotas = new ArrayList();
       //uso el for para ir creando cuota por cuota e añadirla a un arraylist
        for(i=1; i<=cuotas; i++){
        Cuota cuota= new Cuota();
        //el interes por cuota lo calculo sacando el interes total y lo divido por la cantidad de cuotas
        cuota.setInteres((monto*interes)/cuotas);
        //el monto definitivo es el monto puro + el valor del interes de la cuota
        cuota.setMonto((monto/cuotas)+cuota.getInteres());
        //el capital se va restando a medida que se van pagando las cuotas correspondientes
     
        cuota.setMontosininteres(monto/cuotas);
        if(i==1){
            capital=(this.getMonto()-cuota.getMontosininteres());
            capitalProvisorio=capital;
            cuota.setCapital(capital);
        } else{
            capital=(capitalProvisorio-cuota.getMontosininteres());
            capitalProvisorio=capital;
            cuota.setCapital(capital);
        }
        
            cuota.setNum("Cuota numero: " + i);
            listcuotas.add(cuota);
        }        
        //retorno el arraylist con todas las cuotas correspondientes
       return listcuotas;
        }
      
    @Override
    //recibo el arraylist anterior para mostrarlo
    public void mostrarCuotas(ArrayList<Cuota> cuotas) {
        ArrayList<Cuota> mcuotas=cuotas;
        Persona persona= new Persona();
        persona.setNombre(this.getPersona().getNombre());
        persona.setApellido(this.getPersona().getApellido());
        persona.setDocumento(this.getPersona().getDocumento());

        
        System.out.println(persona.toString());
        for(Cuota cuota: mcuotas){
            System.out.println(cuota.toString());
        }
        
    }
    }

 
    

