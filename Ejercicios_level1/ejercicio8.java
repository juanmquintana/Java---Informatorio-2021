/*
Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
Input (Entrada):
Homero Simpson
48
Calle Falsa 1234
Springfield

Output (Salida):
Springfield - Calle Falsa 1234 - 48 - Homero Simpson

*/
package Ejercicios_level1;

import java.util.Scanner;

public class ejercicio8 {
   public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un nombre: ");
        String nombre = scan.nextLine();
        System.out.println("Ingrese su edad: ");
        byte edad = scan.nextByte();
        scan.nextLine();
        System.out.println("¿Ingrese la direccion : ");
        String direccion = scan.nextLine();
        System.out.println("Ingrese la localidad: ");
        String localidad = scan.nextLine();
        scan.close();
        System.out.println(localidad + " - " + direccion + " - " + edad + " - " + nombre);
    }
}
