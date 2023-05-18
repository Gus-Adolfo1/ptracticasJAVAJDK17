/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package puntospartido;

/**
 *
 * @author Gustavo
 */
import java.util.Scanner;

public class PuntosEquipo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        
        // Solicitar al usuario el número de partidos ganados, empatados y perdidos
        System.out.print("Ingrese el número de partidos ganados: ");
        int partidosGanados = sc.nextInt();
        
        System.out.print("Ingrese el número de partidos empatados: ");
        int partidosEmpatados = sc.nextInt();
        
        System.out.print("Ingrese el número de partidos perdidos: ");
        int partidosPerdidos = sc.nextInt();
        
        // Calcular la cantidad de puntos obtenidos
        int puntos = (partidosGanados * 3) + partidosEmpatados;
        
        // Mostrar la cantidad de puntos obtenidos
        System.out.println("El equipo ha obtenido " + puntos + " puntos.");
        
        // Cerrar el objeto Scanner
        sc.close();
    }
}
