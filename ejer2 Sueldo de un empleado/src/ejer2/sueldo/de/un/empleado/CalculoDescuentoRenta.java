/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer2.sueldo.de.un.empleado;

/**
 *
 * @author Gustavo
 */
import java.util.Scanner;

public class CalculoDescuentoRenta {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario el sueldo del empleado
        System.out.print("Ingrese el sueldo del empleado: $");
        double sueldo = sc.nextDouble();
        
        // Calcular el monto a descontar en concepto de renta
        double descuento;
        
        if (sueldo < 500){
            descuento = sueldo *0.0;
        }else if (sueldo < 750){
        descuento = sueldo *0.05;
        }else{
            descuento = sueldo * 0.1;
        }
        
        // Mostrar el monto a descontar en concepto de renta
        System.out.println("El monto a descontar en concepto de renta es: $" + descuento);
        
        // Cerrar el objeto Scanner
        sc.close();
    }
}

