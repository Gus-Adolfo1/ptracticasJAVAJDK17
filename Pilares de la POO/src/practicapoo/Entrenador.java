/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicapoo;

/**
 *
 * @author Gustavo
 */
public class Entrenador extends AdministracionF {
    
    private String idFederacion;

     public Entrenador(int id, String nombre, String apellido, int edad, String idFederacion ) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
     
     public void dirigirPartido() {
        System.out.println("Dirigiendo partido al estilo de pep guardiola...");
    }
  
    public void dirigirEntrenamiento() {
        System.out.println("Dirigiendo entrenamiento a un solo toque ...");
    }
}
