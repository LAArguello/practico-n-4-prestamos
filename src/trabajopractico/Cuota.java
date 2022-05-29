/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico;

/**
 *
 * @author Leonel.Arguello
 */
public class Cuota {
    private double capital;
    private double interes;
    private double monto;
    private double montopuro;

    public double getMontosininteres() {
        return montopuro;
    }

    public void setMontosininteres(double montosininteres) {
        this.montopuro = montosininteres;
    }
    private String num;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "La cuota esta compuesta por: {" + "capital= " + capital + ", interes x cuota= " + interes + ",  cuota sin interes incluido: " + montopuro + ", monto de cuota final =" + monto +" " + num + '}';
    }
    
    
}
