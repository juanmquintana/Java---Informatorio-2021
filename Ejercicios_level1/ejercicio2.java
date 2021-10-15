/*
Realizar un programa que solicite por consola 2 números enteros. 
Para luego imprimir el resultado de la suma, resta, multiplicación,
división y módulo (resto de la división) de ambos números.
Input (Entrada):
5
4

Output (Salida):
5 + 4 = 9
5 - 4 = 1
5 * 4 = 20
5 / 4 = 1
5 % 4 = 1
*/

package Ejercicios_level1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        System.out.println("Ingrese el primer numero entero: ");
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int valor2 = scan.nextInt();
        System.out.println("La suma de " + valor1 +  " + " + valor2 + " = " + (valor1+valor2));
        System.out.println("La resta de " + valor1 +  " - " + valor2 + " = " + (valor1-valor2));
        System.out.println("La multiplicacion de " + valor1 +  " * " + valor2 + " = " + (valor1*valor2));
        System.out.println("La division de " + valor1 +  " / " + valor2 + " = " + (valor1/valor2));
        System.out.println("El modulo del " + valor1 +  " % " + valor2 + " = " + (valor1%valor2));
        scan.close();


            }
}


