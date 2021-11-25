/*
Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando la operación
de factorial pero no se desean valores repetidos.
Input (Entrada)
List<Integer> palabras = List.of(1, 2, 4, 4, 4);
Output (Salida):
[1, 2, 24]
 */
package Complementarios3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 4, 4, 4);
        Set<Integer> numerosSinRepetir = new HashSet<>(numeros);
        List<Integer> factoriales = new ArrayList<>();
        for (Integer num : numerosSinRepetir) {
            factoriales.add(factorial(num));
        }
        System.out.println(factoriales);
    }
    private static int factorial(int n) {
        if (n <= 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
