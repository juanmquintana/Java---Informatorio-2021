/*
Se desea una aplicación que solicite 2 números enteros y realice la operación de 
multiplicación por sumas sucesivas (sin uso de librerías).
Input (Entrada):
2
3

Output (Salida):
2 x 3 = 6

*/

package Ejercicios_level1;

import java.util.Scanner;
public class ejercicio5 {

    public static void main(String[] args) {
        //Declaramos dos variables tipo entero.
        int m, n;
        //Utilizamos Scanner para capturar datos del teclado.
        Scanner num = new Scanner(System.in);
        //Solicitamos los datos.
        System.out.println("Introduce dos número enteros (m*n).");
        System.out.print("Introduce m: ");
        m = num.nextInt();
        System.out.print("Introduce n: ");
        n = num.nextInt();
        //Llamamos a la función que creamos, pasandole los dos parámetros.
        int multi = multi(m, n);
        //Imprimimos datos.
        System.out.println("La multiplicación ("+m+"*"+n+")= "+multi);
        num.close();
    }
    //Creamos la función con retorno tipo entero y dos parámetros.
    static int multi(int m, int n){
        int mul = 0;
        //Establecemos condición de que (m y n) no sean cero.
        if((m != 0) && (n != 0)){
            //Utilizamos un for para ejecutar el ciclo de sumas.
            for (int i = 0; i < n; i++) {
                // += representa (mul = mul + m), solo acorta lo anterior.
                mul += m;
            }
        }
        //Retornamos el resultado.
        //Si m o n es cero, retornará cero.
        return mul;
    }
    
}
