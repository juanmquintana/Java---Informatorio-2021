/*
Dada una lista que contiene números enteros, se deberá generar otra lista que contendrá
el resultado de aplicar la operación de potencia a 2.
Input (Entrada):
List<Integer> palabras = List.of(1, 2, 3, 4, 5);
Output (Salida):
[1, 4, 9, 16, 25]
 */
package Complementarios3;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio2 {
    public static void main(String[] args) {
        List<Long> numeros = List.of(1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L);
        List<Long> potenciados = new ArrayList<>();
        for (Long num : numeros) {
            potenciados.add(num * num);
        }
        System.out.println(potenciados);
    }
}
