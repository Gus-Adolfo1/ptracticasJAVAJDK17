/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class Main {

    
    public static void main(String[] args) {
        
      
        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean Seguir = true;

       
        while (Seguir) {
            System.out.println("Ingrese el ID del producto:");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Ingrese el nombre del producto:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese la marca del producto:");
            String marca = scanner.nextLine();

            System.out.println("Ingrese el precio del producto:");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 

            Producto producto = new Producto(id, nombre, marca, precio);
            productos.add(producto);
            scanner.nextLine();

            
            System.out.println("¿Desea registrar otro producto? (Si/No)");
            String opcion = scanner.nextLine();

            if (opcion.equalsIgnoreCase("No")) {
                Seguir = false;
            }
        }
        scanner.nextLine();

     
        System.out.println("Productos registrados:");
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            System.out.println("ID: " + producto.getId());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Marca: " + producto.getMarca());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println();
        }
    }
}
