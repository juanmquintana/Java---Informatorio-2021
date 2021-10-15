/*
Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
Input (Entrada):
5

Output (Salida):
El factorial de 5 es: 120


*/

package Ejercicios_level1;

import java.util.Scanner;

public class ejercicio4 {
    
    public static void main(String[] args) {
        int N;
        double factorial;
        Scanner sc = new Scanner(System.in);
       
        //Leer un número entero >= 0
        do{
            System.out.print("Introduce un número > 0: ");
            N = sc.nextInt();
        }while(N<0);

        for(int i = 0; i <= N ; i++){ //para cada número desde 1 hasta N                                               
           
            //se calcula su factorial
            factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial = factorial * j;
            }

            //se muestra el factorial
            System.out.printf("%2d! = %.0f %n", i, factorial);

        }
    }
}
