/*
Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero
al principio de la lista y otro al final. Por último, iterar e imprimir
los elementos de la lista y el tamaño de la misma (antes y después de agregar
a en la primera y última posición).

*/

import java.util.ArrayList;
import java.util.Scanner;
public class ejercicio2 {
    
    public static void main(String[]args){
        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        //numeros.add(7);
        //numeros.add(9);
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Numeros cargados en la lista: "+numeros.get(i));
        }
        System.out.println("Ingrese el numero entero a ingresar al comienzo: ");
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        int antesDeAgregarAlInicio = numeros.size();
        numeros.add(0,valor1);
        System.out.println("Ingrese el numero entero a ingresar al final: ");
        int valor2= scan.nextInt();
        numeros.add(valor2);
        int despuesDeAgregarAlInicio = numeros.size();
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Numeros cargados en la lista: "+numeros.get(i));
        }
        System.out.println("Cantidad de numeros en la lista antes de agregar uno al inicio: "+antesDeAgregarAlInicio);
        System.out.println("Cantidad de numeros en la lista despues de agregar uno al final: "+despuesDeAgregarAlInicio);
        
    }
}
