/*
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece
una letra dada.
Input (Entrada):
Hola Informatorio Java 2020.
a

Output (Salida):
4

*/

package Ejercicios_level1;

import java.util.Scanner;

public class ejercicio9 {
    
    public static void main(String[]arg){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String texto = scan.nextLine();
        System.out.println("Ingrese caracter a buscar: ");
        String caracteraEncontrar = scan.nextLine();
        System.out.println("La cantidad de "+ " '" + caracteraEncontrar + "'"+ " encontradas en la frase");
        System.out.println(texto.split(caracteraEncontrar, -1).length-1);
        scan.close();
    }



}
