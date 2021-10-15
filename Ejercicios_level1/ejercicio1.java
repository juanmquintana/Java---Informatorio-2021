/*
Solicitar por consola el nombre del usuario e imprimir por pantalla el 
siguiente mensaje “HOLA {USUARIO}!!!”
Input (Entrada):
Obi Wan Kenobi

Output (Salida):
HOLA Obi Wan Kenobi

*/


package Ejercicios_level1;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        System.out.println("Ingrese nombre de usuario: ");
        Scanner scan = new Scanner(System.in);
        String usuario = scan.next();
        System.out.println("HOLA " + usuario + "!!!");
        scan.close();
    }
}
