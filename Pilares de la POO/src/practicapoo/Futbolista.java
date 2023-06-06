/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapoo;

/**
 *
 * @author Gustavo
 */
public class Futbolista extends AdministracionF {
    
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal,String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    public void jugarPartido() {
        System.out.println("Jugando partido, sacando lo brasileño..");
    }
  
    public void entrenar() {
        System.out.println("Entrenando como dice el bichoooo...");
    }
    
    @Override
    public void concentrarse() {
        System.out.println("Futbolista concentrándose para dar lo mejor de él...");
    }
     @Override
    public void viajar() {
        System.out.println("vamos a viajar lejos...");
    }
}
