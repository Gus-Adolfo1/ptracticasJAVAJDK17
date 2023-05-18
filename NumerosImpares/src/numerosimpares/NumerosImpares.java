/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosimpares;

/**
 *
 * @author Gustavo
 */
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario un número entero positivo
        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();
        
        // Verificar si el número ingresado es positivo
        if (numero < 0) {
            System.out.println("El número ingresado no es válido.");
            // Cerrar el objeto Scanner
            sc.close();
            return;
        }
        
        // Mostrar los números impares entre 0 y el número ingresado
        System.out.println("Números impares entre 0 y " + numero + ":");
        for (int i = 1; i <= numero; i += 2) {
            System.out.println(i);
        }
        
        // Cerrar el objeto Scanner
        sc.close();
    }
}
