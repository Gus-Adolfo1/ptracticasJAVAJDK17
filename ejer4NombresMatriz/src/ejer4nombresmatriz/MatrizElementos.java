/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer4nombresmatriz;

/**
 *
 * @author Gustavo
 */
public class MatrizElementos {
    public static void main(String[] args) {
        // Definir la matriz de elementos químicos
        String[][] elementos = new String[4][4];
        
        // Almacenar los nombres de los elementos en la matriz
        elementos[0][0] = "Hidrógeno";
        elementos[0][1] = "Helio";
        elementos[0][2] = "Litio";
        elementos[0][3] = "Berilio";
        
        elementos[1][0] = "Boro";
        elementos[1][1] = "Carbono";
        elementos[1][2] = "Nitrógeno";
        elementos[1][3] = "Oxígeno";
        
        elementos[2][0] = "Flúor";
        elementos[2][1] = "Neón";
        elementos[2][2] = "Sodio";
        elementos[2][3] = "Magnesio";
        
        elementos[3][0] = "Aluminio";
        elementos[3][1] = "Silicio";
        elementos[3][2] = "Fósforo";
        elementos[3][3] = "Azufre";
        
        // Mostrar las filas y columnas con índices pares
        System.out.println("Contenido de las filas y columnas con índices pares:");
        for (int i = 0; i < elementos.length; i += 2) {
            for (int j = 0; j < elementos[i].length; j += 2) {
                System.out.print(elementos[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
