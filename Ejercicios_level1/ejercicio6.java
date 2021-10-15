/*
Se desea una aplicación que solicite 2 números enteros y realice la operación 
de potencia (sin uso de librerías).
Input (Entrada):
3
3

Output (Salida):
3 elevado a 3 = 27

*/


package Ejercicios_level1;
import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args){
        //Declaramos dos variables tipo entero.
        int numero, exponente;
        //Utilizamos Scanner para capturar datos del teclado.
        Scanner num = new Scanner(System.in);
        //Solicitamos los datos.
        System.out.println("Introduce dos número enteros para obtener la potencia");
        System.out.print("Introduce numero: ");
        numero = num.nextInt();
        System.out.print("Introduce exponente: ");
        exponente = num.nextInt();
        //Llamamos a la función que creamos, pasandole los dos parámetros.
        
        int resultado = potencia(numero, exponente);
        //Imprimimos datos.
        System.out.println("La potencia de "+numero+" elevado a "+exponente+" = "+resultado);
        num.close();
    }
    //Creamos la función con retorno tipo entero y dos parámetros.
    static int potencia(int m, int n){
        int pot = 1;
        //Establecemos condición de que (m y n) no sean cero.
        if((m != 0) && (n != 0)){
            //Utilizamos un for para ejecutar el ciclo de sumas.
            for (int i = 1; i <= n; i++) {
                // 
                pot=pot*m;
            }
        }
        //Retornamos el resultado.
        //Si m o n es cero, retornará cero.
        return pot;



    }
    
}
