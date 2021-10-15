package Ejercicios_level1;

/*
Confeccionar un programa que dado un número entero como dato de entrada
imprima la secuencia de números (incrementos de 1) de la siguiente forma:
Input (Entrada):
5

Output (Salida):
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/
import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[] args){
        System.out.println("Ingrese un numero entero :  ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        
        for (int i=1; i <= numero; i++){

            for (int j=1;j <= i; j++){
                
                System.out.print(j);
        
        }
        System.out.println();

        }

    }
}
