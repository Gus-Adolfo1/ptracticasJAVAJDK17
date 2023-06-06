/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapoo;

/**
 *
 * @author Gustavo
 */
public class Masajista extends AdministracionF {
    
     public String titulacion;
    public int añosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int añosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
     public void darMasaje() {
        System.out.println("Dando en los pechos a los futbolistas...");
    }
  
    @Override
    public void concentrarse() {
        System.out.println("Masajista concentrándose para consentir a los jugadores...");
    }
}
