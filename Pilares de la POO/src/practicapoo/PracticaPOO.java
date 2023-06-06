/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicapoo;

/**
 *
 * @author Gustavo
 */
public class PracticaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Entrenador en = new Entrenador(1,"Kevin","Miranda",25,"20");
          Masajista masajista = new Masajista(2,"Gustavo","Munoz",30,"Terapeuta",5);
          Futbolista futbolista = new Futbolista(2, "Adonis", "Molina", 20, 5, "Volante Ofensivo");
       
       System.out.println("Datos del entrenador: Id: "  + en.id +  " Nombre: " + en.nombre + " Apellido: " + en.apellido + " Edad: " + en.edad);
        en.dirigirPartido();
        en.dirigirEntrenamiento();
        
      
        
        System.out.println("Datos del masajista: Id "  + masajista.id + " Nombre: " + masajista.nombre + "  Apellido " + masajista.apellido + " edad:  " 
                +masajista.edad + " años de experiencia: " + masajista.añosExperiencia );
        masajista.concentrarse();
        masajista.darMasaje();
        
         System.out.println("Datos del futbolista: Id "  + futbolista.id + " Nombre: " + futbolista.nombre + "  Apellido " + futbolista.apellido + " edad:  " + futbolista.edad + " dorsal: " + futbolista.getDorsal() + "Demarcarion" + futbolista.getDemarcacion());
        futbolista.concentrarse();
        futbolista.entrenar();
        futbolista.viajar();
        futbolista.jugarPartido();
    }
    
}
