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
public class PrestamoFrances extends Prestamo {

  @Override
    public ArrayList generarCuotas() {
        
        int i=0;
     //obtengo la cantidad de cuotas seleccionadas
           double cuotas=this.getCantcuotas();
          //ejemplo con un 5% de interes
           double interes=0.05;
           double capitalparcial=this.getMonto();
           double capital;
           double cuotapura;
        double monto= this.getMonto();
                   Double var=monto;
       ArrayList<Cuota> listcuotas = new ArrayList();
       //uso el for para ir creando cuota por cuota e añadirla a un arraylist
        for(i=1; i<=cuotas; i++){
        Cuota cuota= new Cuota();
        double numpotencia= (1+0.05);
        double potencia= Math.pow(numpotencia, -cuotas);
        double cuotaDefinitiva=((monto*interes)/(1-potencia));
        //el monto de la cuota final lleva incluido el valor del interes
        cuota.setMonto(cuotaDefinitiva);
        //el capital parcial sirve para calcular el interes 
        //el interes de la cuota es el interes del 0.05 multiplicado por el capital

        if (i==1){
          cuota.setInteres((capitalparcial*interes));
            cuotapura=cuotaDefinitiva-cuota.getInteres();
        cuota.setMontosininteres(cuotapura);
        cuota.setCapital(var-cuotapura);
                  var=cuota.getCapital();


        }
        if (i>1){
         
        cuotapura=cuotaDefinitiva-(var*interes);
         cuota.setInteres((var*interes));
        cuota.setMontosininteres(cuotapura);
            capital=var-cuotapura;
            var=capital;
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
