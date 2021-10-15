/*
Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un 
array de Strings. Con la secuencia de números enteros de principio a final. 
Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” y 
si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor 
debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
Input (Entrada):
fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
fizzBuzzFuncion(1,8)

Output (Salida):
[“1”, “Fizz”, “Buzz”, “Fizz”, 5]
[“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]


*/
package Ejercicios_level2;
import java.util.*;
//import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int num1;
        int num2;
        ArrayList<String> sumaTotal = new ArrayList();
        Scanner numIngresado = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        num1 = numIngresado.nextInt();
        numIngresado.nextLine();
        System.out.println("Ingrese el segundo valor, debe ser mayor que el primero: ");
        num2 = numIngresado.nextInt();
        numIngresado.nextLine();

        for (int i = num1; i < num2; i++) {
            if (num1 % 2 == 0 && num1 % 3 == 0) {
                sumaTotal.add(i + ". FizzBuzz");
            } else if (num1 % 3 == 0) {
                sumaTotal.add(i + ". Buzz");
            } else if (num1 % 2 == 0) {
                sumaTotal.add(i + ". Fizz");
            } else {
                System.out.println("Numero no multiplo de 2 ni de 3");
            }

        }
        for (int j = 0; j < sumaTotal.size(); j++) {
            System.out.println(sumaTotal.get(j));

        }
    }
}
