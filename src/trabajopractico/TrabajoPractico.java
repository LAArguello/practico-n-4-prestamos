/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopractico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leonel.Arguello
 */
public class TrabajoPractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String entrada="";
        System.out.println("Sistema de prestamos bancarios: bienvenido");
        System.out.println("Presione 1 para prestamo fijo o 2 para el frances");
        Scanner escaner= new Scanner(System.in);
        entrada= escaner.nextLine();
        if(entrada.equals("1")){
         PrestamoFijo prestamo2= new PrestamoFijo();
         System.out.println("Perfecto, Ingrese el nombre de la persona interesada: ...");
         entrada=escaner.nextLine();
         Persona persona= new Persona();
         persona.setNombre(entrada);
         System.out.println("Perfecto, Ingrese el apellido de la persona interesada: ...");
          entrada=escaner.nextLine();
         persona.setApellido(entrada);
         System.out.println("Perfecto, ahora el D.N.I sin puntos de la persona interesada: ...");
         entrada=escaner.nextLine();
         persona.setDocumento(entrada);
          prestamo2.setPersona(persona);

         System.out.println("Ingrese el monto del prestamo que quiere solicitar: ...");
         entrada=escaner.nextLine();
         double valor=Double.parseDouble(entrada);
     prestamo2.setMonto(valor);
      System.out.println("Ingrese las cuotas en las que quiere pagar el prestamo que quiere solicitar: ...");
      Integer entrada2=escaner.nextInt();
     prestamo2.setCantcuotas(entrada2);
      ArrayList<Cuota> cuotas2= prestamo2.generarCuotas();
     System.out.println("El prestamo simulado es el siguiente: ...");

     prestamo2.mostrarCuotas(cuotas2);


        } else{
              PrestamoFrances prestamo2= new PrestamoFrances();
         System.out.println("Perfecto, Ingrese el nombre de la persona interesada: ...");
         entrada=escaner.nextLine();
         Persona persona= new Persona();
         persona.setNombre(entrada);
         System.out.println("Perfecto, Ingrese el apellido de la persona interesada: ...");
          entrada=escaner.nextLine();
         persona.setApellido(entrada);
         System.out.println("Perfecto, ahora el D.N.I sin puntos de la persona interesada: ...");
         entrada=escaner.nextLine();
         persona.setDocumento(entrada);
          prestamo2.setPersona(persona);

         System.out.println("Ingrese el monto del prestamo que quiere solicitar: ...");
         entrada=escaner.nextLine();
         double valor=Double.parseDouble(entrada);
     prestamo2.setMonto(valor);
      System.out.println("Ingrese las cuotas en las que quiere pagar el prestamo que quiere solicitar: ...");
      Integer entrada2=escaner.nextInt();
     prestamo2.setCantcuotas(entrada2);
      ArrayList<Cuota> cuotas2= prestamo2.generarCuotas();
     System.out.println("El prestamo simulado es el siguiente: ...");

     prestamo2.mostrarCuotas(cuotas2);
        }
           
        
     //Crear una persona para el prestamo
    
    

    }
    
}
