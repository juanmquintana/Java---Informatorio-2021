/*
Realizar un programa que dado un String de entrada en minúsculas lo convierta
por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
Input (Entrada):
informatorio

Output (Salida):
INFORMATORIO

*/

package Ejercicios_level1;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args){
        //Declaramos una variables tipo String.
        String palabramin;
        //Utilizamos Scanner para capturar datos del teclado.
        Scanner pal = new Scanner(System.in);
        //Solicitamos la palabra.
        System.out.println("Introduce palabra en minuscula : ");
        
        palabramin = pal.next();
        //Llamamos a la función que creamos, pasandole los dos parámetros.
        
        String palabramay = convierte(palabramin);
        //Imprimimos datos.
        System.out.println("La palabra "+palabramin+" se convirtio a "+palabramay);
        pal.close();
    }
    //Creamos la función con retorno tipo String y un parametro.
    static String convierte(String m){
        //int pot = 1;
            String nuevapalabra = "";
            //Utilizamos un for 
            for (int i = 0; i <m.length(); i++) {
                // 
                char ch=m.charAt(i);
                if (ch>=97&&ch<122) // son minusculas
                {
                    ch=(char) ((ch-32));

                }
                nuevapalabra = nuevapalabra + ch;
                
               
            }
            
            
        //Retornamos el resultado.
        //Si m o n es cero, retornará cero.
        return nuevapalabra;
    }
}
